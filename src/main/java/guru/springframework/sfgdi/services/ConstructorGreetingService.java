package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author igorg
 * Date 25.04.2022
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
