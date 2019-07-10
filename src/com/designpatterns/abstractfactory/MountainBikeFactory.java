package com.designpatterns.abstractfactory;

public class MountainBikeFactory extends AbstractBikeFactory {
    @Override
    public BikeFrameInterface createFrame() {
        return new MountainFrame();
    }

    @Override
    public BikeSeatInterface createSeat() {
        return new MountainSeat();
    }
}
