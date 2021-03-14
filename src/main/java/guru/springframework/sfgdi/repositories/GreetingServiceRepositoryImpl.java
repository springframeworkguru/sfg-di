package guru.springframework.sfgdi.repositories;

public class GreetingServiceRepositoryImpl implements GreetingServiceRepository {
    @Override
    public String getGreeting() {
        return "Hello World - Constructor";
    }
}
