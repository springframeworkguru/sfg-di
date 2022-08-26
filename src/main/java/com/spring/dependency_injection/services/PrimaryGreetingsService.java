package com.spring.dependency_injection.services;

public class PrimaryGreetingsService implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "Hello World - From the PRIMARY Bean";
    }
}
