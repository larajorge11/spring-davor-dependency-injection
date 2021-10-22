package com.davor.di.DavorDependencyInjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = "EN")
@Service(value = "i18nService")
public class I18NEnglishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - EN";
    }
}
