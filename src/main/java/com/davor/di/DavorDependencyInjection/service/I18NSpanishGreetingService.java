package com.davor.di.DavorDependencyInjection.service;

public class I18NSpanishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola Mundo - ES";
    }
}