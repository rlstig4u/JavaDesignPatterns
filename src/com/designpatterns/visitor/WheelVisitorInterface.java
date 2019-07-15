package com.designpatterns.visitor;

import com.designpatterns.base.WheelInterface;

public interface WheelVisitorInterface {
    void visit(WheelInterface wheel);
    void visit(Spokes spokes);
    void visit(Bearings bearings);

}
