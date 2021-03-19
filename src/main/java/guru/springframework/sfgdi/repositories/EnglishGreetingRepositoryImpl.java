package guru.springframework.sfgdi.repositories;

/**
 * User: p_sha
 * Date: Fri 19 Mar 2021
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String getGreeting() {
        return "Hello World Repo - EN";
    }
}
