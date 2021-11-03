package com.davor.di.DavorDependencyInjection.service;

import com.davor.di.DavorDependencyInjection.repository.InternationalMessages;

public class I18NEnglishGreetingService implements GreetingService {

    private final InternationalMessages internationalMessages;

    public I18NEnglishGreetingService(InternationalMessages internationalMessages) {
        this.internationalMessages = internationalMessages;
    }

    @Override
    public String sayHello() {
        return internationalMessages.getMessage();
    }
}
