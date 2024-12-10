import Assignment1.Pet;
import Assignment1.Adopter;
import Assignment1.Shelter;
import java.io.PrintStream;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Pet dog         = new Pet("Fluff", "Dog", 3);
        Pet cat         = new Pet("Whitey", "Cat", 2);
        Adopter adopter = new Adopter("Dima", 18, "240315");
        Shelter shelter = new Shelter("AITU Pet Foundation", "Mangilik el EXPO C1");

        shelter.addPet(dog);
        shelter.addPet(cat);

        System.out.println(shelter);

        System.out.println("\nAdopter " + adopter.getName() + " adopts " + cat.getName());
        cat.adopt();
        System.out.println(dog);
        System.out.println(cat);

    }
}

