package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class CrossCountry extends MountainBike {

    public CrossCountry(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }

    public CrossCountry(WheelInterface wheel) {
        this(wheel, BikeColor.ORANGE);
    }

    @Override
    public float getPrice() {
        return 850.00f;
    }
}
