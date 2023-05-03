class Person {

    String name; // access-modifier is `package-private` here
    private int age;

    public void displayAttributes() {
        System.out.println(name + " is " + age + " years old.");
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class CustomClass {

    public static void main(String[] args) {

        System.out.println("`Person` is our custom class!");
        Person spidey = new Person(); // object instantiation
        Person suryansh = new Person();

        // Setting Attributes
        // spidey.age = 22; --> CustomClass.java:23: error: age has private access in Person
        spidey.name = "spideyyaknow";
        // suryansh.age = 23; --> CustomClass.java:23: error: age has private access in Person
        suryansh.name = "suryanshtheysay";

        // Getting Attributes
        System.out.println();
        System.out.println("spidey.name = " + spidey.name); 
        System.out.println("suryansh.name = " + suryansh.name); // O years old

        // Invoking the instance methods
        System.out.println();
        suryansh.displayAttributes(); // O years old
        spidey.displayAttributes(); // O years old
        
        // Setting `private` attributes via "Setters"
        suryansh.setAge(23);
        spidey.setAge(24);
        
        // Invoking the instance methods
        System.out.println();
        suryansh.displayAttributes(); // 23 years old now
        spidey.displayAttributes(); // 24 years old now

    }
}
