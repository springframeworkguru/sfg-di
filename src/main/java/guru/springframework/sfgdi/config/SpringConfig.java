package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.I18NSpanishService;
import guru.springframework.sfgdi.services.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class SpringConfig {

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nEnglishGreetingService() {
        return new I18nEnglishGreetingService();
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18NSpanishService i18NSpanishService() {
        return new I18NSpanishService();
    }

//    @Profile({"ES", "default"}) - another variant
//    @Bean("i18nService")
//    I18NSpanishService i18nService() {
//        return new I18NSpanishService();
//    }

}
