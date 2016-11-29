package com.example.arturo.mixtap_piano_roll;


public class MeasureStructure {
    private int[] note = new int[8];
    private boolean played[] = new boolean[8];

    public MeasureStructure(){
        for(int i = 0; i < 8; i++)
            note[i] = -1;
        for(int i = 0; i < 8; i++)
            played[0] = false;
    }

    public void setNote(int time, int pitch){
        note[time] = pitch;
    }

    public int getNote(int time){
        return note[time];
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
}
