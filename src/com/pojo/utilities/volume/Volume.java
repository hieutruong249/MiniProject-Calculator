package com.pojo.utilities.volume;

public abstract class Volume {
    protected String name = "";
    protected String sign = "";
    protected double value = 0;

    public String getName() {
        return name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public String getSign() {
        return sign;
    }

    public abstract double convertM3();

    public abstract double convertCm3();

    public abstract double convertL();

    @Override
    public String toString() {
        return getSign();
    }
}
