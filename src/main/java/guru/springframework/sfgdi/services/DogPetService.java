package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;

/**
 * Created by jt on 12/28/19.
 */
@Profile({"dog", "default"})
public class DogPetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
