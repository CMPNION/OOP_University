package Assignment1;

// Shelter.java
import java.util.ArrayList;

public class Shelter {
    private String name;
    private String address;
    private ArrayList<Pet> pets;

    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
        this.pets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public ArrayList<Pet> getPets() {
        return pets;
    }
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    @Override
    public String toString() {
        return "Shelter{name='" + name + "', address='" + address + "', pets=" + pets + "}";
    }
}

