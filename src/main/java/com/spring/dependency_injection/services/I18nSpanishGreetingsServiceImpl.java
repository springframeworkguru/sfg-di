package com.spring.dependency_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingsServiceImpl implements GreetingsService {

    @Override
    public String sayGreetings() {
        return "Hola Mundo - ES";
    }
}
