package com.melvyn.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Melvyn on 11/Aug/2020
 */
@Profile ("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting () {
        return "Hola Mundo - ES";
    }
}
