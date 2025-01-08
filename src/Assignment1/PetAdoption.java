package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class PetAdoption {
    private Adopter adopter;
    private List<Pet> adoptedPets;

    public PetAdoption(Adopter adopter) {
        this.adopter = adopter;
        this.adoptedPets = new ArrayList<>();
    }

    public Adopter getAdopter() {
        return adopter;
    }
    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public List<Pet> getAdoptedPets() {
        return adoptedPets;
    }

    public void adoptPet(Pet pet) {
        if (pet.isAdopted()) {
            System.out.println("Pet " + pet.getName() + " is already adopted.");
        } else {
            pet.adopt();
            adoptedPets.add(pet);
            System.out.println("Adopter " + adopter.getName() + " successfully adopted " + pet.getName());
        }
    }

    @Override
    public String toString() {
        return "PetAdoption{adopter=" + adopter + ", adoptedPets=" + adoptedPets + "}";
    }
}
