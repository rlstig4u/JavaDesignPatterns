package com.designpatterns.visitor;

import com.designpatterns.base.WheelInterface;

public class Bearings implements VisitableInterface{
    @Override
    public void acceptVisitor(WheelVisitorInterface visitor) {
        visitor.visit(this);
    }
}
