package guru.springframework.sfgdi.repository;

public class EnglishGreetingRepository implements GreetingRepository {
    @Override
    public String getGreeting() {
        return "hello EN repo";
    }
}
