// ############################ Abstract Classes ##################################
/*
 * i. In OOPs an abstract class is a class that cannot be instantiated directly but must be
 * subclassed.
 *
 * Abstract classes are used to provide a common template or blueprint for a set of related
 * subclasses. They contain one or more abstract methods, which are methods that have a declared
 * method signature but no implementation. These methods must be implemented by any concrete
 * subclasses that extend the abstract class
 *
 * ii. Abstract classes can also contain concrete methods, which are methods with an implementation,
 * and can have instance variables and constructors. Concrete methods in an abstract class provide
 * a default implementation that can be used by the subclasses. The subclass can choose to use the
 * implementation provided by the parent class or override it with its own implementation.
 *
 *
 * The purpose of an abstract class is to define a common interface for a set of subclasses and to
 * provide some default implementations, while 'forcing' subclasses to implement certain methods in
 * their own way.
 */

// Abstract class
abstract class Vehicle {
    private String manufacturer;
    private String model;
    int year;

    public Vehicle(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = 1999;
    }

    public abstract void start();

    public abstract void stop();

    public void printDetails() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Concrete class
class Car extends Vehicle {

    // The type Car must implement the inherited abstract method Vehicle.start()
    // The type Car must implement the inherited abstract method Vehicle.stop()

    public Car(String manufacturer, String model, int year) {
        super(manufacturer, model); // calling the constructor of the abstract class
        super.year = year;
    }

    @Override
    public void start() {
        System.out.println("Starting the car...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car...");
    }


    public void drive() {
        System.out.println("Driving my freakin' car...");
    }
}

// Another concrete class
class Bike extends Vehicle {
    // The type Car must implement the inherited abstract method Bike.start()
    // The type Car must implement the inherited abstract method Bike.stop()

    public Bike(String manufacturer, String model, int year) {
        super(manufacturer, model); // calling the constructor of the abstract class
        super.year = year;
    }

    @Override
    public void start() {
        System.out.println("Starting the bike...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the bike...");
    }

    public void ride() {
        System.out.println("Riding my hellish bike...");
    }

}

public class AbstractClasses {

    public static void main(String[] args) {

        // Vehicle myVehicle = new Vehicle("Ford", "Mustang"); // Can't be instantiated!

        // Instantiating `Car` class via Dynamic Memory Dispatch
        Vehicle myCar = new Car("Ford", "Mustang", 1981);
        myCar.printDetails();
        myCar.start();
        // myCar.drive(); // Won't run because of Run-time Polymorphism
        ((Car) myCar).drive(); // Upcasting
        myCar.stop();

        System.out.println("\n");

        // Instantiating `Bike` class
        Bike myMotorcycle = new Bike("Harley-Davidson", "Sportster", 2022);
        myMotorcycle.printDetails();
        myMotorcycle.start();
        myMotorcycle.ride();
        myMotorcycle.stop();
    }
}
