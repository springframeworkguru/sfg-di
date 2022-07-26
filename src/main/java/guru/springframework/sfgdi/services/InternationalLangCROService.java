package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("CRO")
@Service("internationalLangService")
public class InternationalLangCROService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Language: CRO";
    }
}
