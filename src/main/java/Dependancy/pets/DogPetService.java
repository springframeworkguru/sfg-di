package Dependancy.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class DogPetService implements PetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
