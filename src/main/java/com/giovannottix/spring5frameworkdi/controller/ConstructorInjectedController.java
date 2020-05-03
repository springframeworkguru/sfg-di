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

    /**
     * Use final is a good practice.
     */
    private final IGreetingService greetingService;

    /**
     * Most preferred.
     */
    public ConstructorInjectedController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
