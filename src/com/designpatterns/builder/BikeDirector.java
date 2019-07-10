package com.designpatterns.builder;

import com.designpatterns.base.BikeInterface;

public abstract class BikeDirector {
    public abstract BikeInterface build(BikeBuilder builder);
}
