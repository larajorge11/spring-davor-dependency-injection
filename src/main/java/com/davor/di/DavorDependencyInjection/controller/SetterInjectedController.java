package com.davor.di.DavorDependencyInjection.controller;

import com.davor.di.DavorDependencyInjection.service.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
