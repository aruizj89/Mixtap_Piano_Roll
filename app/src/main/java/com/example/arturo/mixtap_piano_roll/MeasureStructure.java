package com.example.arturo.mixtap_piano_roll;


public class MeasureStructure {
    private int[] note = new int[8];
    private boolean played[] = new boolean[8];
    private int notePosition[] = {-1, -1, -1, -1, -1, -1, -1, -1};

    public MeasureStructure(){
        for(int i = 0; i < 8; i++)
            note[i] = -1;
        for(int i = 0; i < 8; i++)
            played[0] = false;
    }

    //piano roll: g fS f e dS d cS c b aS a gS g fS f e dS d
    //music sheet: d e f g a b c d e f g
    public void setNote(int time, int pitch){

        //if note is the same, make a rest and return
        if(note[time] == pitch){
            note[time] = -1;
            return;
        }

        note[time] = pitch;
        switch(pitch){
            case  0:
                notePosition[time] = 0;
                break;
            case  2:
                notePosition[time] = 20;
                break;
            case  3:
                notePosition[time] = 40;
                break;
            case  5:
                notePosition[time] = 60;
                break;
            case  7:
                notePosition[time] = 80;
                break;
            case  8:
                notePosition[time] = 100;
                break;
            case  10:
                notePosition[time] = 120;
                break;
            case  12:
                notePosition[time] = 140;
                break;
            case  14:
                notePosition[time] = 100;
                break;
            case  15:
                notePosition[time] = 180;
                break;
            case  17:
                notePosition[time] = 200;
                break;
            default:
                // (sharp || flat)
                break;
        }
    }

    public int getNote(int time){
        return note[time];
    }

    public int getNotePosition(int time){
        return notePosition[time];
    }

    public void playNote(int time){
        played[time] = true;
    }

    public boolean isPlayed(int time){
        return played[time];
    }

    public void resetPlayed() {
        for(int i = 0; i < 8; i++)
            played[0] = false;
    }

    public int[] getNotePositions(){
        return notePosition;
    }


}
