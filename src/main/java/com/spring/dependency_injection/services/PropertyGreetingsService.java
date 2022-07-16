package com.spring.dependency_injection.services;

public class PropertyGreetingsService implements GreetingsService{
    @Override
    public String sayGreetings() {
        return "Hello World - Property";
    }
}
