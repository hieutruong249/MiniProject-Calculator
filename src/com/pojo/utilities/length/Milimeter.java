package com.pojo.utilities.length;

public class Milimeter extends Length{
    public Milimeter() {
        this.name = "Milemeter";
    }

    @Override
    public double convertKm() {
        return getValue()/1000000;
    }

    @Override
    public double convertM() {
        return getValue()/1000;
    }

    @Override
    public double convertDm() {
        return getValue()/100;
    }

    @Override
    public double convertCm() {
        return getValue()/10;
    }

    @Override
    public double convertMm() {
        return getValue();
    }
}
