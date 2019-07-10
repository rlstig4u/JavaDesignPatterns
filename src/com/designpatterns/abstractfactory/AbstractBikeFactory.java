package com.designpatterns.abstractfactory;

public abstract class AbstractBikeFactory {
    public abstract BikeFrameInterface createFrame();
    public abstract BikeSeatInterface createSeat();
}
