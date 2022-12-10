package com.springframework.dependencyinjection.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServicesImpl implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hi from say Greeting";
    }
}
