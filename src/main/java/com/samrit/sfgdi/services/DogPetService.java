package com.samrit.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
@Service("pet")
public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dog Are The Best";
    }
}
