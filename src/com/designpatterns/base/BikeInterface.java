package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public interface BikeInterface {
    WheelInterface getWheel();
    BikeColor getColor();

    void paint(BikeColor color);
}
