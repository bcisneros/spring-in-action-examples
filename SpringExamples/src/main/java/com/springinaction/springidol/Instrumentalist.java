package com.springinaction.springidol;

import com.springinaction.springidol.qualifiers.StringedInstrument;
import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer {

    private String song;
    private int age;
    @Autowired
    @StringedInstrument
    private Instrument instrument;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String screamSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
