package com.davor.di.DavorDependencyInjection.service;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello Davor from Service";
    }
}
