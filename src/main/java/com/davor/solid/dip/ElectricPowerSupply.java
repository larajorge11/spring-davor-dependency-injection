package com.davor.solid.dip;

public class ElectricPowerSupply {
    private LightBulb lightBulb;
    private boolean isOn;

    public ElectricPowerSupply(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.isOn = false;
    }

    public boolean isOn(){
        return this.isOn;
    }

    public void press() {
        if (isOn()) {
            lightBulb.turnOff();
            this.isOn = false;
        } else {
            lightBulb.turnOn();
            this.isOn = true;
        }
    }

}
