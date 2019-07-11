package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class Touring extends RoadBike {

    public Touring(WheelInterface wheel, BikeColor color) {
        super(wheel, color);

    }
    public Touring(WheelInterface wheel) {
        this(wheel, BikeColor.BLUE);

    }
    @Override
    public float getPrice(){
        return 570.00f;

    }

}
