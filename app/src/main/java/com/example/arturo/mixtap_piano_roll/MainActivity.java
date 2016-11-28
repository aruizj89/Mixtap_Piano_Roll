package com.example.arturo.mixtap_piano_roll;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mPlayer;
    ImageButton b, a_sharp, a, g_sharp, g, f_sharp, f, e, d_sharp, d, c_sharp, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupButtons();
    }

    public void stop(){
        if(mPlayer == null)
            return;
        mPlayer.release();
        mPlayer = null;
    }

    private void setupButtons() {
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
    }

    private void roll(int pitch, int time){
        //save pitch and timing into data structure
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
                break;
        }
        mPlayer.start();

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
        //roll(pitch, time)
    }
    public void bRoll1(View v){
        playNote(0);
        //roll(pitch, time)
    }
    public void bRoll2(View v){
        playNote(0);
        //roll(pitch, time)
    }
    public void bRoll3(View v){
        playNote(0);
        //roll(pitch, time)
    }
    public void bRoll4(View v){
        playNote(0);
        //roll(pitch, time)
    }
    public void bRoll5(View v){
        playNote(0);
        //roll(pitch, time)
    }
    public void bRoll6(View v){
        playNote(0);
        //roll(pitch, time)
    }
    public void bRoll7(View v){
        playNote(0);
        //roll(pitch, time)
    }

    public void aSRoll0(View v){
        playNote(1);
        //roll(pitch, time)
    }
    public void aSRoll1(View v){
        playNote(1);
        //roll(pitch, time)
    }
    public void aSRoll2(View v){
        playNote(1);
        //roll(pitch, time)
    }
    public void aSRoll3(View v){
        playNote(1);
        //roll(pitch, time)
    }
    public void aSRoll4(View v){
        playNote(1);
        //roll(pitch, time)
    }
    public void aSRoll5(View v){
        playNote(1);
        //roll(pitch, time)
    }
    public void aSRoll6(View v){
        playNote(1);
        //roll(pitch, time)
    }
    public void aSRoll7(View v){
        playNote(1);
        //roll(pitch, time)
    }

    public void aRoll0(View v){
        playNote(2);
        //roll(pitch, time)
    }
    public void aRoll1(View v){
        playNote(2);
        //roll(pitch, time)
    }
    public void aRoll2(View v){
        playNote(2);
        //roll(pitch, time)
    }
    public void aRoll3(View v){
        playNote(2);
        //roll(pitch, time)
    }
    public void aRoll4(View v){
        playNote(2);
        //roll(pitch, time)
    }
    public void aRoll5(View v){
        playNote(2);
        //roll(pitch, time)
    }
    public void aRoll6(View v){
        playNote(2);
        //roll(pitch, time)
    }
    public void aRoll7(View v){
        playNote(2);
        //roll(pitch, time)
    }

    public void gSRoll0(View v){
        playNote(3);
        //roll(pitch, time)
    }
    public void gSRoll1(View v){
        playNote(3);
        //roll(pitch, time)
    }
    public void gSRoll2(View v){
        playNote(3);
        //roll(pitch, time)
    }
    public void gSRoll3(View v){
        playNote(3);
        //roll(pitch, time)
    }
    public void gSRoll4(View v){
        playNote(3);
        //roll(pitch, time)
    }
    public void gSRoll5(View v){
        playNote(3);
        //roll(pitch, time)
    }
    public void gSRoll6(View v){
        playNote(3);
        //roll(pitch, time)
    }
    public void gSRoll7(View v){
        playNote(3);
        //roll(pitch, time)
    }

    public void gRoll0(View v){
        playNote(4);
        //roll(pitch, time)
    }
    public void gRoll1(View v){
        playNote(4);
        //roll(pitch, time)
    }
    public void gRoll2(View v){
        playNote(4);
        //roll(pitch, time)
    }
    public void gRoll3(View v){
        playNote(4);
        //roll(pitch, time)
    }
    public void gRoll4(View v){
        playNote(4);
        //roll(pitch, time)
    }
    public void gRoll5(View v){
        playNote(4);
        //roll(pitch, time)
    }
    public void gRoll6(View v){
        playNote(4);
        //roll(pitch, time)
    }
    public void gRoll7(View v){
        playNote(4);
        //roll(pitch, time)
    }

    public void fSRoll0(View v){
        playNote(5);
        //roll(pitch, time)
    }
    public void fSRoll1(View v){
        playNote(5);
        //roll(pitch, time)
    }
    public void fSRoll2(View v){
        playNote(5);
        //roll(pitch, time)
    }
    public void fSRoll3(View v){
        playNote(5);
        //roll(pitch, time)
    }
    public void fSRoll4(View v){
        playNote(5);
        //roll(pitch, time)
    }
    public void fSRoll5(View v){
        playNote(5);
        //roll(pitch, time)
    }
    public void fSRoll6(View v){
        playNote(5);
        //roll(pitch, time)
    }
    public void fSRoll7(View v){
        playNote(5);
        //roll(pitch, time)
    }

    public void fRoll0(View v){
        playNote(6);
        //roll(pitch, time)
    }
    public void fRoll1(View v){
        playNote(6);
        //roll(pitch, time)
    }
    public void fRoll2(View v){
        playNote(6);
        //roll(pitch, time)
    }
    public void fRoll3(View v){
        playNote(6);
        //roll(pitch, time)
    }
    public void fRoll4(View v){
        playNote(6);
        //roll(pitch, time)
    }
    public void fRoll5(View v){
        playNote(6);
        //roll(pitch, time)
    }
    public void fRoll6(View v){
        playNote(6);
        //roll(pitch, time)
    }
    public void fRoll7(View v){
        playNote(6);
        //roll(pitch, time)
    }

    public void eRoll0(View v){
        playNote(7);
        //roll(pitch, time)
    }
    public void eRoll1(View v){
        playNote(7);
        //roll(pitch, time)
    }
    public void eRoll2(View v){
        playNote(7);
        //roll(pitch, time)
    }
    public void eRoll3(View v){
        playNote(7);
        //roll(pitch, time)
    }
    public void eRoll4(View v){
        playNote(7);
        //roll(pitch, time)
    }
    public void eRoll5(View v){
        playNote(7);
        //roll(pitch, time)
    }
    public void eRoll6(View v){
        playNote(7);
        //roll(pitch, time)
    }
    public void eRoll7(View v){
        playNote(7);
        //roll(pitch, time)
    }

    public void dSRoll0(View v){
        playNote(8);
        //roll(pitch, time)
    }
    public void dSRoll1(View v){
        playNote(8);
        //roll(pitch, time)
    }
    public void dSRoll2(View v){
        playNote(8);
        //roll(pitch, time)
    }
    public void dSRoll3(View v){
        playNote(8);
        //roll(pitch, time)
    }
    public void dSRoll4(View v){
        playNote(8);
        //roll(pitch, time)
    }
    public void dSRoll5(View v){
        playNote(8);
        //roll(pitch, time)
    }
    public void dSRoll6(View v){
        playNote(8);
        //roll(pitch, time)
    }
    public void dSRoll7(View v){
        playNote(8);
        //roll(pitch, time)
    }

    public void dRoll0(View v){
        playNote(9);
        //roll(pitch, time)
    }
    public void dRoll1(View v){
        playNote(9);
        //roll(pitch, time)
    }
    public void dRoll2(View v){
        playNote(9);
        //roll(pitch, time)
    }
    public void dRoll3(View v){
        playNote(9);
        //roll(pitch, time)
    }
    public void dRoll4(View v){
        playNote(9);
        //roll(pitch, time)
    }
    public void dRoll5(View v){
        playNote(9);
        //roll(pitch, time)
    }
    public void dRoll6(View v){
        playNote(9);
        //roll(pitch, time)
    }
    public void dRoll7(View v){
        playNote(9);
        //roll(pitch, time)
    }

    public void cSRoll0(View v){
        playNote(10);
        //roll(pitch, time)
    }
    public void cSRoll1(View v){
        playNote(10);
        //roll(pitch, time)
    }
    public void cSRoll2(View v){
        playNote(10);
        //roll(pitch, time)
    }
    public void cSRoll3(View v){
        playNote(10);
        //roll(pitch, time)
    }
    public void cSRoll4(View v){
        playNote(10);
        //roll(pitch, time)
    }
    public void cSRoll5(View v){
        playNote(10);
        //roll(pitch, time)
    }
    public void cSRoll6(View v){
        playNote(10);
        //roll(pitch, time)
    }
    public void cSRoll7(View v){
        playNote(10);
        //roll(pitch, time)
    }

    public void cRoll0(View v){
        playNote(11);
        //roll(pitch, time)
    }
    public void cRoll1(View v){
        playNote(11);
        //roll(pitch, time)
    }
    public void cRoll2(View v){
        playNote(11);
        //roll(pitch, time)
    }
    public void cRoll3(View v){
        playNote(11);
        //roll(pitch, time)
    }
    public void cRoll4(View v){
        playNote(11);
        //roll(pitch, time)
    }
    public void cRoll5(View v){
        playNote(11);
        //roll(pitch, time)
    }
    public void cRoll6(View v){
        playNote(11);
        //roll(pitch, time)
    }
    public void cRoll7(View v){
        playNote(11);
        //roll(pitch, time)
    }

}
