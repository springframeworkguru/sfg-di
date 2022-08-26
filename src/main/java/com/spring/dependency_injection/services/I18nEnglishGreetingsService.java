package com.spring.dependency_injection.services;

import com.spring.dependency_injection.repositories.EnglishGreetingRepository;

public class I18nEnglishGreetingsService implements GreetingsService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingsService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreetings() {
        return "Hello World - EN";
    }
}
