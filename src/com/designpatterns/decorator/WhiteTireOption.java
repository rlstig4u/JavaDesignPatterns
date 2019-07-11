package com.designpatterns.decorator;

import com.designpatterns.base.BikeInterface;

public class WhiteTireOption extends AbstractBikeOption {

    public WhiteTireOption(BikeInterface bike) { super(bike); }

    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 80.00F;
    }
}
