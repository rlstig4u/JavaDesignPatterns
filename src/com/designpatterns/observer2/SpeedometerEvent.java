package com.designpatterns.observer2;

import com.designpatterns.observer.Speedometer;

import java.util.EventObject;

public class SpeedometerEvent extends EventObject {
    private  int speed;

    public SpeedometerEvent (Object obj, int speed){
        super(obj);
        this.speed = speed;

    }
    public int getSpeed() { return speed; }

}
