package com.pojo.utilities.length;

public class Decimeter extends Length{
    public Decimeter() {
        this.name = "Decimeter";
    }

    @Override
    public double convertKm() {
        return getValue()/10000;
    }

    @Override
    public double convertM() {
        return getValue()/10;
    }

    @Override
    public double convertDm() {
        return getValue();
    }

    @Override
    public double convertCm() {
        return getValue()*10;
    }

    @Override
    public double convertMm() {
        return getValue()*100;
    }
}
