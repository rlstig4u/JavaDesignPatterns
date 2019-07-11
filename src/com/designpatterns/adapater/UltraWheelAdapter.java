package com.designpatterns.adapater;

import com.designpatterns.base.AbstractWheel;

public class UltraWheelAdapter extends AbstractWheel {
    public UltraWheelAdapter(UltraWheel ultraWheel) {
       //public AbstractWheel(int size, boolean wide)
        super(ultraWheel.getWheelSize(), false);
    }
}
