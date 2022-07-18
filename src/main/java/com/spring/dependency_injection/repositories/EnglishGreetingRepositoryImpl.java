package com.spring.dependency_injection.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreetings() {
        return "Hello World - EN";
    }
}
