package guru.springframework.sfgdi.services;

<<<<<<< Updated upstream
=======
import org.springframework.context.annotation.Profile;
>>>>>>> Stashed changes
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
<<<<<<< Updated upstream
@Service("cat")
=======
@Profile("cat")
@Service
>>>>>>> Stashed changes
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
