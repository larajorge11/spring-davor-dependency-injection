package com.davor.di.DavorDependencyInjection.service;

public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello Davor from Service - Constructor";
    }
}
