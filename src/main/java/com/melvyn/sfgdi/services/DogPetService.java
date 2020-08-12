package com.melvyn.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Melvyn on 12/Aug/2020
 */
@Profile({"dog", "default"})
@Service("myPet")
public class DogPetService implements PetService {
    @Override
    public String getPetType(){
        return "Dogs are the best!";
    }
}
