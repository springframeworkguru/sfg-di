package com.spring.dependency_injection.services;

public class I18nSpanishGreetingsService implements GreetingsService {

    @Override
    public String sayGreetings() {
        return "Hola Mundo - ES";
    }
}
