package com.springframework.pets;

public class PetServiceFactory {

  public PetService getPetService(String petType) {
    switch (petType) {
    case "cat":
      return new CatPetService();
    default:
      return new DogPetService();
    }
  }
}
