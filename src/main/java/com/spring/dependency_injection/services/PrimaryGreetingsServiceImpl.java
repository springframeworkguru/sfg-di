package com.spring.dependency_injection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingsServiceImpl implements GreetingsService{
    @Override
    public String sayGreetings() {
        return "Hello World - From the PRIMARY Bean";
    }
}
