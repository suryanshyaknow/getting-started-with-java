import java.util.Scanner;

public class ForLoops {

    /*
    Write a program that takes a positive integer n as input and prints the first n terms of 
    the Fibonacci sequence. The Fibonacci sequence is a sequence of numbers where each number 
    is the sum of the two preceding ones, starting from 0 and 1. 
    
    The first 10 terms of the sequence are: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

    Your program should use a for loop to compute and print the first n terms of the Fibonacci sequence.
    */
    public static void main(String[] args) {

        System.out.print("Enter the number of terms you want of the Fibonacci sequence: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int a = 0;
        int b = 1;

        if (n == 0 || n == 1) {
            System.out.println(n);
        }
        else if (n < 0) {
            System.out.println("Incorrect input for number of terms to be displayed!");
        }

        System.out.println("Printing the first " + n + " terms of the Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            
            System.out.print(a + " ");

            int temp = b;
            b = a + b;
            a = temp;            
        }
        scanner.close();        
    }
    
}
