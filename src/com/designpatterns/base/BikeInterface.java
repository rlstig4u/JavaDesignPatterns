package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public interface BikeInterface {
    WheelInterface getWheel();
    BikeColor getColor();
    float getPrice();

    void paint(BikeColor color);

    void cleanFrame();
    void airTires();
    void testRide();


}
