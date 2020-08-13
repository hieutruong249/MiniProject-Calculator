package com.pojo.utilities.length;

public class Kilometer extends Length {
    public Kilometer() {
        this.name = "Kilometer";
    }

    @Override
    public double convertKm() {
        return getValue();
    }

    @Override
    public double convertM() {
        return getValue()*1000;
    }

    @Override
    public double convertDm() {
        return getValue()*10000;
    }

    @Override
    public double convertCm() {
        return getValue()*100000;
    }

    @Override
    public double convertMm() {
        return getValue()*1000000;
    }
}
