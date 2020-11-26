package com.gaspy.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {

    @Override
    public String saygreeting() {
        return "Hello World - Constructor";
    }
}
