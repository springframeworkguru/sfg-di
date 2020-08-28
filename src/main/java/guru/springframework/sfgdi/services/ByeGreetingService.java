package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ByeGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Bye!";
    }
}