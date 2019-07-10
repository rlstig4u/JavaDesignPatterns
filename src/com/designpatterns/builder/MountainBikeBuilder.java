package com.designpatterns.builder;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.MountainBike;

public class MountainBikeBuilder extends BikeBuilder {

    private MountainBike bikeInProgress;

    public MountainBikeBuilder(MountainBike bike){
        this.bikeInProgress = bike;
    }

    @Override
    public BikeInterface getBike() {
        return bikeInProgress;
    }
     @Override
    public void buildHandleBars() {
            System.out.println("Building Handler Bars");
        }

    @Override
    public void buildWideTires() {
        System.out.println("Building Wide Tires");
    }
} // end class
