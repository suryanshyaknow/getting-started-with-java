import java.math.BigInteger;

public class Recursion {

    // Computation of Factorial via Recursion
    // static long long int getFactorial // Won't wrok here!
    static BigInteger getFactorial(int num) {

        if (num == 0 || num == 1) {
            return BigInteger.ONE;
        }
        // return BigInteger.valueOf(num) * getFactorial(num - 1); // Won't cut here!
        return BigInteger.valueOf(num).multiply(getFactorial(num - 1));
    }

    // Nth term of fibonaccci sequence via Recursion
    static long getNthFibonacciTerm(int num) {

        if (num == 0 || num == 1) {
            return num;
        }
        return getNthFibonacciTerm(num - 2) + getNthFibonacciTerm(num - 1);
    }

    // Displaying the fibonacci sequence
    static void displayFibonacci(int n) {

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.println(getNthFibonacciTerm(i));
                break;
            }
            System.out.print(getNthFibonacciTerm(i) + ", ");
        }
        System.out.println("\n");
    }

    // Recursive function to compute the sum of first 'n' natural numbers
    static int getSum(int n) {
        if (n == 1) {
            return n;
        }
        return n + getSum(n - 1);
    }

    // Average of a set of numbers passed as arguments
    public static int getAverage(int... nums) {

        int n_terms = nums.length;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / n_terms;
    }

    public static void main(String[] args) {

        // Computation of factorial via Recursion
        System.out.println("26 factorial = " + getFactorial(26));

        // Displaying fibonacci sequence upto a certain term
        System.out.println("Displaying the fibonacci sequence upto 10th term: ");
        displayFibonacci(10);

        // Sum of first `n` natural terms
        System.out.println("Sum of first 50 natural terms: " + getSum(50));

        // Average of arguments passed
        System.out.print("\nAverage of arguments passed: ");
        System.out.println(getAverage(26, 11, 1999, 15, 1972, 9));

    }
}
