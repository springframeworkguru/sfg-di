package com.spring.dependency_injection.services;

public class ConstructorGreetingsService implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "Hello World - Constructor";
    }
}
