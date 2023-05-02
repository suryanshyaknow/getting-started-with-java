import java.util.Scanner;

public class TakingInputfromUser {

    public static void main(String[] args) {

        System.out.println("'sout' ain't working here!");
        System.out.println("Although 'Sout' does work!");
        System.out.println("Letz take input from the fuckin' user: ");

        // the `new` keyword
        /*
        In C++, the `new` keyword is used to allocate memory on the heap dynamically and return a pointer 
        to the allocated memory. This memory must be explicitly released using the `delete` keyword.

        Whereas in Java, the `new` keyword is used to create a new object of a class and return a reference 
        to that object. The Java runtime environment automatically handles memory allocation and garbage 
        collection, so there is no need to manually release the memory associated with an object.         
        */
        
        System.out.print("Enter your age: ");

        // Creating an object of the scanner class to fetch input from the console
        Scanner scanner = new Scanner(System.in); 
        int age = scanner.nextInt(); // To fetch the `int` input entered by the user
        scanner.nextLine(); // To consume the leftover newline character

        System.out.print("Now, enter your name: ");
        String name = scanner.nextLine(); // To fetch the whole string input entered by the user
        scanner.nextLine(); // To consume the leftover newline character
        System.out.println("My name is " + name + " and I'm " + age + " years old.");

        // To check whether the name entered by the user is in actuality `String` or not
        boolean isString = scanner.hasNextLine();
        System.out.println("isString('" + name + "') = " + isString);

        scanner.close();
    }
    
}
