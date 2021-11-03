package com.davor.di.DavorDependencyInjection.config;

import com.davor.di.DavorDependencyInjection.service.ConstructorGreetingService;
import com.davor.di.DavorDependencyInjection.service.PropertyGreetingService;
import com.davor.di.DavorDependencyInjection.service.SetterGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyGreetingService propertyGreetingService() {
        return new PropertyGreetingService();
    }

    @Bean
    SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }
}
