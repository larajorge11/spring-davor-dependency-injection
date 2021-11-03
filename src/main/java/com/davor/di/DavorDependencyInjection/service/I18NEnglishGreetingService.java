package com.davor.di.DavorDependencyInjection.service;

public class I18NEnglishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - EN";
    }
}
