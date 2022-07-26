package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("internationalLangService")
public class InternationalLangENService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Language: EN";
    }
}
