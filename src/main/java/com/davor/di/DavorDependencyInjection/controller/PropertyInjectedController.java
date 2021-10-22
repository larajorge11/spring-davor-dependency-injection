package com.davor.di.DavorDependencyInjection.controller;

import com.davor.di.DavorDependencyInjection.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier(value = "propertyGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreetingService() {
        return greetingService.sayHello();
    }
}
