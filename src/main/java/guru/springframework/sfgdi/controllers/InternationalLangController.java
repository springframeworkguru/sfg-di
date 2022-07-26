package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class InternationalLangController {

    private final GreetingService greetingService;

    public InternationalLangController(@Qualifier("internationalLangService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String setLanguage(){
        return greetingService.sayGreeting();
    }
}
