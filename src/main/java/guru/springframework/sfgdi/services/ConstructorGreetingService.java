package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by vladi on 12/08/2022
 **/
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor!";
    }
}
