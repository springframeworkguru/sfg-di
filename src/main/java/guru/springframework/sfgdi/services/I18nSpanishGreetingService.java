package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
// there are two services named "i18nService"
// we added the @Profile annotaion to make the output dependent of the users active profile
// without the profile, Spring wouldn't know which one to get --> throws error
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting(){
        return "Hola Mundo – ES";
    }
}
