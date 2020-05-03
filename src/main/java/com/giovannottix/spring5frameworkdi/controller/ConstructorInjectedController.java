package com.giovannottix.spring5frameworkdi.controller;

import com.giovannottix.spring5frameworkdi.service.IGreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/02/20, Sat
 */
@Controller
public class ConstructorInjectedController {

    private final IGreetingService greetingService;

    public ConstructorInjectedController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
