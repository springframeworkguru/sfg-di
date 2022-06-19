package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// service annotation with qualifier
@Profile("en")
@Service("i18nService")
public class I18nEnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "HelloWorld";
    }
}
