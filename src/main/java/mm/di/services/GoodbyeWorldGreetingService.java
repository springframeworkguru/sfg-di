package mm.di.services;

import org.springframework.stereotype.Service;

@Service
public class GoodbyeWorldGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Goodbye World!";
    }
}
