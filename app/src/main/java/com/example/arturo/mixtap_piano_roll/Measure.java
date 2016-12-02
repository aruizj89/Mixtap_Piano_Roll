package com.example.arturo.mixtap_piano_roll;


import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;


/**
 * Created by Jose Ortiz. Modified on 11/30/2016 by Jose Ortiz
 */

/* Measure is a class that extends from View. It is responsible for making a View of a measure,
   Being able to calculate it's own measurements and draw itself.
   As of now, notes are drawn within this class. This class also holds a data structure defining
   the note head, and stems position within the measure.

   Measure Width: 360px
   Measure Height: 120px
   Note Interval on Y axis (of measure): 20px
   Note Interval on X axis (of measure): measureWidth/4 + padding
*/

public class Measure extends View {
    private Paint doodle= new Paint(); // paint object used to define attributes of a canvas
    private Path path = new Path(); // Path is used for drawing strokes (not used in real project)

    private Resources res = getResources(); // This is used to grab all resources from project. This includes drawables
    private Bitmap MeasureBitmap = BitmapFactory.decodeResource(res, R.drawable.measure); // This bitmap takes the Measure Drawable
    private Bitmap NoteBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.note_head); // This bitmap takes a Note Head Drawable
    private Bitmap LeftStemBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.stem_left); // This bitmap takes a left Note Stem Drawable
    private Bitmap RightStemBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.stem_right); // This bitmap takes a Right Note Stem Drawable
    private Bitmap QuaterRestBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.quarter_rest); // This bitmap takes a Right Note Stem Drawable

    private int MeasureBitmapWidth = MeasureBitmap.getWidth(); // This is used as a counter to know the total width of all measures as the measures increase
    private int MeasureBitmapHeight = MeasureBitmap.getHeight(); // This is the height of a single measure
    private int singleMeasureBitmapWidth = MeasureBitmap.getWidth(); // This is the width of a single measure
    private int currentPosition= 0; // currentPosition is used to keep track of what is the current measure the user is working with
    private int notes[]= {-1, -1, -1, -1, -1, -1, -1, -1}; // This is the main array of which the positions of each note is stored. This is initialized to -1 to represent no Note entered

    /* The following 3 methods are standard constructors for a View class */
    public Measure(Context context) {
        super(context);
        init(null, 0); // init is used to initialize attributes
    }

    public Measure(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public Measure(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, defStyleAttr);
    }

    // init is used to initialize attributes
    private void init(AttributeSet attrs, int defStyleAttr) {
        doodle.setColor(Color.BLACK);
        doodle.setAntiAlias(true);
        doodle.setStyle(Paint.Style.STROKE);
        doodle.setStrokeWidth(2.0f);
    }

    // onMeasure is a method from the View Class that defines a views measurements We use this to make the View the exact size of a Measure.
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //super.onMeasure(widthMeasureSpec,heightMeasureSpec);
        int desiredWidth = MeasureBitmapWidth;
        int desiredHeight = MeasureBitmapHeight;

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        int width;
        int height;

        //Measure Width
        if (widthMode == MeasureSpec.EXACTLY) {
            //Must be this size
            width = widthSize;
        } else if (widthMode == MeasureSpec.AT_MOST) {
            //Can't be bigger than...
            width = Math.min(desiredWidth, widthSize);
        } else {
            //Be whatever you want
            width = desiredWidth;
        }

        //Measure Height
        if (heightMode == MeasureSpec.EXACTLY) {
            //Must be this size
            height = heightSize;
        } else if (heightMode == MeasureSpec.AT_MOST) {
            //Can't be bigger than...
            height = Math.min(desiredHeight, heightSize);
        } else {
            //Be whatever you want
            height = desiredHeight;
        }

        //MUST CALL THIS
        setMeasuredDimension(width, height);
    }

    // onDraw is a method from the View Class in which updates the view canvas
    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawPath(path, doodle); //This is the drawing tool, used for debugging only
        addNotes(canvas, notes); //This is the main method that updates the Notes that are drawn on the View

    }

    //This is the main method that takes in a Canvas (to draw notes to) and an array that has note head/note stem position data
    public void addNotes(Canvas canvas, int notePosition[]){
        //This draws a single Measure
        canvas.drawBitmap(MeasureBitmap, currentPosition, 0, doodle);
        int j= singleMeasureBitmapWidth/4;  // This is the space between each note
        int noteCounterPerMeasure=1;
        /* This loops throught the array and add the note to the appropriate position in the measure */
        for(int i = 0; i < 8; i++) {
            if(noteCounterPerMeasure==4){
                MeasureBitmapWidth += singleMeasureBitmapWidth; //This is incrementing the Views width as needed
                //currentPosition+= singleMeasureBitmapWidth;
                canvas.drawBitmap(MeasureBitmap, singleMeasureBitmapWidth, 0, doodle);
                noteCounterPerMeasure=1;
            }

            if(notePosition[i]<0) {  // If the element contains negative numbers, this means that there is no note to be displayed
                canvas.drawBitmap(QuaterRestBitmap, (j * i) + (j / 2),0, doodle);   // draws note stem
                continue;
            }
            else {
                canvas.drawBitmap(NoteBitmap, (j * i) + (j / 2), notePosition[i], doodle); // This creates the Note Head

                if(notePosition[i]>=120)   // Position 120 is the A note, so if it is below the A note on the Measure, it draws a stem on the right side of the note head
                    canvas.drawBitmap(RightStemBitmap, (j * i) + (j / 2),(notePosition[i] -(RightStemBitmap.getHeight())) + (NoteBitmap.getHeight()/2), doodle);   // draws note stem
                else
                    canvas.drawBitmap(LeftStemBitmap, (j * i) + (j / 2), notePosition[i] + (NoteBitmap.getWidth()/2), doodle);    // if note head is above the B note, it draws a left note stem
                noteCounterPerMeasure++;
            }

        }

    }

    /* Functin in progress. To add measure */
    public void addMeasure(){
        Canvas canvas = new Canvas();
        canvas.drawBitmap(MeasureBitmap, currentPosition*singleMeasureBitmapWidth, 0, doodle);
        MeasureBitmapWidth = MeasureBitmapWidth + singleMeasureBitmapWidth;
        currentPosition++;
    }

    // this is a mutator function to change the note position array. This is structure that piano roll uses to change the notes.
    public void setNotes(int notePosition[]){
        for(int i= 0; i<notePosition.length; i++){
            notes[i]= notePosition[i];
        }
    }

    /*
        ********************* FOR DEBUGGING PURPOSES ONLY *********************
        This whole method is to track the position of path. then draws the line
    */
    @Override
    public boolean onTouchEvent(MotionEvent motionEvent){
        float x= motionEvent.getX();
        float y= motionEvent.getY();

        switch (motionEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                path.moveTo(x,y);
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(x,y);
                break;
        }
        super.onTouchEvent(motionEvent);
        invalidate();
        return  true;
    }
}
