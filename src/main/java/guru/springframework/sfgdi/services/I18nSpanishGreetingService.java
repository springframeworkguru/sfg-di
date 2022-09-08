package guru.springframework.sfgdi.services;

/**
 * Created by vladi on 12/08/2022
 **/
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Halo Mundo - ES!";
    }
}
