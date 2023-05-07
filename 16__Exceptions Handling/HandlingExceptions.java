import java.util.InputMismatchException;
import java.util.Scanner;

// ############################## Exception Handling ####################################

// Extending the original Exception class
class CustomAgeException extends Exception {

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        // return super.toString();
        return "Be somewhat pragamatic, anyway you'd live up to 75 years!";
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        // return super.getMessage();
        return "Enter an unrealistic age, dude. God'd anyway let you live this longer despite all the fuckery you might have had scattered!";
    }

}

public class HandlingExceptions {

    public static void main(String[] args) {

        int[] arr = { 15, 9, 17, 8, 26, 11, 18, 12, 10, 5 };
        Scanner scanner = new Scanner(System.in);

        // Validating an user's input...
        while (true) {
            System.out.print("\nEnter the index of the array you wanna access: ");

            try {

                int userInput = scanner.nextInt();
                scanner.nextLine(); // consuming the end-of-line character after reading the integer

                System.out.print("Here's your output: " + arr[userInput]);
                System.out.println("\n");
                break;

            } catch (IndexOutOfBoundsException e) {

                System.out.println("Invalid index! Please enter an index within range (0-" + (arr.length - 1) + ").");
                e.printStackTrace();

            } catch (InputMismatchException e) {

                System.out.println(e);
                System.out.println("Kindly follow the standards and enter a fuckin' integer!");
                e.printStackTrace();
                scanner.nextLine(); // consuming the newline character

            } catch (Exception e) {

                System.out.println(e);
                e.printStackTrace();
                scanner.nextLine(); // consuming the newline character

            }
        }

        // Throwing a Custom Exception...
        int age;
        while (true) {
            System.out.print("\nEnter an unrealistic age you'd wanna live up to: ");

            age = scanner.nextInt();
            scanner.nextLine(); // consuming a newline character

            if (age <= 75) {
                try {
                    throw new CustomAgeException();
                } catch (Exception e) {

                    System.out.println(e);
                    System.out.println(e.getMessage());
                    continue;

                }
            }
            System.out.println("Woah boi!");
            break;
        }
        scanner.close(); // Closing the 'Scanner' object
    }
}
