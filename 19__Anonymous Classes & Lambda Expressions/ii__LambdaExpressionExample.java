import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@FunctionalInterface
interface GreetingService {
    void sayHey(String name, String message);
}

@FunctionalInterface
interface MessagePrinter {
    void printMessage(int times, String message);
}

public class ii__LambdaExpressionExample {

    public static void main(String[] args) {

        // Using lambda expression with a custom functional interface
        GreetingService greetingService = (name, message) -> {
            System.out.println("Hey, " + name + "! " + message);
        };

        // Invoking the lambda expression
        greetingService.sayHey("Neo", "How's the matrix is goin' on?");

        // Using lambda expression with a built-in interface `Runnable`
        MessagePrinter mPrinter = (times, message) -> {
            for (int i = 0; i < times; i++) {
                System.out.println(message);
            }
        };

        Runnable runnable = () -> mPrinter.printMessage(5, "Transcend the matrix's boundaries!");
        Thread thread = new Thread(runnable);
        thread.start();

        /**
         * Demonstrating that certain Java data structures, like ArrayList, can store
         * heterogeneous types of elements.
         * 
         * I have created an ArrayList without specifying a generic type, which means it
         * will default to storing objects of type "Object". When I add elements to this
         * ArrayList, the elements are treated as Object types, and no type checking or
         * enforcement occurs.
         */
        ArrayList al = new ArrayList();
        al.add("Suryansh");
        al.add(1999);
        al.add(new HashSet<>(Arrays.asList("Spidey", "Shady", "Drizzy")));
        System.out.println(al);
        System.out.println(al.get(0).getClass());
        System.out.println(al.get(1).getClass());
        System.out.println(al.get(2).getClass());
    }
}
