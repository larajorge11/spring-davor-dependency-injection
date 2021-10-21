package com.davor.di.DavorDependencyInjection.controller;

import com.davor.di.DavorDependencyInjection.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    private SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreetingService().sayHello());
    }
}