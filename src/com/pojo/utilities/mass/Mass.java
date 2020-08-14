package com.pojo.utilities.mass;

public abstract class Mass {
    protected String name = "";
    protected String sign = "";
    protected double value = 0;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public abstract double convertTon();

    public abstract double convertKg();

    public abstract double convertMg();

    public String getName() {
        return name;
    }

    public String getSign() {
        return sign;
    }

    public abstract double convertG();

    @Override
    public String toString() {
        return getSign();
    }
}
