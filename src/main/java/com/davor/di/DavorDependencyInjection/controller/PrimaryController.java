package com.davor.di.DavorDependencyInjection.controller;

import com.davor.di.DavorDependencyInjection.service.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {
    private final PrimaryGreetingService primaryGreetingService;

    public PrimaryController(PrimaryGreetingService primaryGreetingService) {
        this.primaryGreetingService = primaryGreetingService;
    }

    public String getGreeting() {
        return primaryGreetingService.sayHello();
    }
}
