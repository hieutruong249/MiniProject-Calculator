package com.pojo.utilities.length;

public abstract class Length {
    protected String name;
    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public abstract double convertKm();
    public abstract double convertM();
    public abstract double convertDm();
    public abstract double convertCm();
    public abstract double convertMm();


}
