package com.designpattern.facade;

import com.designpatterns.base.BikeInterface;

public class BikeFacade {
    public void perpareForSale(BikeInterface bike) {
        Registration reg = new Registration(bike);
        reg.allocatingBikeNumber();
        Documentation.PrintBroucher();
        bike.airTires();
        bike.cleanFrame();
        bike.testRide();
    }
}
