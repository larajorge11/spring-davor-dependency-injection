package com.davor.di.DavorDependencyInjection.config;

import com.davor.di.DavorDependencyInjection.repository.InternationalMessages;
import com.davor.di.DavorDependencyInjection.repository.InternationalMessagesImpl;
import com.davor.di.DavorDependencyInjection.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

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

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    InternationalMessages internationalMessages() {
        return new InternationalMessagesImpl();
    }

    @Profile(value = {"EN", "default"})
    @Bean(value = "i18nService")
    I18NEnglishGreetingService i18NEnglishGreetingService(InternationalMessages internationalMessages){
        return new I18NEnglishGreetingService(internationalMessages);
    }

    @Profile(value = "ES")
    @Bean(value = "i18nService")
    I18NSpanishGreetingService i18NSpanishGreetingService() {
        return new I18NSpanishGreetingService();
    }
}
