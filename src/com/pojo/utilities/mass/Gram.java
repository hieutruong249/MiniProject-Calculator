package com.pojo.utilities.mass;

public class Gram extends Mass {
    public Gram() {
        this.name = "Gram";
        this.sign = "g";
    }

    @Override
    public double convertTon() {
        return getValue()/1000000;
    }

    @Override
    public double convertKg() {
        return getValue()/1000;
    }

    @Override
    public double convertMg() {
        return getValue()*1000;
    }

    @Override
    public double convertG() {
        return getValue();
    }
}
