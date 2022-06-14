package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Qualifier("constructorInjectedGreetingService")
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
