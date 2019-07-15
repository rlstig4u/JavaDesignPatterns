package com.designpatterns.base;

import com.designpatterns.visitor.VisitableInterface;

public interface WheelInterface extends VisitableInterface {
    int getSize();
    boolean isWide();

}
