package com.melvyn.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by Melvyn on 10/Aug/2020
 */
/*
    Spring @Service annotation is used with classes that provide some business functionalities.
    Spring context will autodetect these classes when annotation-based configuration and classpath scanning is used.
 */

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting () {
        return "Hello World - Constructor";
    }
}
