// Parent class
class Animal {
    String species;
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

// Constructors in Inheritance
/*
 * When a "derived" class is extended from the "base" class, the constructor of
 * the base class is gonna invoked anyway no matter whether the derived class is
 * having its own constructor or not.
 * 
 * In addition, the constructor of the base class shall be invoked ahead of the
 * base class' provided the base class is having one.
 */

// Child class
class Mammal extends Animal {
    private String furColor;

    public Mammal() {
    }

    public Mammal(String species, String habitat, String furColor) {
        super(species, habitat); // super of class `Mammal` is class `Animal`
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void nurse() {
        System.out.println("The " + getSpecies() + " is nursing its young."); // calling out method of its parent class
    }
}

// Child class
class Reptile extends Animal {
    private boolean isColdBlooded;

    public Reptile(String species, String habitat, boolean isColdBlooded) {
        super(species, habitat);
        this.isColdBlooded = isColdBlooded;
    }

    public boolean getIsColdBlooded() {
        return isColdBlooded;
    }

    public void bask() {
        System.out.println("The " + getSpecies() + " is basking in the sun.");
    }
}

// Grandchild class
class Bat extends Mammal {
    private boolean canFly;

    public Bat(String species) {
        super();
        this.species = species;
    }

    public Bat(String species, String habitat, String furColor, boolean canFly) {

        // Implicit super constructor Mammal() is undefined
        super(species, habitat, furColor); // Must explicitly invoke another constructor
        this.canFly = canFly;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void echolocate() {
        System.out.println("The " + getSpecies() + " is using echolocation to navigate.");
    }
}

// Grandchild class
class Snake extends Reptile {
    private boolean isVenomous;

    public Snake(String species, String habitat, boolean isColdBlooded, boolean isVenomous) {
        super(species, habitat, isColdBlooded);
        this.isVenomous = isVenomous;
    }

    public boolean getIsVenomous() {
        return isVenomous;
    }

    public void shedSkin() {
        System.out.println("The " + getSpecies() + " is shedding its skin.");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        // Create a new Bat object
        Bat bat = new Bat("Fruit Bat", "Tropical Forests", "Brown", true);
        Bat batman = new Bat("Bruce Wayne");

        // Call methods on the Bat object
        System.out.println("Species: " + bat.getSpecies());
        System.out.println("Habitat: " + bat.getHabitat());
        System.out.println("Fur color: " + bat.getFurColor());
        System.out.println("Can fly: " + bat.getCanFly());
        bat.eat();
        bat.move();
        bat.nurse();
        bat.echolocate();

        System.out.println();

        System.out.println("batman.getSpecies(): " + batman.getSpecies());
        System.out.println("batman.getHabitat(): " + batman.getHabitat());
        System.out.println("batman.getFurColor(): " + batman.getFurColor());
        System.out.println("batman.getCanFly(): " + batman.getCanFly());
        batman.eat();
        batman.move();
        batman.nurse();
        batman.echolocate();

        System.out.println('\n');

        // Create a new Snake object
        Snake snake = new Snake("Cobra", "Desert", true, true);

        // Call methods on the Snake object
        System.out.println("Species: " + snake.getSpecies());
        System.out.println("Habitat: " + snake.getHabitat());
        System.out.println("Is cold-blooded: " + snake.getIsColdBlooded());
        System.out.println("Is venomous: " + snake.getIsVenomous());
        snake.eat();
        snake.move();
        snake.bask();
        snake.shedSkin();
    }

}
