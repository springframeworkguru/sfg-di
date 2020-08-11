package com.melvyn.sfgdi.controllers;
/*
    I18n standard Java abbreviation for Internationalization, it starts with an 'I', 18 characters long, ends with 'n'
    We are going to return back two different languages depending on the active profile.
 */

import com.melvyn.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Melvyn on 11/Aug/2020
 */

@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController (@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting ();
    }
}
