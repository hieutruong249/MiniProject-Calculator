package com.pojo.utilities.length;

public abstract class Length {
    protected String name;
    protected String sign;
    protected double value;

    public Length() {
        this.name = "";
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getSign() {
        return sign;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public abstract double convertKm();
    public abstract double convertM();
    public abstract double convertDm();
    public abstract double convertCm();
    public abstract double convertMm();

    @Override
    public String toString() {
        return getSign();
    }
}
