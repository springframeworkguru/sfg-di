package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service // tells sb to register as a bean (same a controller or component but gives intent to the devs as to what it is)
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "HelloWorld - Constructor";
    }
}
