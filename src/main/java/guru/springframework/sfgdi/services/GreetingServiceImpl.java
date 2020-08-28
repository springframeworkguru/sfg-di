package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello!";
    }

    @Override
    public String sayBye() {
        return "Bye!";
    }

    @Override
    public String sayWhatsUP() {
        return "Whats up!";
    }
}
