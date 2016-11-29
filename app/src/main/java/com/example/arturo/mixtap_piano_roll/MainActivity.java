package com.example.arturo.mixtap_piano_roll;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private NoteStructure[][] notes = new NoteStructure[12][8];
    private MeasureStructure measure = new MeasureStructure();

    private MediaPlayer mPlayer;

    private ImageButton b, a_sharp, a, g_sharp, g, f_sharp, f, e, d_sharp, d, c_sharp, c;
    private ImageButton[][] rollImages = new ImageButton[12][8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupNotes();
        setupButtons();
    }

    private void setupNotes(){
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 8; j++){
                notes[i][j] = new NoteStructure(i, j);
            }
        }
    }

    private void setupButtons(){
        //piano keys
        b = (ImageButton)findViewById(R.id.b);
        a_sharp = (ImageButton)findViewById(R.id.a_sharp);
        a = (ImageButton)findViewById(R.id.a);
        g_sharp = (ImageButton)findViewById(R.id.g_sharp);
        g = (ImageButton)findViewById(R.id.g);
        f_sharp = (ImageButton)findViewById(R.id.f_sharp);
        f = (ImageButton)findViewById(R.id.f);
        e = (ImageButton)findViewById(R.id.e);
        d_sharp = (ImageButton)findViewById(R.id.d_sharp);
        d = (ImageButton)findViewById(R.id.d);
        c_sharp = (ImageButton)findViewById(R.id.c_sharp);
        c = (ImageButton)findViewById(R.id.c);


        //roll
        rollImages[0][0] = (ImageButton)findViewById(R.id.r0c0);
        rollImages[0][1] = (ImageButton)findViewById(R.id.r0c1);
        rollImages[0][2] = (ImageButton)findViewById(R.id.r0c2);
        rollImages[0][3] = (ImageButton)findViewById(R.id.r0c3);
        rollImages[0][4] = (ImageButton)findViewById(R.id.r0c4);
        rollImages[0][5] = (ImageButton)findViewById(R.id.r0c5);
        rollImages[0][6] = (ImageButton)findViewById(R.id.r0c6);
        rollImages[0][7] = (ImageButton)findViewById(R.id.r0c7);

        rollImages[1][0] = (ImageButton)findViewById(R.id.r1c0);
        rollImages[1][1] = (ImageButton)findViewById(R.id.r1c1);
        rollImages[1][2] = (ImageButton)findViewById(R.id.r1c2);
        rollImages[1][3] = (ImageButton)findViewById(R.id.r1c3);
        rollImages[1][4] = (ImageButton)findViewById(R.id.r1c4);
        rollImages[1][5] = (ImageButton)findViewById(R.id.r1c5);
        rollImages[1][6] = (ImageButton)findViewById(R.id.r1c6);
        rollImages[1][7] = (ImageButton)findViewById(R.id.r1c7);

        rollImages[2][0] = (ImageButton)findViewById(R.id.r2c0);
        rollImages[2][1] = (ImageButton)findViewById(R.id.r2c1);
        rollImages[2][2] = (ImageButton)findViewById(R.id.r2c2);
        rollImages[2][3] = (ImageButton)findViewById(R.id.r2c3);
        rollImages[2][4] = (ImageButton)findViewById(R.id.r2c4);
        rollImages[2][5] = (ImageButton)findViewById(R.id.r2c5);
        rollImages[2][6] = (ImageButton)findViewById(R.id.r2c6);
        rollImages[2][7] = (ImageButton)findViewById(R.id.r2c7);

        rollImages[3][0] = (ImageButton)findViewById(R.id.r3c0);
        rollImages[3][1] = (ImageButton)findViewById(R.id.r3c1);
        rollImages[3][2] = (ImageButton)findViewById(R.id.r3c2);
        rollImages[3][3] = (ImageButton)findViewById(R.id.r3c3);
        rollImages[3][4] = (ImageButton)findViewById(R.id.r3c4);
        rollImages[3][5] = (ImageButton)findViewById(R.id.r3c5);
        rollImages[3][6] = (ImageButton)findViewById(R.id.r3c6);
        rollImages[3][7] = (ImageButton)findViewById(R.id.r3c7);

        rollImages[4][0] = (ImageButton)findViewById(R.id.r4c0);
        rollImages[4][1] = (ImageButton)findViewById(R.id.r4c1);
        rollImages[4][2] = (ImageButton)findViewById(R.id.r4c2);
        rollImages[4][3] = (ImageButton)findViewById(R.id.r4c3);
        rollImages[4][4] = (ImageButton)findViewById(R.id.r4c4);
        rollImages[4][5] = (ImageButton)findViewById(R.id.r4c5);
        rollImages[4][6] = (ImageButton)findViewById(R.id.r4c6);
        rollImages[4][7] = (ImageButton)findViewById(R.id.r4c7);

        rollImages[5][0] = (ImageButton)findViewById(R.id.r5c0);
        rollImages[5][1] = (ImageButton)findViewById(R.id.r5c1);
        rollImages[5][2] = (ImageButton)findViewById(R.id.r5c2);
        rollImages[5][3] = (ImageButton)findViewById(R.id.r5c3);
        rollImages[5][4] = (ImageButton)findViewById(R.id.r5c4);
        rollImages[5][5] = (ImageButton)findViewById(R.id.r5c5);
        rollImages[5][6] = (ImageButton)findViewById(R.id.r5c6);
        rollImages[5][7] = (ImageButton)findViewById(R.id.r5c7);

        rollImages[6][0] = (ImageButton)findViewById(R.id.r6c0);
        rollImages[6][1] = (ImageButton)findViewById(R.id.r6c1);
        rollImages[6][2] = (ImageButton)findViewById(R.id.r6c2);
        rollImages[6][3] = (ImageButton)findViewById(R.id.r6c3);
        rollImages[6][4] = (ImageButton)findViewById(R.id.r6c4);
        rollImages[6][5] = (ImageButton)findViewById(R.id.r6c5);
        rollImages[6][6] = (ImageButton)findViewById(R.id.r6c6);
        rollImages[6][7] = (ImageButton)findViewById(R.id.r6c7);

        rollImages[7][0] = (ImageButton)findViewById(R.id.r7c0);
        rollImages[7][1] = (ImageButton)findViewById(R.id.r7c1);
        rollImages[7][2] = (ImageButton)findViewById(R.id.r7c2);
        rollImages[7][3] = (ImageButton)findViewById(R.id.r7c3);
        rollImages[7][4] = (ImageButton)findViewById(R.id.r7c4);
        rollImages[7][5] = (ImageButton)findViewById(R.id.r7c5);
        rollImages[7][6] = (ImageButton)findViewById(R.id.r7c6);
        rollImages[7][7] = (ImageButton)findViewById(R.id.r7c7);

        rollImages[8][0] = (ImageButton)findViewById(R.id.r8c0);
        rollImages[8][1] = (ImageButton)findViewById(R.id.r8c1);
        rollImages[8][2] = (ImageButton)findViewById(R.id.r8c2);
        rollImages[8][3] = (ImageButton)findViewById(R.id.r8c3);
        rollImages[8][4] = (ImageButton)findViewById(R.id.r8c4);
        rollImages[8][5] = (ImageButton)findViewById(R.id.r8c5);
        rollImages[8][6] = (ImageButton)findViewById(R.id.r8c6);
        rollImages[8][7] = (ImageButton)findViewById(R.id.r8c7);

        rollImages[9][0] = (ImageButton)findViewById(R.id.r9c0);
        rollImages[9][1] = (ImageButton)findViewById(R.id.r9c1);
        rollImages[9][2] = (ImageButton)findViewById(R.id.r9c2);
        rollImages[9][3] = (ImageButton)findViewById(R.id.r9c3);
        rollImages[9][4] = (ImageButton)findViewById(R.id.r9c4);
        rollImages[9][5] = (ImageButton)findViewById(R.id.r9c5);
        rollImages[9][6] = (ImageButton)findViewById(R.id.r9c6);
        rollImages[9][7] = (ImageButton)findViewById(R.id.r9c7);

        rollImages[10][0] = (ImageButton)findViewById(R.id.r10c0);
        rollImages[10][1] = (ImageButton)findViewById(R.id.r10c1);
        rollImages[10][2] = (ImageButton)findViewById(R.id.r10c2);
        rollImages[10][3] = (ImageButton)findViewById(R.id.r10c3);
        rollImages[10][4] = (ImageButton)findViewById(R.id.r10c4);
        rollImages[10][5] = (ImageButton)findViewById(R.id.r10c5);
        rollImages[10][6] = (ImageButton)findViewById(R.id.r10c6);
        rollImages[10][7] = (ImageButton)findViewById(R.id.r10c7);

        rollImages[11][0] = (ImageButton)findViewById(R.id.r11c0);
        rollImages[11][1] = (ImageButton)findViewById(R.id.r11c1);
        rollImages[11][2] = (ImageButton)findViewById(R.id.r11c2);
        rollImages[11][3] = (ImageButton)findViewById(R.id.r11c3);
        rollImages[11][4] = (ImageButton)findViewById(R.id.r11c4);
        rollImages[11][5] = (ImageButton)findViewById(R.id.r11c5);
        rollImages[11][6] = (ImageButton)findViewById(R.id.r11c6);
        rollImages[11][7] = (ImageButton)findViewById(R.id.r11c7);
    }

    private void roll(int pitch, int time){
        //save pitch and timing into data structure
        notes[pitch][time].switchNote();
        if(notes[pitch][time].isNoteSet())
            rollImages[pitch][time].setImageResource(R.drawable.selected_note);
        else
            rollImages[pitch][time].setImageResource(R.drawable.empty_note);
    }

    public void stop(){
        if(mPlayer == null)
            return;
        mPlayer.release();
        mPlayer = null;
    }

    private void playNote(int note){
        stop();
        switch(note){
            case 0:
                //b
                mPlayer = MediaPlayer.create(this, R.raw.b);
                break;
            case 1:
                //a#
                mPlayer = MediaPlayer.create(this, R.raw.a_s);
                break;
            case 2:
                //a
                mPlayer = MediaPlayer.create(this, R.raw.a);
                break;
            case 3:
                //g#
                mPlayer = MediaPlayer.create(this, R.raw.g_s);
                break;
            case 4:
                //g
                mPlayer = MediaPlayer.create(this, R.raw.g);
                break;
            case 5:
                //f#
                mPlayer = MediaPlayer.create(this, R.raw.f_s);
                break;
            case 6:
                //f
                mPlayer = MediaPlayer.create(this, R.raw.f);
                break;
            case 7:
                //e
                mPlayer = MediaPlayer.create(this, R.raw.e);
                break;
            case 8:
                //d#
                mPlayer = MediaPlayer.create(this, R.raw.d_s);
                break;
            case 9:
                //d
                mPlayer = MediaPlayer.create(this, R.raw.d);
                break;
            case 10:
                //c#
                mPlayer = MediaPlayer.create(this, R.raw.c_s);
                break;
            case 11:
                //c
                mPlayer = MediaPlayer.create(this, R.raw.c);
                break;
            default:
                return;
        }
        mPlayer.start();

    }

    public void playTrack(View v){
        //to do
    }

    public void bPiano(View v){
        playNote(0);
    }
    public void aSPiano(View v){
        playNote(1);
    }
    public void aPiano(View v){
        playNote(2);
    }
    public void gSPiano(View v){
        playNote(3);
    }
    public void gPiano(View v){
        playNote(4);
    }
    public void fSPiano(View v){
        playNote(5);
    }
    public void fPiano(View v){
        playNote(6);
    }
    public void ePiano(View v){
        playNote(7);
    }
    public void dSPiano(View v){
        playNote(8);
    }
    public void dPiano(View v){
        playNote(9);
    }
    public void cSPiano(View v){
        playNote(10);
    }
    public void cPiano(View v){
        playNote(11);
    }

    public void bRoll0(View v){
        playNote(0);
        roll(0, 0);
    }
    public void bRoll1(View v){
        playNote(0);
        roll(0, 1);
    }
    public void bRoll2(View v){
        playNote(0);
        roll(0, 2);
    }
    public void bRoll3(View v){
        playNote(0);
        roll(0, 3);
    }
    public void bRoll4(View v){
        playNote(0);
        roll(0, 4);
    }
    public void bRoll5(View v){
        playNote(0);
        roll(0, 5);
    }
    public void bRoll6(View v){
        playNote(0);
        roll(0, 6);
    }
    public void bRoll7(View v){
        playNote(0);
        roll(0, 7);
    }

    public void aSRoll0(View v){
        playNote(1);
        roll(1, 0);
    }
    public void aSRoll1(View v){
        playNote(1);
        roll(1, 1);
    }
    public void aSRoll2(View v){
        playNote(1);
        roll(1, 2);
    }
    public void aSRoll3(View v){
        playNote(1);
        roll(1, 3);
    }
    public void aSRoll4(View v){
        playNote(1);
        roll(1, 4);
    }
    public void aSRoll5(View v){
        playNote(1);
        roll(1, 5);
    }
    public void aSRoll6(View v){
        playNote(1);
        roll(1, 6);
    }
    public void aSRoll7(View v){
        playNote(1);
        roll(1, 7);
    }

    public void aRoll0(View v){
        playNote(2);
        roll(2, 0);
    }
    public void aRoll1(View v){
        playNote(2);
        roll(2, 1);
    }
    public void aRoll2(View v){
        playNote(2);
        roll(2, 2);
    }
    public void aRoll3(View v){
        playNote(2);
        roll(2, 3);
    }
    public void aRoll4(View v){
        playNote(2);
        roll(2, 4);
    }
    public void aRoll5(View v){
        playNote(2);
        roll(2, 5);
    }
    public void aRoll6(View v){
        playNote(2);
        roll(2, 6);
    }
    public void aRoll7(View v){
        playNote(2);
        roll(2, 7);
    }

    public void gSRoll0(View v){
        playNote(3);
        roll(3, 0);
    }
    public void gSRoll1(View v){
        playNote(3);
        roll(3, 1);
    }
    public void gSRoll2(View v){
        playNote(3);
        roll(3, 2);
    }
    public void gSRoll3(View v){
        playNote(3);
        roll(3, 3);
    }
    public void gSRoll4(View v){
        playNote(3);
        roll(3, 4);
    }
    public void gSRoll5(View v){
        playNote(3);
        roll(3, 5);
    }
    public void gSRoll6(View v){
        playNote(3);
        roll(3, 6);
    }
    public void gSRoll7(View v){
        playNote(3);
        roll(3, 7);
    }

    public void gRoll0(View v){
        playNote(4);
        roll(4, 0);
    }
    public void gRoll1(View v){
        playNote(4);
        roll(4, 1);
    }
    public void gRoll2(View v){
        playNote(4);
        roll(4, 2);
    }
    public void gRoll3(View v){
        playNote(4);
        roll(4, 3);
    }
    public void gRoll4(View v){
        playNote(4);
        roll(4, 4);
    }
    public void gRoll5(View v){
        playNote(4);
        roll(4, 5);
    }
    public void gRoll6(View v){
        playNote(4);
        roll(4, 6);
    }
    public void gRoll7(View v){
        playNote(4);
        roll(4, 7);
    }

    public void fSRoll0(View v){
        playNote(5);
        roll(5, 0);
    }
    public void fSRoll1(View v){
        playNote(5);
        roll(5, 1);
    }
    public void fSRoll2(View v){
        playNote(5);
        roll(5, 2);
    }
    public void fSRoll3(View v){
        playNote(5);
        roll(5, 3);
    }
    public void fSRoll4(View v){
        playNote(5);
        roll(5, 4);
    }
    public void fSRoll5(View v){
        playNote(5);
        roll(5, 5);
    }
    public void fSRoll6(View v){
        playNote(5);
        roll(5, 6);
    }
    public void fSRoll7(View v){
        playNote(5);
        roll(5, 7);
    }

    public void fRoll0(View v){
        playNote(6);
        roll(6, 0);
    }
    public void fRoll1(View v){
        playNote(6);
        roll(6, 1);
    }
    public void fRoll2(View v){
        playNote(6);
        roll(6, 2);
    }
    public void fRoll3(View v){
        playNote(6);
        roll(6, 3);
    }
    public void fRoll4(View v){
        playNote(6);
        roll(6, 4);
    }
    public void fRoll5(View v){
        playNote(6);
        roll(6, 5);
    }
    public void fRoll6(View v){
        playNote(6);
        roll(6, 6);
    }
    public void fRoll7(View v){
        playNote(6);
        roll(6, 7);
    }

    public void eRoll0(View v){
        playNote(7);
        roll(7, 0);
    }
    public void eRoll1(View v){
        playNote(7);
        roll(7, 1);
    }
    public void eRoll2(View v){
        playNote(7);
        roll(7, 2);
    }
    public void eRoll3(View v){
        playNote(7);
        roll(7, 3);
    }
    public void eRoll4(View v){
        playNote(7);
        roll(7, 4);
    }
    public void eRoll5(View v){
        playNote(7);
        roll(7, 5);
    }
    public void eRoll6(View v){
        playNote(7);
        roll(7, 6);
    }
    public void eRoll7(View v){
        playNote(7);
        roll(7, 7);
    }

    public void dSRoll0(View v){
        playNote(8);
        roll(8, 0);
    }
    public void dSRoll1(View v){
        playNote(8);
        roll(8, 1);
    }
    public void dSRoll2(View v){
        playNote(8);
        roll(8, 2);
    }
    public void dSRoll3(View v){
        playNote(8);
        roll(8, 3);
    }
    public void dSRoll4(View v){
        playNote(8);
        roll(8, 4);
    }
    public void dSRoll5(View v){
        playNote(8);
        roll(8, 5);
    }
    public void dSRoll6(View v){
        playNote(8);
        roll(8, 6);
    }
    public void dSRoll7(View v){
        playNote(8);
        roll(8, 7);
    }

    public void dRoll0(View v){
        playNote(9);
        roll(9, 0);
    }
    public void dRoll1(View v){
        playNote(9);
        roll(9, 1);
    }
    public void dRoll2(View v){
        playNote(9);
        roll(9, 2);
    }
    public void dRoll3(View v){
        playNote(9);
        roll(9, 3);
    }
    public void dRoll4(View v){
        playNote(9);
        roll(9, 4);
    }
    public void dRoll5(View v){
        playNote(9);
        roll(9, 5);
    }
    public void dRoll6(View v){
        playNote(9);
        roll(9, 6);
    }
    public void dRoll7(View v){
        playNote(9);
        roll(9, 7);
    }

    public void cSRoll0(View v){
        playNote(10);
        roll(10, 0);
    }
    public void cSRoll1(View v){
        playNote(10);
        roll(10, 1);
    }
    public void cSRoll2(View v){
        playNote(10);
        roll(10, 2);
    }
    public void cSRoll3(View v){
        playNote(10);
        roll(10, 3);
    }
    public void cSRoll4(View v){
        playNote(10);
        roll(10, 4);
    }
    public void cSRoll5(View v){
        playNote(10);
        roll(10, 5);
    }
    public void cSRoll6(View v){
        playNote(10);
        roll(10, 6);
    }
    public void cSRoll7(View v){
        playNote(10);
        roll(10, 7);
    }

    public void cRoll0(View v){
        playNote(11);
        roll(11, 0);
    }
    public void cRoll1(View v){
        playNote(11);
        roll(11, 1);
    }
    public void cRoll2(View v){
        playNote(11);
        roll(11, 2);
    }
    public void cRoll3(View v){
        playNote(11);
        roll(11, 3);
    }
    public void cRoll4(View v){
        playNote(11);
        roll(11, 4);
    }
    public void cRoll5(View v){
        playNote(11);
        roll(11, 5);
    }
    public void cRoll6(View v){
        playNote(11);
        roll(11, 6);
    }
    public void cRoll7(View v){
        playNote(11);
        roll(11, 7);
    }

}
