package com.davor.di.DavorDependencyInjection.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello Davor from Service - Constructor";
    }
}
