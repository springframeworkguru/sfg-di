package com.springframework.pets;

/**
 * User: p_sha
 * Date: Fri 19 Mar 2021
 */
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
