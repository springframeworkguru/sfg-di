package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// Best practise - use contructor injection
@Controller
public class ConstructorInjectedController {

    // private final field
    private final GreetingService greetingService;

    // set in the constructor... (@Autowired annotation no longer needed but CAN still be used) - note that if
    // the @Qualifier annotation is removed we get the primary bean.
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }

}
