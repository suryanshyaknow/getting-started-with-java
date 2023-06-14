
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

    }
}
