// Parent class
class Animal {
    private String species;
    private String habitat;

    public Animal() {
    }

    public Animal(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
    }

    public String getSpecies() {
        return species;
    }

    public String getHabitat() {
        return habitat;
    }

    public void eat() {
        System.out.println("The " + species + " is eating.");
    }

    public void move() {
        System.out.println("The " + species + " is moving.");
    }
}

// Child class
class Mammal extends Animal {
    private String furColor;

    public Mammal() {
    }

    public Mammal(String species, String habitat, String furColor) {
        super(species, habitat);
        this.furColor = furColor;
    }

    @Override
    public void eat() {
        System.out.println("The " + super.getSpecies() + " refuses to eat.");
    }

    @Override
    public void move() {
        System.out.println("The " + super.getSpecies() + " won't move.");
    }

    public String getFurColor() {
        return furColor;
    }

    public void nurse() {
        System.out.println("The " + getSpecies() + " is nursing its young.");
    }
}

public class MethodOverrriding {

    public static void main(String[] args) {

        Mammal mammoth = new Mammal("Mammuthus primigenius", "Steppe Tundra Habitat", "brown");
        mammoth.eat(); // invoking overridden method
        mammoth.move(); // invoking overridden method
        mammoth.nurse();
    }

}
