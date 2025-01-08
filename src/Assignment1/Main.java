package Assignment1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create shelter and pets
        Shelter shelter = new Shelter("AITU Pet Foundation", "Mangilik el EXPO C1");
        Pet dog = new Pet("Fluff", 3, "Dog");
        Pet cat = new Pet("Whitey", 2, "Cat");
        Pet rabbit = new Pet("Hopper", 1, "Rabbit");

        // Add pets to shelter
        shelter.addPet(dog);
        shelter.addPet(cat);
        shelter.addPet(rabbit);

        System.out.println("All Pets in Shelter:");
        System.out.println(shelter);

        // Filter pets by species
        System.out.println("\nFilter by species (Cat):");
        List<Pet> cats = shelter.filterBySpecies("Cat");
        cats.forEach(System.out::println);

        // Search pets by name
        System.out.println("\nSearch by name (Fluff):");
        List<Pet> searchResults = shelter.searchByName("Fluff");
        searchResults.forEach(System.out::println);

        // Sort pets by age
        System.out.println("\nPets sorted by age:");
        List<Pet> sortedPets = shelter.sortByAge();
        sortedPets.forEach(System.out::println);

        // Adopt a pet
        System.out.println("\nAdopting a pet...");
        cat.adopt();
        System.out.println(cat);
    }
}
