package com.designpatterns.decorator;

import com.designpatterns.base.BikeInterface;

public class LeatherSeatOption extends AbstractBikeOption {

    public  LeatherSeatOption(BikeInterface bike) { super(bike); }

    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 40.00F;
    }
}
