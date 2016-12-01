package com.example.arturo.mixtap_piano_roll;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private NoteStructure[][] notes = new NoteStructure[18][8];
    private MeasureStructure measure = new MeasureStructure();

    private MediaPlayer mPlayer;

    private ImageButton b, a_sharp, a, g_sharp, g, f_sharp, f, e, d_sharp, d, c_sharp, c;
    private ImageButton[][] rollImages = new ImageButton[18][8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupNotes();
        setupButtons();
    }

    private void setupNotes(){
        for(int i = 0; i < 18; i++){
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

        rollImages[12][0] = (ImageButton)findViewById(R.id.r12c0);
        rollImages[12][1] = (ImageButton)findViewById(R.id.r12c1);
        rollImages[12][2] = (ImageButton)findViewById(R.id.r12c2);
        rollImages[12][3] = (ImageButton)findViewById(R.id.r12c3);
        rollImages[12][4] = (ImageButton)findViewById(R.id.r12c4);
        rollImages[12][5] = (ImageButton)findViewById(R.id.r12c5);
        rollImages[12][6] = (ImageButton)findViewById(R.id.r12c6);
        rollImages[12][7] = (ImageButton)findViewById(R.id.r12c7);

        rollImages[13][0] = (ImageButton)findViewById(R.id.r13c0);
        rollImages[13][1] = (ImageButton)findViewById(R.id.r13c1);
        rollImages[13][2] = (ImageButton)findViewById(R.id.r13c2);
        rollImages[13][3] = (ImageButton)findViewById(R.id.r13c3);
        rollImages[13][4] = (ImageButton)findViewById(R.id.r13c4);
        rollImages[13][5] = (ImageButton)findViewById(R.id.r13c5);
        rollImages[13][6] = (ImageButton)findViewById(R.id.r13c6);
        rollImages[13][7] = (ImageButton)findViewById(R.id.r13c7);

        rollImages[14][0] = (ImageButton)findViewById(R.id.r14c0);
        rollImages[14][1] = (ImageButton)findViewById(R.id.r14c1);
        rollImages[14][2] = (ImageButton)findViewById(R.id.r14c2);
        rollImages[14][3] = (ImageButton)findViewById(R.id.r14c3);
        rollImages[14][4] = (ImageButton)findViewById(R.id.r14c4);
        rollImages[14][5] = (ImageButton)findViewById(R.id.r14c5);
        rollImages[14][6] = (ImageButton)findViewById(R.id.r14c6);
        rollImages[14][7] = (ImageButton)findViewById(R.id.r14c7);

        rollImages[15][0] = (ImageButton)findViewById(R.id.r15c0);
        rollImages[15][1] = (ImageButton)findViewById(R.id.r15c1);
        rollImages[15][2] = (ImageButton)findViewById(R.id.r15c2);
        rollImages[15][3] = (ImageButton)findViewById(R.id.r15c3);
        rollImages[15][4] = (ImageButton)findViewById(R.id.r15c4);
        rollImages[15][5] = (ImageButton)findViewById(R.id.r15c5);
        rollImages[15][6] = (ImageButton)findViewById(R.id.r15c6);
        rollImages[15][7] = (ImageButton)findViewById(R.id.r15c7);

        rollImages[16][0] = (ImageButton)findViewById(R.id.r16c0);
        rollImages[16][1] = (ImageButton)findViewById(R.id.r16c1);
        rollImages[16][2] = (ImageButton)findViewById(R.id.r16c2);
        rollImages[16][3] = (ImageButton)findViewById(R.id.r16c3);
        rollImages[16][4] = (ImageButton)findViewById(R.id.r16c4);
        rollImages[16][5] = (ImageButton)findViewById(R.id.r16c5);
        rollImages[16][6] = (ImageButton)findViewById(R.id.r16c6);
        rollImages[16][7] = (ImageButton)findViewById(R.id.r16c7);

        rollImages[17][0] = (ImageButton)findViewById(R.id.r17c0);
        rollImages[17][1] = (ImageButton)findViewById(R.id.r17c1);
        rollImages[17][2] = (ImageButton)findViewById(R.id.r17c2);
        rollImages[17][3] = (ImageButton)findViewById(R.id.r17c3);
        rollImages[17][4] = (ImageButton)findViewById(R.id.r17c4);
        rollImages[17][5] = (ImageButton)findViewById(R.id.r17c5);
        rollImages[17][6] = (ImageButton)findViewById(R.id.r17c6);
        rollImages[17][7] = (ImageButton)findViewById(R.id.r17c7);
    }


    private void roll(int pitch, int time){
        //save pitch and timing into data structure
        notes[pitch][time].switchNote();
        measure.setNote(time, pitch);

        //clears note if previously selected in time slot
        for(int i = 0; i < 18; i++){
            if(i == pitch) continue;
            rollImages[i][time].setImageResource(R.drawable.empty_note);
            if(notes[i][time].isNoteSet()) notes[i][time].switchNote();
        }

        //highlights selected note
        if(notes[pitch][time].isNoteSet())
            rollImages[pitch][time].setImageResource(R.drawable.selected_note);
        else
            rollImages[pitch][time].setImageResource(R.drawable.empty_note);
    }

    private void stop(){
        if(mPlayer == null)
            return;
        mPlayer.release();
        mPlayer = null;
    }

    private void setMediaPlayer(int note){
        switch(note){
            case 0:
                //g high
                mPlayer = MediaPlayer.create(this, R.raw.g_high);
                break;
            case 1:
                //f# high
                mPlayer = MediaPlayer.create(this, R.raw.f_s_high);
                break;
            case 2:
                //f high
                mPlayer = MediaPlayer.create(this, R.raw.f_high);
                break;
            case 3:
                //e high
                mPlayer = MediaPlayer.create(this, R.raw.e_high);
                break;
            case 4:
                //d# high
                mPlayer = MediaPlayer.create(this, R.raw.d_s_high);
                break;
            case 5:
                //d high
                mPlayer = MediaPlayer.create(this, R.raw.d_high);
                break;
            case 6:
                //c#
                mPlayer = MediaPlayer.create(this, R.raw.c_s);
                break;
            case 7:
                //c
                mPlayer = MediaPlayer.create(this, R.raw.c);
                break;
            case 8:
                //b
                mPlayer = MediaPlayer.create(this, R.raw.b);
                break;
            case 9:
                //a#
                mPlayer = MediaPlayer.create(this, R.raw.a_s);
                break;
            case 10:
                //a
                mPlayer = MediaPlayer.create(this, R.raw.a);
                break;
            case 11:
                //g#
                mPlayer = MediaPlayer.create(this, R.raw.g_s);
                break;
            case 12:
                //g
                mPlayer = MediaPlayer.create(this, R.raw.g);
                break;
            case 13:
                //f#
                mPlayer = MediaPlayer.create(this, R.raw.f_s);
                break;
            case 14:
                //f
                mPlayer = MediaPlayer.create(this, R.raw.f);
                break;
            case 15:
                //e
                mPlayer = MediaPlayer.create(this, R.raw.e);
                break;
            case 16:
                //d#
                mPlayer = MediaPlayer.create(this, R.raw.d_s);
                break;
            case 17:
                //d
                mPlayer = MediaPlayer.create(this, R.raw.d);
                break;
            default:
                break;
        }
    }

    private void playNote(int note){
        stop();
        setMediaPlayer(note);
        mPlayer.start();

    }

    public void playTrack(View v){
        //to do

    }

    //piano key button functions
    public void gHPiano(View v){
        playNote(0);
    }
    public void fSHPiano(View v){
        playNote(1);
    }
    public void fHPiano(View v){
        playNote(2);
    }
    public void eHPiano(View v){
        playNote(3);
    }
    public void dSHPiano(View v){
        playNote(4);
    }
    public void dHPiano(View v){
        playNote(5);
    }
    public void cSPiano(View v){
        playNote(6);
    }
    public void cPiano(View v){
        playNote(7);
    }
    public void bPiano(View v){
        playNote(8);
    }
    public void aSPiano(View v){
        playNote(9);
    }
    public void aPiano(View v){
        playNote(10);
    }
    public void gSPiano(View v){
        playNote(11);
    }
    public void gPiano(View v){
        playNote(12);
    }
    public void fSPiano(View v){
        playNote(13);
    }
    public void fPiano(View v){
        playNote(14);
    }
    public void ePiano(View v){
        playNote(15);
    }
    public void dSPiano(View v){
        playNote(16);
    }
    public void dPiano(View v){
        playNote(17);
    }


    //piano roll button functions
    public void gHighRoll0(View v){
        playNote(0);
        roll(0, 0);
    }
    public void gHighRoll1(View v){
        playNote(0);
        roll(0, 1);
    }
    public void gHighRoll2(View v){
        playNote(0);
        roll(0, 2);
    }
    public void gHighRoll3(View v){
        playNote(0);
        roll(0, 3);
    }
    public void gHighRoll4(View v){
        playNote(0);
        roll(0, 4);
    }
    public void gHighRoll5(View v){
        playNote(0);
        roll(0, 5);
    }
    public void gHighRoll6(View v){
        playNote(0);
        roll(0, 6);
    }
    public void gHighRoll7(View v){
        playNote(0);
        roll(0, 7);
    }

    public void fSHighRoll0(View v){
        playNote(1);
        roll(1, 0);
    }
    public void fSHighRoll1(View v){
        playNote(1);
        roll(1, 1);
    }
    public void fSHighRoll2(View v){
        playNote(1);
        roll(1, 2);
    }
    public void fSHighRoll3(View v){
        playNote(1);
        roll(1, 3);
    }
    public void fSHighRoll4(View v){
        playNote(1);
        roll(1, 4);
    }
    public void fSHighRoll5(View v){
        playNote(1);
        roll(1, 5);
    }
    public void fSHighRoll6(View v){
        playNote(1);
        roll(1, 6);
    }
    public void fSHighRoll7(View v){
        playNote(1);
        roll(1, 7);
    }

    public void fHighRoll0(View v){
        playNote(2);
        roll(2, 0);
    }
    public void fHighRoll1(View v){
        playNote(2);
        roll(2, 1);
    }
    public void fHighRoll2(View v){
        playNote(2);
        roll(2, 2);
    }
    public void fHighRoll3(View v){
        playNote(2);
        roll(2, 3);
    }
    public void fHighRoll4(View v){
        playNote(2);
        roll(2, 4);
    }
    public void fHighRoll5(View v){
        playNote(2);
        roll(2, 5);
    }
    public void fHighRoll6(View v){
        playNote(2);
        roll(2, 6);
    }
    public void fHighRoll7(View v){
        playNote(2);
        roll(2, 7);
    }

    public void eHighRoll0(View v){
        playNote(3);
        roll(3, 0);
    }
    public void eHighRoll1(View v){
        playNote(3);
        roll(3, 1);
    }
    public void eHighRoll2(View v){
        playNote(3);
        roll(3, 2);
    }
    public void eHighRoll3(View v){
        playNote(3);
        roll(3, 3);
    }
    public void eHighRoll4(View v){
        playNote(3);
        roll(3, 4);
    }
    public void eHighRoll5(View v){
        playNote(3);
        roll(3, 5);
    }
    public void eHighRoll6(View v){
        playNote(3);
        roll(3, 6);
    }
    public void eHighRoll7(View v){
        playNote(3);
        roll(3, 7);
    }

    public void dSHighRoll0(View v){
        playNote(4);
        roll(4, 0);
    }
    public void dSHighRoll1(View v){
        playNote(4);
        roll(4, 1);
    }
    public void dSHighRoll2(View v){
        playNote(4);
        roll(4, 2);
    }
    public void dSHighRoll3(View v){
        playNote(4);
        roll(4, 3);
    }
    public void dSHighRoll4(View v){
        playNote(4);
        roll(4, 4);
    }
    public void dSHighRoll5(View v){
        playNote(4);
        roll(4, 5);
    }
    public void dSHighRoll6(View v){
        playNote(4);
        roll(4, 6);
    }
    public void dSHighRoll7(View v){
        playNote(4);
        roll(4, 7);
    }

    public void dHighRoll0(View v){
        playNote(5);
        roll(5, 0);
    }
    public void dHighRoll1(View v){
        playNote(5);
        roll(5, 1);
    }
    public void dHighRoll2(View v){
        playNote(5);
        roll(5, 2);
    }
    public void dHighRoll3(View v){
        playNote(5);
        roll(5, 3);
    }
    public void dHighRoll4(View v){
        playNote(5);
        roll(5, 4);
    }
    public void dHighRoll5(View v){
        playNote(5);
        roll(5, 5);
    }
    public void dHighRoll6(View v){
        playNote(5);
        roll(5, 6);
    }
    public void dHighRoll7(View v){
        playNote(5);
        roll(5, 7);
    }

    public void cSRoll0(View v){
        playNote(6);
        roll(6, 0);
    }
    public void cSRoll1(View v){
        playNote(6);
        roll(6, 1);
    }
    public void cSRoll2(View v){
        playNote(6);
        roll(6, 2);
    }
    public void cSRoll3(View v){
        playNote(6);
        roll(6, 3);
    }
    public void cSRoll4(View v){
        playNote(6);
        roll(6, 4);
    }
    public void cSRoll5(View v){
        playNote(6);
        roll(6, 5);
    }
    public void cSRoll6(View v){
        playNote(6);
        roll(6, 6);
    }
    public void cSRoll7(View v){
        playNote(6);
        roll(6, 7);
    }

    public void cRoll0(View v){
        playNote(7);
        roll(7, 0);
    }
    public void cRoll1(View v){
        playNote(7);
        roll(7, 1);
    }
    public void cRoll2(View v){
        playNote(7);
        roll(7, 2);
    }
    public void cRoll3(View v){
        playNote(7);
        roll(7, 3);
    }
    public void cRoll4(View v){
        playNote(7);
        roll(7, 4);
    }
    public void cRoll5(View v){
        playNote(7);
        roll(7, 5);
    }
    public void cRoll6(View v){
        playNote(7);
        roll(7, 6);
    }
    public void cRoll7(View v){
        playNote(7);
        roll(7, 7);
    }

    public void bRoll0(View v){
        playNote(8);
        roll(8, 0);
    }
    public void bRoll1(View v){
        playNote(8);
        roll(8, 1);
    }
    public void bRoll2(View v){
        playNote(8);
        roll(8, 2);
    }
    public void bRoll3(View v){
        playNote(8);
        roll(8, 3);
    }
    public void bRoll4(View v){
        playNote(8);
        roll(8, 4);
    }
    public void bRoll5(View v){
        playNote(8);
        roll(8, 5);
    }
    public void bRoll6(View v){
        playNote(8);
        roll(8, 6);
    }
    public void bRoll7(View v){
        playNote(8);
        roll(8, 7);
    }

    public void aSRoll0(View v){
        playNote(9);
        roll(9, 0);
    }
    public void aSRoll1(View v){
        playNote(9);
        roll(9, 1);
    }
    public void aSRoll2(View v){
        playNote(9);
        roll(9, 2);
    }
    public void aSRoll3(View v){
        playNote(9);
        roll(9, 3);
    }
    public void aSRoll4(View v){
        playNote(89);
        roll(9, 4);
    }
    public void aSRoll5(View v){
        playNote(89);
        roll(9, 5);
    }
    public void aSRoll6(View v){
        playNote(9);
        roll(9, 6);
    }
    public void aSRoll7(View v){
        playNote(9);
        roll(9, 7);
    }

    public void aRoll0(View v){
        playNote(10);
        roll(10, 0);
    }
    public void aRoll1(View v){
        playNote(10);
        roll(10, 1);
    }
    public void aRoll2(View v){
        playNote(10);
        roll(10, 2);
    }
    public void aRoll3(View v){
        playNote(10);
        roll(10, 3);
    }
    public void aRoll4(View v){
        playNote(10);
        roll(10, 4);
    }
    public void aRoll5(View v){
        playNote(10);
        roll(10, 5);
    }
    public void aRoll6(View v){
        playNote(10);
        roll(10, 6);
    }
    public void aRoll7(View v){
        playNote(10);
        roll(10, 7);
    }

    public void gSRoll0(View v){
        playNote(11);
        roll(11, 0);
    }
    public void gSRoll1(View v){
        playNote(11);
        roll(11, 1);
    }
    public void gSRoll2(View v){
        playNote(11);
        roll(11, 2);
    }
    public void gSRoll3(View v){
        playNote(11);
        roll(11, 3);
    }
    public void gSRoll4(View v){
        playNote(11);
        roll(11, 4);
    }
    public void gSRoll5(View v){
        playNote(11);
        roll(11, 5);
    }
    public void gSRoll6(View v){
        playNote(11);
        roll(11, 6);
    }
    public void gSRoll7(View v){
        playNote(11);
        roll(11, 7);
    }

    public void gRoll0(View v){
        playNote(12);
        roll(12, 0);
    }
    public void gRoll1(View v){
        playNote(12);
        roll(12, 1);
    }
    public void gRoll2(View v){
        playNote(12);
        roll(12, 2);
    }
    public void gRoll3(View v){
        playNote(12);
        roll(12, 3);
    }
    public void gRoll4(View v){
        playNote(12);
        roll(12, 4);
    }
    public void gRoll5(View v){
        playNote(12);
        roll(12, 5);
    }
    public void gRoll6(View v){
        playNote(12);
        roll(12, 6);
    }
    public void gRoll7(View v){
        playNote(12);
        roll(12, 7);
    }

    public void fSRoll0(View v){
        playNote(13);
        roll(13, 0);
    }
    public void fSRoll1(View v){
        playNote(13);
        roll(13, 1);
    }
    public void fSRoll2(View v){
        playNote(13);
        roll(13, 2);
    }
    public void fSRoll3(View v){
        playNote(13);
        roll(13, 3);
    }
    public void fSRoll4(View v){
        playNote(13);
        roll(13, 4);
    }
    public void fSRoll5(View v){
        playNote(13);
        roll(13, 5);
    }
    public void fSRoll6(View v){
        playNote(13);
        roll(13, 6);
    }
    public void fSRoll7(View v){
        playNote(13);
        roll(13, 7);
    }

    public void fRoll0(View v){
        playNote(14);
        roll(14, 0);
    }
    public void fRoll1(View v){
        playNote(14);
        roll(14, 1);
    }
    public void fRoll2(View v){
        playNote(14);
        roll(14, 2);
    }
    public void fRoll3(View v){
        playNote(14);
        roll(14, 3);
    }
    public void fRoll4(View v){
        playNote(14);
        roll(14, 4);
    }
    public void fRoll5(View v){
        playNote(14);
        roll(14, 5);
    }
    public void fRoll6(View v){
        playNote(14);
        roll(14, 6);
    }
    public void fRoll7(View v){
        playNote(14);
        roll(14, 7);
    }

    public void eRoll0(View v){
        playNote(15);
        roll(15, 0);
    }
    public void eRoll1(View v){
        playNote(15);
        roll(15, 1);
    }
    public void eRoll2(View v){
        playNote(15);
        roll(15, 2);
    }
    public void eRoll3(View v){
        playNote(15);
        roll(15, 3);
    }
    public void eRoll4(View v){
        playNote(15);
        roll(15, 4);
    }
    public void eRoll5(View v){
        playNote(15);
        roll(15, 5);
    }
    public void eRoll6(View v){
        playNote(15);
        roll(15, 6);
    }
    public void eRoll7(View v){
        playNote(15);
        roll(15, 7);
    }

    public void dSRoll0(View v){
        playNote(16);
        roll(16, 0);
    }
    public void dSRoll1(View v){
        playNote(16);
        roll(16, 1);
    }
    public void dSRoll2(View v){
        playNote(16);
        roll(16, 2);
    }
    public void dSRoll3(View v){
        playNote(16);
        roll(16, 3);
    }
    public void dSRoll4(View v){
        playNote(16);
        roll(16, 4);
    }
    public void dSRoll5(View v){
        playNote(16);
        roll(16, 5);
    }
    public void dSRoll6(View v){
        playNote(16);
        roll(16, 6);
    }
    public void dSRoll7(View v){
        playNote(16);
        roll(16, 7);
    }

    public void dRoll0(View v){
        playNote(17);
        roll(17, 0);
    }
    public void dRoll1(View v){
        playNote(17);
        roll(17, 1);
    }
    public void dRoll2(View v){
        playNote(17);
        roll(17, 2);
    }
    public void dRoll3(View v){
        playNote(17);
        roll(17, 3);
    }
    public void dRoll4(View v){
        playNote(17);
        roll(17, 4);
    }
    public void dRoll5(View v){
        playNote(17);
        roll(17, 5);
    }
    public void dRoll6(View v){
        playNote(17);
        roll(17, 6);
    }
    public void dRoll7(View v){
        playNote(17);
        roll(17, 7);
    }

}