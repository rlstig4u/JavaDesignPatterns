package com.designpattern.facade;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.singleton.SerialNumberGenerator;

public class Registration {
    private BikeInterface bike;

    Registration(BikeInterface bike) {
        this.bike = bike;
    }

    public void allocatingBikeNumber() {
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        System.out.println("Allocating Bike Number "+ generator.getNextSerial());

    }

}
