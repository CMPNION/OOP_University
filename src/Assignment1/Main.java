package Assignment1;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Fluff", "Dog", 3);
        Pet cat = new Pet("Whitey", "Cat", 2);
        Adopter adopter = new Adopter("Dima", 18, "240315");
        Shelter shelter = new Shelter("AITU Pet Foundation", "Mangilik el EXPO C1");

        shelter.addPet(dog);
        shelter.addPet(cat);

        System.out.println("All Pets in Shelter:");
        System.out.println(shelter);

        // Adopter adopts a pet
        PetAdoption petAdoption = new PetAdoption(adopter);
        petAdoption.adoptPet(cat);  // Cat is adopted
        petAdoption.adoptPet(dog);  // Dog is adopted

        // Check the adoption status
        System.out.println("\nAdopter and their adopted pets:");
        System.out.println(petAdoption);

        System.out.println("\nUpdated Shelter details:");
        System.out.println(shelter);

        System.out.println("\nAttempting to re-adopt an already adopted pet:");
        petAdoption.adoptPet(cat);  // Attempt to adopt an already adopted pet
    }
}
