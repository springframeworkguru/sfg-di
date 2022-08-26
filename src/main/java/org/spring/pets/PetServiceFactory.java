package org.spring.pets;

public class PetServiceFactory {

    public PetService getPetService(String petType) {
        return switch (petType) {
            case "dog" -> new DogService();
            case "cat" -> new CatService();
            default -> new DogService();
        };
    }
}
