package com.pojo.utilities.length;

public class Meter extends Length{
    public Meter() {
        this.name = "Meter";
        this.sign = "m";
    }

    @Override
    public double convertKm() {
        return getValue()/1000;
    }

    @Override
    public double convertM() {
        return getValue();
    }

    @Override
    public double convertDm() {
        return getValue()*10;
    }

    @Override
    public double convertCm() {
        return getValue()*100;
    }

    @Override
    public double convertMm() {
        return getValue()*1000;
    }
}
