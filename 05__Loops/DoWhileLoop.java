import java.util.Scanner;

public class DoWhileLoop {

    /* 
    Problem Statement: WAP to keep taking input of numbers from the user until the user enters a negative number. 
    After the user enters a negative number, display the sum of all the positive numbers entered by the user.
    */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;

        do {
            System.out.print("Kindly, enter a fucking number: ");
            num = scanner.nextInt();

            if (num < 0) {
                break;
            }
            sum += num;
        } while (true);

        System.out.println("\nThe resultant sum: " + sum);
        scanner.close();
    }
    
}
