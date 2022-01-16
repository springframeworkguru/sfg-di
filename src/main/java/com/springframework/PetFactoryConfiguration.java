package com.springframework;

import com.springframework.pets.CatPetService;
import com.springframework.pets.DogPetService;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class PetFactoryConfiguration {



    @Bean
    PetServiceFactory petFactory(){
        return  new PetServiceFactory();

    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petFactory){
        return petFactory.getPetService("cat");
    }
    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }


}
