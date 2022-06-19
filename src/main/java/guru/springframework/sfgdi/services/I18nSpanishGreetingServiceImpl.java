package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"es", "default"})
@Service("i18nService")
public class I18nSpanishGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
