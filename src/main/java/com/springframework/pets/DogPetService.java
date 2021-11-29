package com.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
@Service
public class DogPetService implements PetService {

  @Override
  public String getPetType(){
    return "Dogs are the best!";
  }
}
