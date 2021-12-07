package com.springframework.pets;

public class DogPetService implements PetService {

  @Override
  public String getPetType() {
    return "Dogs are the best!";
  }
}
