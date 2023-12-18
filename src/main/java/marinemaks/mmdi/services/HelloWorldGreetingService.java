package marinemaks.mmdi.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
