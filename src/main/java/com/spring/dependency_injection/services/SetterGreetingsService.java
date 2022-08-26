package com.spring.dependency_injection.services;

public class SetterGreetingsService implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "Hello World - Setter";
    }
}
