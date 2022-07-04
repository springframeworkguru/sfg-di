package com.spring.dependency_injection.services;

public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "Hello World";
    }
}
