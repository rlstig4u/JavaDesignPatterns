package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class Vintage extends RoadBike {
    public Vintage(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }

    public Vintage(WheelInterface wheel) {
        this(wheel, BikeColor.RED);

    }
    @Override
    public float getPrice() {
        return 600.00f;
    }
}
