package com.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("cat")
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
