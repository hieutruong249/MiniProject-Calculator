package com.pojo.utilities.mass;

public class Miligram extends Mass{
    public Miligram() {
        this.name = "Miligram";
        this.sign ="mg";
    }

    @Override
    public double convertTon() {
        return getValue()/1000000000;
    }

    @Override
    public double convertKg() {
        return getValue()/1000000;
    }

    @Override
    public double convertMg() {
        return getValue();
    }

    @Override
    public double convertG() {
        return getValue()*1000;
    }
}
