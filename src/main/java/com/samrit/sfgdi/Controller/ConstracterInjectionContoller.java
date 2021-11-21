package com.samrit.sfgdi.Controller;

import com.samrit.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstracterInjectionContoller {
    private final GreetingService greetingService;

    public ConstracterInjectionContoller(@Qualifier("constractorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
