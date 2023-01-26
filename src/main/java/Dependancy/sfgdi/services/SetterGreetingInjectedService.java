package Dependancy.sfgdi.services;

public class SetterGreetingInjectedService  implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World Setter";
    }
}
