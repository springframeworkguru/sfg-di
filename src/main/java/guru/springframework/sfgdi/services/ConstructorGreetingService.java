package guru.springframework.sfgdi.services;

/**
 * Created by vladi on 12/08/2022
 **/
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor!";
    }
}
