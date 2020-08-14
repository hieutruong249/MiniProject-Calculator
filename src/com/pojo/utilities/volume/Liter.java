package com.pojo.utilities.volume;

public class Liter extends Volume {
    public Liter() {
        this.name = "Liter";
        this.sign = "l";
    }

    @Override
    public double convertM3() {
        return getValue()/1000;
    }

    @Override
    public double convertCm3() {
        return getValue()*1000;
    }

    @Override
    public double convertL() {
        return getValue();
    }


}
