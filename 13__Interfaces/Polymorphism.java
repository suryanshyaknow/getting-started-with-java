class Monkey {
    String name;

    Monkey() {
        name = "Neer";
    }

    Monkey(String name) {
        this.name = name;
    }

    void jump() {
        System.out.println(name + " is jumping...");
    }

    void bite() {
        System.out.println(name + " would bite.");
    }
}

interface BasicCreature {
    void eat();

    void sleep();
}

// Class inheriting `Monkey` and implementing `BasicCreature`
class Human extends Monkey implements BasicCreature {
    String name;

    public Human() {
        super();
    }

    public Human(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating...");
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

    @Override
    public void jump() {
        System.out.println(name + " can very well jump.");
    }

    @Override
    public void bite() {
        System.out.println("Why would " + name + " bite for no fucking reason?!");
    }

    public void engage() {
        System.out.println(name + " is engaging in materialistic activities...");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Human manav = new Human("Manav");
        manav.eat();
        manav.sleep();
        manav.jump();
        manav.bite();

        // Demonstrating Polymorphism
        System.out.println();
        Monkey vanar = new Human("Null");
        vanar.jump();
        vanar.bite(); // Overrriden method got implemented

        // The following methods can't be invoked for obvious reasons!
        // vanar.eat();
        // vanar.sleep();
        // vanar.engage();

        System.out.println();
        BasicCreature amoeba = new Human("Amoeba");
        amoeba.eat();
        amoeba.sleep();
        // amoeba.jump();
        // amoeba.bite();
        // amoeba.engage();

    }

}
