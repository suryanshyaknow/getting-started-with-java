
@FunctionalInterface // An interface consisting of only one method declaration
interface MyInterface {
    void fuckinDoSomething();
}

/**
 * Anonymous Classes
 * 
 * An anonymous class in Java is a class that is defined and instantiated at the
 * same time, without explicitly giving it a name. It is typically used when we
 * need a one-time implementation of an interface or an abstract class, or when
 * we want to override methods of a class without creating a new subclass.
 */

public class i__AnonymousClassExample {

    public static void main(String[] args) {

        // Creating an instance of the `MyInterface` interface using an anonymous class
        MyInterface myInterface = new MyInterface() {
            @Override
            public void fuckinDoSomething() {
                System.out.println("I'm the manifestation of `MyInterface` via an anonymous fuckin' class!");
            }
        };

        // Calling the method of the interface implemented by the said anonymous class
        myInterface.fuckinDoSomething();
    }

}
