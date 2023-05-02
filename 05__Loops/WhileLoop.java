import java.util.Scanner;

public class WhileLoop {

    /* 
    WAP that takes an integer as input and keeps adding the digits of the number until a 
    single-digit number is obtained. Display the single-digit number as output.

    For example, if the input is 1234, the program should add 1 + 2 + 3 + 4 = 10, and then 
    add 1 + 0 = 1, so the output should be 1.
    */ 

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number to check the Single-Digit-Sum: ");
        int num = scanner.nextInt();
        
        int digitSum = 0;

        while (num > 0 || digitSum >= 10) {
            if (num == 0) {
                num = digitSum;
                digitSum = 0;
            }

            digitSum += num % 10;
            num /= 10;
        }
        
        System.out.println("Single-Digit-Sum: " + digitSum);
        scanner.close();

    }
    
}
