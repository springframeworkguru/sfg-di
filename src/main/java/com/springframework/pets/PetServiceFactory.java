package com.springframework.pets;

import org.springframework.stereotype.Service;

/**
 * Created by vladi on 08/09/2022
 **/
public class PetServiceFactory {

    public PetService getPetService(String petType) {
        switch (petType){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
