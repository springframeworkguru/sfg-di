package com.melvyn.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Melvyn on 11/Aug/2020
 */
@Profile ("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting () {
        return "Hello World - EN";
    }
}
