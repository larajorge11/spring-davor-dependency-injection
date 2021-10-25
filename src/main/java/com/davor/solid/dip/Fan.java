package com.davor.solid.dip;

public class Fan implements Switchable {

    public void turnOn() {
        System.out.println("Fan.turnOn");
    }

    public void turnOff() {
        System.out.println("Fan.turnOff");
    }
}
