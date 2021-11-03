package com.davor.di.DavorDependencyInjection.service;

public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello Davor from Service - Property";
    }
}
