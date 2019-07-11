package com.designpatterns.decorator;

import com.designpatterns.base.BikeInterface;

public class CustomGripOption extends AbstractBikeOption{

    public CustomGripOption (BikeInterface bike) { super(bike);}

    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 20.00F;
    }
}
