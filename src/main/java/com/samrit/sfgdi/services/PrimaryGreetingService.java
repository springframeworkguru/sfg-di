package com.samrit.sfgdi.services;

public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello From Primary";
    }
}
