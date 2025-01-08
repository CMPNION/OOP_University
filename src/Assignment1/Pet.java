package Assignment1;

public class Pet extends Animal {
    private String species;
    private boolean adopted;

    public Pet(String name, int age, String species) {
        super(name, age);
        this.species = species;
        this.adopted = false;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void adopt() {
        this.adopted = true;
    }

    @Override
    public String toString() {
        return super.toString() + ", species='" + species + "', adopted=" + adopted + "}";
    }
}
