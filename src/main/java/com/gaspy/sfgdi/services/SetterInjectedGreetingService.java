package com.gaspy.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {

    @Override
    public String saygreeting() {
        return "Hello World! - Setter";
    }
}
