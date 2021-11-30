package com.samrit.sfgdi.config;

import com.samrit.pets.PetService;
import com.samrit.pets.PetServiceFactory;
import com.samrit.sfgdi.repositories.EngilishGreetingRepository;
import com.samrit.sfgdi.repositories.EngilishGreetingRepositoryImpl;
import com.samrit.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {


    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }
    @Profile({"dog", "default"})
    @Bean("petService")
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return  petServiceFactory().getPetService("dog");

    }

    @Bean
    @Profile("cat")
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }

    @Bean
    EngilishGreetingRepositoryImpl engilishGreetingRepositoryImp(){
        return new EngilishGreetingRepositoryImpl();


    }

    @Profile("SP")
    @Bean("I18nService")
    I18nSpanishService i18nSpanishService(){
        return  new I18nSpanishService();
    }

    @Profile({"EN", "default"})
    @Bean
    I18nEnglishService I18nService(EngilishGreetingRepository engilishGreetingRepositoryImp){
        return new I18nEnglishService(engilishGreetingRepositoryImp);
    }
    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean
    ConstractorGreetingServiceImpl constractorGreetingServiceImpl(){
        return  new ConstractorGreetingServiceImpl();
    }
    @Bean
    SetterInjectionGreetingService setterInjectionGreetingService(){
        return new SetterInjectionGreetingService();
    }
    @Bean
    PropertyInjectionGreetingService propertyInjectionGreetingService(){
        return new PropertyInjectionGreetingService();
    }

}
