package com.designpatterns.decorator;

import com.designpatterns.base.AbstractBike;
import com.designpatterns.base.BikeInterface;

public class AbstractBikeOption extends AbstractBike {
    protected BikeInterface decoratedBike;

    public AbstractBikeOption(BikeInterface bike) {
        super(bike.getWheel());
        this.decoratedBike = bike;
    }
}
