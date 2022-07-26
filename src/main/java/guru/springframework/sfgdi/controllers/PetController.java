package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PetService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/28/19.
 */

@Controller
public class PetController {

    public PetController(PetService petService) {
        this.petService = petService;
    }

    private final PetService petService;

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
