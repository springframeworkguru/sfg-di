package com.samrit.sfgdi.services;

public class PropertyInjectionGreetingService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World from Property";
    }
}
