package com.davor.solid.dip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricPowerSupplyTest {

    @Test
    void press() {
        ElectricPowerSupply electricPowerSupplyLightBulb = new ElectricPowerSupply(new LightBulb());
        System.out.println(electricPowerSupplyLightBulb.isOn());
        electricPowerSupplyLightBulb.press();
        System.out.println(electricPowerSupplyLightBulb.isOn());

        ElectricPowerSupply electricPowerSupplyFan = new ElectricPowerSupply(new Fan());
        System.out.println(electricPowerSupplyFan.isOn());
        electricPowerSupplyFan.press();
        System.out.println(electricPowerSupplyFan.isOn());
    }
}