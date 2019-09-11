package com.olenick.programmingCourse;

public class Car extends Vehicle {
    protected Double getWidth() { return 3.0; }
    protected Double getHeight() { return 1.5; }
    protected Double getLength() { return 4.5; }
    protected String getTypeAsString() { return "car"; }

    public Dimensions getDimensions() {
        return new Dimensions(getWidth(), getHeight(), getLength());
    }

    protected final String name;

    public Car(String name) {
        this.name = name;
    }

    protected String getName() { return name; }
}
