package com.pojo.utilities.volume;

public class CbCentimeter extends Volume{
    public CbCentimeter() {
        this.name = "Cubic centimeter";
        this.sign = "c3";
    }

    @Override
    public double convertM3() {
        return getValue()/1000000;
    }

    @Override
    public double convertCm3() {
        return getValue();
    }

    @Override
    public double convertL() {
        return getValue()/1000;
    }
}
