public class PatternsViaRecursion {

    // ########################### Pattern 1 #################################
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

    // displayPattern1(3);
    // displayPattern1(2) + (3 stars and new line);
    // displayPattern1(1) + (2 stars and new line) + (3 stars and new line) + (4
    // stars and new line);
    // displayPattern1(0) + (1 star and new line) + (2 stars and new line) + (3
    // stars and new line) + (4 stars and new line);

    static void displayPattern1(int n) {

        if (n <= 0) {
            return;
        }

        // Print the current row with 'n' asterisks
        displayPattern1(n - 1);

        // Recursively print the remaining rows with n-1, n-2, ... 1 asterisks
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    // ########################### Pattern 2 #################################
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    static void displayPattern2(int n) {

        if (n <= 0) {
            return;
        }

        // Print the first row with 'n' asterisks
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Recursively print the remaining rows with n-1, n-2, ... 1 asterisks
        displayPattern2(n - 1);
    }

    // ########################### Pattern 3 #################################
    // * * * * *
    //   * * * *
    //     * * *
    //       * *
    //         *

    // static void displayPattern3(int n) {
    // if (n <= 0) {
    // return;
    // }

    // for (int i = 0; i < n; i++) {

    // for (int k = 0; k < i; k++) {
    // System.out.print(" ");
    // }

    // for (int j = 0; j < n - i; j++) {
    // System.out.print("*");
    // }
    // System.out.print("\n");
    // }
    // }

    static void displayPattern3(int n, int width) {

        if (n <= 0) {
            return;
        }

        // Print spaces before the asterisks
        for (int i = 0; i < width - n; i++) {
            System.out.print("  ");
        }

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        // Print the first row with 'n' asterisks
        System.out.println();

        displayPattern3(n - 1, width);

    }

    public static void main(String[] args) {

        // Displaying "pattern 1" by recursion
        System.out.println("Pattern 1: ");
        displayPattern1(5);

        // Displaying "pattern 2" by recursion
        System.out.println("\nPattern 2: ");
        displayPattern2(5);

        // Displaying "pattern 3" by recursion
        System.out.println("\nPattern 3: ");
        displayPattern3(5, 5);
    }
}
