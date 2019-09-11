package com.olenick.programmingCourse;

public abstract class Vehicle {
    protected Double getWidth() { return null; };
    protected Double getHeight() { return null; };
    protected Double getLength() { return null; };
    protected String getTypeAsString() { return "vehicle"; }

    public Dimensions getDimensions() {
        return new Dimensions(getWidth(), getHeight(), getLength());
    }

    protected abstract String getName();

    public String toString() {
        return "" + getTypeAsString() + " '" + getName() + "'";
    }
}
