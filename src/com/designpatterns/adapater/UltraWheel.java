package com.designpatterns.adapater;

public class UltraWheel {
    private int size;

    public UltraWheel(int size) {
        this.size = size;

    } // end constructor

    public int getWheelSize() {
        return size;
    } // end method

    @Override
    public String toString()  {
        return "ULTRA WHEEL"+ "("+size+") inches";
    }
} //end class
