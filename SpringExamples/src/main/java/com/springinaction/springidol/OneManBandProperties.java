package com.springinaction.springidol;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class OneManBandProperties implements Performer {
    private Properties instruments;

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() throws PerformanceException {
        Set instrumentsKeySet = instruments.keySet();
        Iterator iterator = instrumentsKeySet.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            System.out.println(key + ":" + instruments.getProperty(key));
        }
    }
}
