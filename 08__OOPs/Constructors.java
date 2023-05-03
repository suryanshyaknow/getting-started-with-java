class Person {

    String name; // access-modifier is `package-private` here
    private int age;

    // default Constructor
    public Person() {
    }

    // parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayAttributes() {
        System.out.println(name + " is " + age + " years old.");
    }

}

public class Constructors {

    public static void main(String[] args) {

        System.out.println("`Person` is our custom class with a constructor!");
        Person andrew = new Person(); // object instantiation
        Person spidey = new Person("spideytheysay", 24); // object instantiation
        Person suryansh = new Person("suryanshyaknow", 23);

        // Getting Attributes
        // We can access the `name` attribute only because it ain't `private`
        System.out.println();
        System.out.println("andrew.name = " + andrew.name);
        System.out.println("spidey.name = " + spidey.name);
        System.out.println("suryansh.name = " + suryansh.name);

        // Invoking the instance methods
        System.out.println();
        andrew.displayAttributes(); // will get default values of `String` and `int`
        suryansh.displayAttributes();
        spidey.displayAttributes();
    }
}
