package Assignment1;

public class Pet {
    private String name;
    private String species;
    private int age;
    private boolean adopted;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.adopted = false;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isAdopted() {
        return adopted;
    }
    public void adopt() {
        this.adopted = true;
    }

    @Override
    public String toString() {
        return "Pet{name='" + name + "', species='" + species + "', age=" + age + ", adopted=" + adopted + "}";
    }
}
