package com.pojo.utilities.mass;

public class Tonne extends Mass{
    public Tonne() {
        this.name = "Tonne";
        this.sign = "t";
    }

    @Override
    public double convertTon() {
        return getValue();
    }

    @Override
    public double convertKg() {
        return getValue()*1000;
    }

    @Override
    public double convertMg() {
        return getValue()*1000000000;
    }

    @Override
    public double convertG() {
        return getValue()*1000000;
    }
}
