package com.designpatterns.builder;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.RoadBike;

public class RoadBikeBuilder extends BikeBuilder{

    private RoadBike bikeInProgress;

    public RoadBikeBuilder(RoadBike bike) {
        this.bikeInProgress = bike;
    }

    @Override
    public BikeInterface getBike() {
        return bikeInProgress;
    }

    @Override
    public void buildHandleBars() {
        System.out.println("Building Handle Bars");

    }

    @Override
    public void buildStreetTires() {
        System.out.println("Building Street Tires");

    }
} //end class
