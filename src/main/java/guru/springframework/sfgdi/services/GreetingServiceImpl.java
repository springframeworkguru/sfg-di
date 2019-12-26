package guru.springframework.sfgdi.services;

/**
 * Created by jt on 12/26/19.
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
