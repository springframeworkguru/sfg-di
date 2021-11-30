package com.samrit.sfgdi.services;

public class SetterInjectionGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {

        return "Hello world -----Setting ";
    }
}
