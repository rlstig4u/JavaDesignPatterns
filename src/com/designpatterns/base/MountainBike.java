package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public abstract class MountainBike extends AbstractBike {

    protected MountainBike(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }
    protected MountainBike(WheelInterface wheel) {

        this(wheel, BikeColor.CHROME);
    }

}
