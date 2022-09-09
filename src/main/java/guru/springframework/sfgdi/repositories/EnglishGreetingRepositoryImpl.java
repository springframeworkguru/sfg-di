package guru.springframework.sfgdi.repositories;

/**
 * Created by vladi on 08/09/2022
 **/
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello Repository World - EN!!!";
    }
}
