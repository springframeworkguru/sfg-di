package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.repository.EnglishGreetingRepository;
import guru.springframework.sfgdi.repository.GreetingRepository;
import guru.springframework.sfgdi.services.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.I18nSpanishGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class GreetingServiceI18nServiceConfiguration {


    @Bean
    GreetingRepository greetingRepository(){
        return new EnglishGreetingRepository();
    }

    @Profile("EN")
    @Bean("i18nService")
    I18nEnglishGreetingService i18nEnglishGreetingService(GreetingRepository greetingRepository){
        return new I18nEnglishGreetingService(greetingRepository);
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService(){
        return new I18nSpanishGreetingService();
    }




}
