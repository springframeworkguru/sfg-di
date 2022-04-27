package aine.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"FR", "default"})
@Service("i18nService")
public class I18nFrenchGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Bienvenue au Monde - FR";
    }
}
