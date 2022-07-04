package com.spring.dependency_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingsServiceImpl implements GreetingsService {

    @Override
    public String sayGreetings() {
        return "Hello World - EN";
    }
}
