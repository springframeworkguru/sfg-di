package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PetService;
<<<<<<< Updated upstream
=======
import org.springframework.stereotype.Controller;
>>>>>>> Stashed changes

/**
 * Created by jt on 12/28/19.
 */
<<<<<<< Updated upstream
=======
@Controller
>>>>>>> Stashed changes
public class PetController {

    private final PetService petService;

<<<<<<< Updated upstream
=======
    public PetController(PetService petService) {
        this.petService = petService;
    }

>>>>>>> Stashed changes
    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
