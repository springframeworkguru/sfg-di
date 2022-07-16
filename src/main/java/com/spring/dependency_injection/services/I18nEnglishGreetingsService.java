package com.spring.dependency_injection.services;

public class I18nEnglishGreetingsService implements GreetingsService {

    @Override
    public String sayGreetings() {
        return "Hello World - EN";
    }
}
