package com.davor.di.DavorDependencyInjection.service;

public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello Davor from Service - PRIMARY";
    }
}