package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author igorg
 * Date 30.04.2022
 */
@Service
public class SetterInjectionGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
