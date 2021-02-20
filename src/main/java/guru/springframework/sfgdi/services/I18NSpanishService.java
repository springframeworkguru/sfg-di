package guru.springframework.sfgdi.services;

/**
 * Created by jt on 12/27/19.
 */

//@Service("i18nService")
public class I18NSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
