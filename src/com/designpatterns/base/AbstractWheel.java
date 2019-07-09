package com.designpatterns.base;

public abstract class AbstractWheel implements WheelInterface {

    private int size;
    private boolean wide;

    public AbstractWheel(int size, boolean wide) {
        this.size = size;
        this.wide = wide;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isWide() {
        return wide;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " at "+size+"inches";
    }
}
