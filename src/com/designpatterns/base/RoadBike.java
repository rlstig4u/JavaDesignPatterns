package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public abstract class RoadBike extends AbstractBike {

    protected RoadBike(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }

    protected RoadBike(WheelInterface wheel) {

        this(wheel,BikeColor.BLACK);
    }
    @Override
    public float getPrice() {
        return 670.00f;
    }

}
