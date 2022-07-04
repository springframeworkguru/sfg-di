package com.spring.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "Hello World - Constructor";
    }
}
