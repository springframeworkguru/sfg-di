package Dependancy.sfgdi.services;

public class PropertyInjectedGreetingService  implements  GreetingService {
    @Override
    public String sayGreeting() {
        return "HelloWorld-Property";
    }
}
