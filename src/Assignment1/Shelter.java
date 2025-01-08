package Assignment1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Shelter {
    private String name;
    private String address;
    private List<Pet> pets;

    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public List<Pet> getPets() {
        return pets;
    }

    public List<Pet> filterBySpecies(String species) {
        return pets.stream()
                .filter(pet -> pet.getSpecies().equalsIgnoreCase(species))
                .collect(Collectors.toList());
    }

    public List<Pet> searchByName(String name) {
        return pets.stream()
                .filter(pet -> pet.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<Pet> sortByAge() {
        return pets.stream()
                .sorted(Comparator.comparingInt(Pet::getAge))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Shelter{name='" + name + "', address='" + address + "', pets=" + pets + "}";
    }
}
