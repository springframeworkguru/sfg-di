package Dependancy.sfgdi.config;

import Dependancy.pets.CatPetService;
import Dependancy.pets.DogPetService;
import Dependancy.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class GreetingServiceConfig  {

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterGreetingInjectedService setterGreetingInjectedService() {
        return new SetterGreetingInjectedService();
    }

    @Profile("En")
    @Bean
    I18nEnglishGreetingService i18nService(){
        return new I18nEnglishGreetingService();
    }

    @Profile({"Ar","default"})
    @Bean("i18nService")
    I18nArabeGreetingService i18nArabicService(){
        return new  I18nArabeGreetingService();
    }

    @Profile("cat")
    @Bean
    CatPetService catPetService(){
        return new CatPetService();
    }

    @Profile({"dog", "default"})
    @Bean
    DogPetService dogPetService(){
        return new DogPetService();
    }
}
