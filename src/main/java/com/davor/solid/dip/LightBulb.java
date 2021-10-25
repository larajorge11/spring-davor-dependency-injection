package com.davor.solid.dip;

public class LightBulb implements Switchable {

    public void turnOn() {
        System.out.println("LightBulb.turnOn");
    }

    public void turnOff() {
        System.out.println("LightBulb.turnOff");
    }
}
