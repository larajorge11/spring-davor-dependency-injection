package com.davor.solid.dip;

public class ElectricPowerSupply implements Switch {
    private Switchable switchable;
    private boolean isOn;

    public ElectricPowerSupply(Switchable switchable) {
        this.switchable = switchable;
        this.isOn = false;
    }

    public boolean isOn(){
        return this.isOn;
    }

    public void press() {
        if (isOn()) {
            switchable.turnOff();
            this.isOn = false;
        } else {
            switchable.turnOn();
            this.isOn = true;
        }
    }

}
