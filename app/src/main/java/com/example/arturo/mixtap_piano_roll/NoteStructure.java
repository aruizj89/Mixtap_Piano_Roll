package com.example.arturo.mixtap_piano_roll;


public class NoteStructure {

    private int pitch;
    private int time;
    private boolean noteSet;

    public NoteStructure(int pitch, int time){
        this.pitch = pitch;
        this.time = time;
        this.noteSet = false;
    }

    public void switchNote(){
        noteSet = (!noteSet);
    }

    public boolean isNoteSet(){
        return noteSet;
    }

}
