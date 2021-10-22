package com.davor.di.DavorDependencyInjection.controller;

import com.davor.di.DavorDependencyInjection.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {
    private final GreetingService greetingService;

    public I18NController(@Qualifier(value = "i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayHello();
    }
}
