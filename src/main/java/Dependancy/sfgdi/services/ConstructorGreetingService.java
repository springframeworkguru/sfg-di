package Dependancy.sfgdi.services;

import org.springframework.stereotype.Service;

public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "HelloWorld-constructor";
    }
}
