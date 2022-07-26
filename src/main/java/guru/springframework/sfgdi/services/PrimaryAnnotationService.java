package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryAnnotationService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Primary bean - i18nService Method";
    }
}
