public class Arrays {
    public static void main(String[] args) {

        // 1. WAP to find out whether a given element is present in an array or not
        int[] arr = { 1972, 1976, 1999, 2004, 2011 };
        int ele = 2013;
        boolean isInArray = false;

        for (int element : arr) {
            if (element == ele) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The given `ele` is present in the given array!");
        } else {
            System.out.println("The given `ele` ain't in the given array!");
        }

        // 2. Displaying out a 3D array
        /*
         * A 3D array with dimensions of 3x4x5 can be interpreted as 3 copies of 4x5
         * arrays stacked on top of each other. Each of the 3 "slices" of the 3D array
         * would be a 2D array.
         * 
         * When visualizing a 3D array, it is important to keep in mind the order of the
         * dimensions. In this case, the first dimension (index 0) represents the
         * "depth" of the 3D array, while the second dimension (index 1) represents the
         * rows, and the third dimension (index 2) represents the columns.
         */

        int[][][] array3D = new int[3][4][5];

        // Initializing the array with some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    array3D[i][j][k] = (i * j * k) + 1;
                }
            }
        }

        // Printing out the contents of the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println(); // Print a newline after each row
            }
            System.out.println(); // Print a newline after each "slice"
        }

        // 3. Add two matrices of size 2 x 3
        int[][] A = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] B = { { 2, 6, 13 }, { 4, 7, 1 } };
        int[][] C = new int[2][3];

        // Adding corrosponding all elements of matrices A and B
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Displaying the elements of the resultant matrix C
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // 4. WAP to reverse an array
        int[] A1 = { 1999, -2011, 1972, 1976, 2004 };
        int[] A2 = { 26, 11, 10, 18, 15, 17 };
        int[] toBeReversed = A2;

        System.out.println("Before reversal: ");
        for (int i = 0; i < toBeReversed.length; i++) {
            System.out.print(toBeReversed[i] + " ");
        }

        for (int i = 0; i < Math.floorDiv(toBeReversed.length, 2); i++) {
            // Swap arr[i] and arr[l - 1 - i]
            int temp = toBeReversed[toBeReversed.length - 1 - i];
            toBeReversed[toBeReversed.length - 1 - i] = toBeReversed[i];
            toBeReversed[i] = temp;
        }

        System.out.println("\n\nAfter Reversal: ");
        for (int i = 0; i < toBeReversed.length; i++) {
            System.out.print(toBeReversed[i] + " ");
        }

        // 5. WAP to find the `maximum` and `minimum` element in an array
        System.out.println("\nInteger.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MIN_VALUE);

        int max = Integer.MIN_VALUE;
        for (int elem : A1) {
            if (elem > max) {
                max = elem;
            }
        }
        System.out.println("Largest value in the array A1 is " + max);

        int min = Integer.MAX_VALUE;
        for (int elem : A1) {
            if (elem < min) {
                min = elem;
            }
        }
        System.out.println("Smallest value in the array A1 is " + min);

    }
}
