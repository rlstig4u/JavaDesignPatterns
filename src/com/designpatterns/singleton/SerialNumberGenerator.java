package com.designpatterns.singleton;

public class SerialNumberGenerator {
    private static SerialNumberGenerator instance;
    private int count = 642135;

    public synchronized static SerialNumberGenerator getInstance() {
        if(instance == null) {
            instance = new SerialNumberGenerator();

        } // end if statement
        return instance;
    } //end method
    private SerialNumberGenerator() { }
    public synchronized int getNextSerial() { return  ++count; }

} // end class


