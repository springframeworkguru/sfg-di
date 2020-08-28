package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private final GreetingService greetingService;

    public  GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;

    }

    public String sayHello() {
        return greetingService.sayHello();
    }

}
