package com.spring.dependency_injection.config;

import com.spring.dependency_injection.services.ConstructorGreetingsService;
import com.spring.dependency_injection.services.PropertyGreetingsService;
import com.spring.dependency_injection.services.SetterGreetingsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingsService constructorGreetingsService() {
        return new ConstructorGreetingsService();
    }

    @Bean
    PropertyGreetingsService propertyGreetingsService() {
        return new PropertyGreetingsService();
    }

    @Bean
    SetterGreetingsService setterGreetingsService() {
        return new SetterGreetingsService();
    }
}
