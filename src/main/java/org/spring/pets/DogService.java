package org.spring.pets;

//@Service
//@Profile({"dog", "default"})
public class DogService implements PetService {
    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
