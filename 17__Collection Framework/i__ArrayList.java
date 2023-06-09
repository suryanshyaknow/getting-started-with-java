
// import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * ArrayList
 * 
 * i. ArrayList is a dynamic array-like data structure provided by Java's
 * standard library (java.util.ArrayList).
 * 
 * ii. It implements the `List` interface and can store elements of any data
 * type, including objects.
 * 
 * iii. Unlike arrays, ArrayLists have a "flexible size" that can grow or shrink
 * dynamically.
 * 
 * iv. ArrayLists internally use an array to store elements, but they handle
 * resizing and memory management automatically.
 * 
 * v. Elements in an ArrayList are accessed using methods like get() and set(),
 * and they can be added or removed using methods like add() and remove().
 * 
 * vi. ArrayList provides convenient methods for various operations such as
 * sorting, searching, and iteration.
 * 
 * vii. However, ArrayLists have some "additional memory overhead" compared to
 * arrays due to their dynamic resizing capabilities.
 */
public class i__ArrayList {

    public static void displayArrayList(ArrayList arr) {

        System.out.print("[ ");

        for (int i = 0; i < arr.size(); i++) {

            if (i == arr.size() - 1) {
                System.out.print(arr.get(i) + " ]");
                break;
            }

            System.out.print(arr.get(i) + ", ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1972);
        l1.add(1976);
        l1.add(1999);
        l1.add(2004);
        l1.add(2011);
        l1.add(2, 26);
        l1.add(4, 18);
        System.out.println(l1); // Without even explicitly iterating over them using a loop
        // displayArrayList(l1);

        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(9, 8, 11, 12, 5));

        // Adding all elements of ArrayList `l2` into ArrayList `l1`
        // l2.clear(); // Clearing all elements of the ArrayList l2
        System.out.println("\nAdding all elements of ArrayList `l2` into ArrayList `l1`: ");
        l1.addAll(0, l2);
        displayArrayList(l1);

        System.out.println("\nArrayList.contains() method: ");
        System.out.println(l2.contains(1999));
        System.out.println(l1.contains(l2)); // Because the `contains()` method in ArrayList checks for the presence of
                                             // individual elements, not for the presence of another ArrayList as a
                                             // whole.

        // Checking the index of a non-existing element in ArrayList l2
        System.out.println(l2.indexOf(1999)); // -1

        // Checking the index of an element if its frequency is more than one
        System.out.println("\nChecking the index of an element of an ArrayList if its frequency is more than one: ");
        l1.add(1972);
        l1.add(2028);
        System.out.println(l1.indexOf(1972));
        System.out.println(l1.lastIndexOf(1972));
    }
}