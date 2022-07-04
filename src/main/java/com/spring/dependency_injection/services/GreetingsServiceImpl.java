package com.spring.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "Hello World";
    }
}
