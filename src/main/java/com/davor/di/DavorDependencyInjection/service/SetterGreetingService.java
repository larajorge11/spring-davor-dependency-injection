package com.davor.di.DavorDependencyInjection.service;

public class SetterGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello Davor from Service - Setter";
    }
}
