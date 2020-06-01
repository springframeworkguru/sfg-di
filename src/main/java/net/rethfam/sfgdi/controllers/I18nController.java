package net.rethfam.sfgdi.controllers;

import net.rethfam.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by kr on 5/31/2020.
 */
@Controller
public class I18nController {

    private final GreetingService greetingService;


    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
