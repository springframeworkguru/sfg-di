package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class HelloGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello!";
    }
}
