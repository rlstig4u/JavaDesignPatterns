package com.designpatterns.visitor;

import com.designpatterns.base.WheelInterface;

public class WheelInventory implements WheelVisitorInterface {
    private int spokesCount, bearingsCount;

    public WheelInventory() {
        spokesCount = 30;
        bearingsCount = 2;
    }

    @Override
    public void visit(WheelInterface wheel) {
        System.out.println("The Wheel has:" + spokesCount
                + " spokes and " + bearingsCount + "bearings");
    }

    @Override
    public  void visit(Bearings bearings) {
        bearingsCount++;
    }

    @Override
    public void visit(Spokes spokes) {
        spokesCount++;
    }
}

