package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class WhatUpGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Whats Up!";
    }
}