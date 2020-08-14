package com.pojo.utilities.length;

public class Centimeter extends Length {
    public Centimeter() {
        this.name = "Centimeter";
        this.sign = "cm";
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
        return getValue();
    }

    @Override
    public double convertMm() {
        return getValue()*10;
    }
}
