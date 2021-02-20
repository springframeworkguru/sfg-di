package com.springframework.pets;


/**
 * Created by jt on 12/28/19.
 */
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
