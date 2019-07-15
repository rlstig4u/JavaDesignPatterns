package com.designpatterns.visitor;

import com.designpatterns.base.WheelInterface;

public class WheelDiagnostics implements WheelVisitorInterface {

    @Override
    public void visit(WheelInterface wheel) {
        System.out.println("Diagnosing Bike Spokes");
    }

    @Override
    public void visit(Spokes spokes) {
        System.out.println("Diagnosing Bike Bearings");
    }

    @Override
    public void visit(Bearings bearings) {
        System.out.println("Diagnosing Bike Wheels");

    }
}
