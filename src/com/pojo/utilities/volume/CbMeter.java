package com.pojo.utilities.volume;

public class CbMeter extends Volume {
    public CbMeter() {
        this.name = "cubic meter";
        this.sign = "m3";
    }

    @Override
    public double convertM3() {
        return getValue();
    }

    @Override
    public double convertCm3() {
        return getValue()*1000000;
    }

    @Override
    public double convertL() {
        return getValue()*1000;
    }
}
