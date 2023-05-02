import java.util.Random;

public class Reference {

    public static void trynaChangeArr(int[] arr) {
        Random random = new Random();
        int rand = random.nextInt(arr.length);
        arr[rand] = 1999;
    }

    public static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        /*
         * In C++, an array variable such as `arr` is treated as a "pointer" to the
         * first element of the array. That is, `arr` is a pointer that points to the
         * memory location where the first element of the array is stored.
         * 
         * 
         * Whereas, in Java, an array variable such as `arr` is treated as a reference
         * to an array object. That is, `arr` is a "reference" to an object that
         * represents the entire array.
         */

        int[] arr = { 15, 9, 17, 8, 26, 11, 18, 12, 10, 5 };
        int[] ref = arr; // assign arr to a reference

        System.out.println("Reference to the array `arr` is " + ref);

        // And accordingly, any changes made to the array through one reference will be
        // reflected through all the other references to the same array.
        System.out.println("Array `arr` before any changes done via the copy of its reference: ");
        displayArr(arr);

        trynaChangeArr(arr);

        System.out.println("Array `arr` after making some changes via the copy of its reference: ");
        displayArr(arr);

    }
}
