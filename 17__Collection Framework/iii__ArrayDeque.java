import java.util.ArrayDeque;

/**
 * ArrayDeque
 * 
 * i. Imagine you have a deck of cards, and you can add or remove cards from
 * both ends of the deck. ArrayDeque is just like that deck of cards, but in
 * computer memory.
 * 
 * ii. ArrayDeque is a data structure that allows us to add or remove elements
 * from both the front and the back efficiently.
 * 
 * It's called "ArrayDeque" because it internally uses an array to store the
 * elements and supports double-ended operations like a deck of cards.
 * 
 * iii. ArrayDeque internally uses an array to store its elements, but unlike a
 * regular array, it allows "dynamic resizing" to accommodate elements being
 * added or removed from both ends. It maintains a circular structure to
 * efficiently utilize the array.
 */

public class iii__ArrayDeque {

    public static void main(String[] args) {

        // Create an empty ArrayDeque
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        // Adding elements to the deque
        ad.addFirst(1972);
        ad.add(1850);
        ad.add(1550);
        ad.add(1650);
        ad.add(1700);
        ad.addLast(1976);
        /**
         * `offerFirst()`: This method 'attempts' to add the specified element at the
         * front of the deque. If the deque is not full, the element is added
         * successfully, and the method returns true.
         * 
         * If the deque is full and cannot accommodate more elements (reaching its
         * capacity), the offerFirst() method will not throw an exception but instead
         * return false.
         */
        ad.offerFirst(1999); // Won't throw an exception if can't hold anymore elements
        ad.offerLast(2004);

        // Displaying deque
        System.out.println("Deque: " + ad);

        // Accessing elements
        int firstElement = ad.getFirst(); // Get the first element
        int lastElement = ad.getLast(); // Get the last element
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Accessing elements at specific indices
        /**
         * Note that ArrayDeque does not provide direct access to elements by index like
         * an ArrayList or a regular array. Instead, we'll need to traverse the deque
         * from either end.
         * 
         * Say, we wanna access the 4th element, let's see how:
         */
        int fourthElement = Integer.MIN_VALUE;
        int desiredIdx = 3;
        int currentIdx = 0;
        for (int ele : ad) {
            if (currentIdx == desiredIdx) {
                fourthElement = ele;
            }
            currentIdx++;
        }
        System.out.println("Fourth Element: " + fourthElement);

        // Removing elements
        int removedFirst = ad.removeFirst(); // Remove and return the first element
        int removedLast = ad.removeLast(); // Remove and return the last element
        System.out.println("Removed First Element: " + removedFirst);
        System.out.println("Removed Last Element: " + removedLast);

        // Displaying deque
        System.out.println("Deque(after removal of elements): " + ad);

        // Check if deque is empty
        boolean isEmpty = ad.isEmpty();
        System.out.println("Is Deque Empty? " + isEmpty);

    }

}

/**
 * Internal Working of Deque:
 * 
 * i. Array storage: ArrayDeque uses an array to store its elements. Initially,
 * it creates an internal array with a certain capacity (e.g., 16). The elements
 * are stored in this array in a circular manner.
 * 
 * ii. Front and rear pointers: ArrayDeque maintains two pointers, front and
 * rear, which represent the indices of the first and last elements in the
 * deque.
 * 
 * iii. Dynamic resizing: When elements are added or removed, ArrayDeque
 * dynamically resizes the internal array if necessary. If the deque becomes
 * full, it doubles the size of the array. If the number of elements in the
 * deque falls below a certain threshold, it may shrink the array to conserve
 * memory.
 * 
 * iv. Circular structure: ArrayDeque utilizes a circular structure by wrapping
 * around the ends of the internal array. This means that when a new element is
 * added at the front or rear, it may occupy a position that was previously
 * used. This circular behavior helps in efficient space utilization and avoids
 * excessive shifting of elements.
 * 
 * v. Adding elements: When adding an element at the front or rear, ArrayDeque
 * adjusts the corresponding pointer and places the element in the appropriate
 * position. If the internal array is full, it resizes the array to accommodate
 * the new element.
 * 
 * vi. Removing elements: When removing an element from the front or rear,
 * ArrayDeque adjusts the corresponding pointer to exclude that element. If the
 * number of elements falls below a certain threshold, it may resize the array
 * to conserve memory.
 */