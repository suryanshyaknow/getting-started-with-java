import java.util.HashSet;
import java.util.Arrays;

/**
 * Hashing is a technique used to convert data (such as a string, object, or any 
 * other data type) into a fixed-size numeric value called a hash code. This 
 * hash code is used for various purposes, primarily for efficient data retrieval 
 * and storage in hash-based data structures like HashMap, HashSet, and Hashtable.
 * 
 * Here's a simplified explanation of how hashing works in Java:
 * 
 * i. Imagine we have a set of objects, each with its own unique data. To store
 * and retrieve these objects efficiently, we can use a hash-based data
 * structure.
 * 
 * ii. When we add an object to a hash-based data structure, Java applies a
 * "hashing algorithm" to the object's data to generate a unique numeric value
 * called a "hash code". This hash code is usually an integer.
 * 
 * iii. The hashing algorithm is designed to produce a hash code that evenly
 * distributes objects across the available slots in the data structure.
 * Ideally, different objects should have different hash codes, and similar
 * objects should have different hash codes as well (to minimize collisions).
 * 
 * iv. Once the hash code is generated, it is used as an index or key to
 * determine the object's position in the data structure. For example, in a
 * HashMap, the hash code is used to identify the bucket where the object should
 * be stored.
 * 
 * v. When we want to retrieve an object from the hash-based data structure,
 * Java calculates the hash code for the specified data and uses it to find the
 * corresponding position in the data structure. This process allows for fast
 * lookup and retrieval of objects without the need to search through the entire
 * collection.
 * 
 * vi. In situations where multiple objects produce the same hash code (known as
 * a collision), Java uses additional techniques, such as 'chaining' or 'open
 * addressing', to handle the collision and store multiple objects with the same
 * hash code in the data structure.
 */

/**
 * A HashSet in Java is a collection that stores a set of unique elements. It is
 * part of the Java Collections Framework and implements the `Set` interface.
 */

public class iv__HashSet {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>(
                Arrays.asList("Spidey", "Drizzy", "Shinichi", "Spidey", "Shady", "Marshall", "Eminem", "Drizzy"));
        System.out.println(hs);

        // Checking if an element exists in the HashSet
        boolean containsJeezy = hs.contains("Jeezy");
        System.out.println("Contains 'Jeezy'? " + containsJeezy);

        // Removing an element from the HashSet
        boolean removedDrizzy = hs.remove("Drizzy");
        System.out.println("Removed 'Drizzy'? " + removedDrizzy);
        System.out.println(hs);

    }

}