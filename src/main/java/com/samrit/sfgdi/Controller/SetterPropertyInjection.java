package com.samrit.sfgdi.Controller;

import com.samrit.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterPropertyInjection {
    @Qualifier("setterInjectionGreetingService")
    @Autowired
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;

    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
