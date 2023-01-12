package Dependancy.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingInjectedService  implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World Setter";
    }
}
