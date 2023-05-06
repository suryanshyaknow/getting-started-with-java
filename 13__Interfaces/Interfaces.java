// ############################ INTERFACES ##################################
/*
i. Interfaces are exactly like abstract classes with the only difference being that
they cannot have any non-abstract methods.

In an abstract class, we can have both abstract and non-abstract methods, whereas
in an interface, all methods must be abstract. This means that an interface only
defines the method signatures, but not their implementation.

ii. More importantly, unlike classes (abstract or not), interfaces allow us to
implement multiple inheritance i.e. a child class can very well inherit properties 
of more than one parent class.

iii. Implementing an interface requires a class to provide implementations for all
the methods defined in the interface, otherwise, it must be declared as an abstract
class itself.

iv. The primary purpose of an interface is to provide a blue print or contract for a
class to implement, rather than providing any implementation details. This allows for
a more flexible and modular design, where different classes can provide their own unique
implementation for a common set of behaviors defined by the interface.
 */

interface Vehicle {
    void start();

    void accelerate(int speed);

    void stop();
}

interface Radio {
    public void turnOn();

    public void turnOff();
}

// Sub-class implementing two interfaces i.e. Multiple Inheritance
class Car implements Vehicle, Radio {
    public void start() {
        System.out.println("Car is starting...");
    }

    public void accelerate(int speed) {
        System.out.println("Car is accelerating at " + speed + "mph...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }

    public void turnOn() {
        System.out.println("Radio is turning on....");
    }

    public void turnOff() {
        System.out.println("Radio is turning off...");
    }

}

public class Interfaces {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.start();
        // car.turnOn(); // Won't work because of run-time polymorphism
        car.accelerate(80);
        car.stop();
        // car.turnOff(); // Won't work because of run-time polymorphism

        System.out.println("\n");

        Radio radCar = new Car();
        // radCar.start(); // Won't work because of run-time polymorphism
        radCar.turnOn();
        // radCar.accelerate(100); // Won't work because of run-time polymorphism
        // radCar.stop(); // Won't work because of run-time polymorphism
        radCar.turnOff();

        System.out.println("\n");

        Car formulaOne = new Car();
        formulaOne.start();
        formulaOne.turnOn();
        formulaOne.accelerate(120);
        formulaOne.stop();
        formulaOne.turnOff();

    }
}