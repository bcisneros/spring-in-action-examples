package com.springinaction.springidol;

import com.springinaction.springidol.qualifiers.StringedInstrument;

@StringedInstrument
public class Guitar implements Instrument {

    @Override
    public void play() {
        System.out.println("GUITAR SOUND!");
    }
}
