package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
<<<<<<< Updated upstream
=======
import org.springframework.stereotype.Service;
>>>>>>> Stashed changes

/**
 * Created by jt on 12/28/19.
 */
@Profile({"dog", "default"})
<<<<<<< Updated upstream
public class DogPetService {
=======
@Service
public class DogPetService implements PetService {
>>>>>>> Stashed changes
    public String getPetType(){
        return "Dogs are the best!";
    }
}
