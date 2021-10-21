package com.davor.di.DavorDependencyInjection.controller;

import com.davor.di.DavorDependencyInjection.service.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreetingService() {
        return greetingService.sayHello();
    }
}
