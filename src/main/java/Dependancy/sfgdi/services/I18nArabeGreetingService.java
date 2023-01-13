package Dependancy.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"Ar","default"})
@Service("i18nService")
public class I18nArabeGreetingService  implements GreetingService{
    @Override
    public String sayGreeting() {
        return" Salam";
    }
}
