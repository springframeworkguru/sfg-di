package org.spring.pets;

//@Service
//@Profile("cat")
public class CatService implements PetService {

    @Override
    public String getPetType() {
        return "Cats are the best!";
    }
}
