package com.davor.di.DavorDependencyInjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = "ES")
@Service(value = "i18nService")
public class I18NSpanishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola Mundo - ES";
    }
}