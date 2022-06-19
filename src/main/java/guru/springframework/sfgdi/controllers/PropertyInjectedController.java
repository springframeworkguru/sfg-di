package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// property injected because to provide a value to
// greeting service we need to PropertyInjectedController().greetingService = new GreetingService();
// i.e. inject the dependency via accessing the property on the class and assiging the value
@Controller  // tells sb to register it as a bean
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreetingServiceImpl")
    @Autowired // this tells sb that we want it to assign an instance of Greeting service on creation
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
