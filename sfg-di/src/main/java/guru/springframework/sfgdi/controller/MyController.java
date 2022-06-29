package guru.springframework.sfgdi.controller;

import org.springframework.objenesis.instantiator.gcj.GCJInstantiator;
import org.springframework.stereotype.Controller;

import ch.qos.logback.core.pattern.color.GreenCompositeConverter;
import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayGreeting();
    }

}
