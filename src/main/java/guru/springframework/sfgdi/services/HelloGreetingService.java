package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//This create this service as a primary bean, when a qualifier is not specificed this will be used.
@Primary
@Service
public class HelloGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello!";
    }
}
