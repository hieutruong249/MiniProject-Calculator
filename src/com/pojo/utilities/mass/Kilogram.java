package com.pojo.utilities.mass;

public class Kilogram extends Mass{

    public Kilogram() {
        this.name="Kilogram";
        this.sign = "kg";
    }

    @Override
    public double convertTon() {
        return getValue()/1000;
    }

    @Override
    public double convertKg() {
        return getValue();
    }

    @Override
    public double convertMg() {
        return getValue()*1000000;
    }

    @Override
    public double convertG() {
        return getValue()*1000;
    }
}
