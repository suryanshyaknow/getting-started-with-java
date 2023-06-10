import java.util.HashMap;
import java.util.Map;

/**
 * HashMap
 * 
 * The HashMap class uses a hashing algorithm to determine the index at which
 * key-value pairs are stored and retrieved.
 * 
 * Here's a simplified explanation of how Java implements the hashing algorithm
 * in HashMap:
 * 
 * i. Hashing Function: Java uses the hashCode() method of the key objects to
 * compute a hash code for each key. The hashCode() method should return an
 * integer that represents the object's state and is typically computed based on
 * the object's fields.
 * 
 * ii. Index Calculation: Once the hash code is obtained for a key, Java applies
 * an additional calculation to convert the hash code into an index within the
 * underlying array of buckets. This calculation involves using the bitwise AND
 * operation on the hash code and the length of the array of buckets.
 * 
 * iii. Buckets: The HashMap internally maintains an array of buckets, where
 * each bucket can hold multiple key-value pairs. The calculated index
 * corresponds to a specific bucket in the array.
 * 
 * iv. Handling Collisions: Since multiple keys can potentially have the same
 * hash code or compute to the same index, collisions can occur. To handle
 * collisions, Java uses a technique called "separate chaining". Each bucket in
 * the array is actually the head of a linked list. If multiple key-value pairs
 * have the same index, they are stored as nodes in the linked list within that
 * bucket.
 * 
 * v. Retrieving Values: When you want to retrieve a value associated with a
 * key, Java uses the same hashing algorithm to compute the index for that key.
 * It then traverses the linked list within the corresponding bucket to find the
 * specific key-value pair.
 * 
 * vi. Resizing: As the number of key-value pairs increases and the "load
 * factor" (ratio of entries to the capacity) exceeds a certain threshold, the
 * HashMap automatically resizes the underlying array of buckets to maintain
 * efficiency.
 * This process involves creating a larger array and rehashing the key-value
 * pairs to distribute them across the new buckets.
 */

public class v__HashMap {

    public static void main(String[] args) {

        // Create a HashMap to store key-value pairs
        HashMap<String, Integer> hmap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hmap.put("Spidey", 1999);
        hmap.put("Suryansh", 1999);
        hmap.put("Shady", 1976);
        hmap.put("Drizzy", 1985);
        hmap.put("Jeezy", 1980);
        System.out.println("hashmap: " + hmap);

        // Creating a HashMap on the go
        Map<String, Integer> map = new HashMap<>() {
            {
                put("Apple", 5);
                put("Banana", 10);
                put("Orange", 8);
                put("Mango", 12);
                put("Grapes", 15);
            }
        }; // "Double Brace Initialization"
        System.out.println("map: " + map);

        // Accessing the value associated with a specific key
        System.out.println(hmap.get("Spidey"));

        // Checking if a key exists in the HashMap
        System.out.println(hmap.containsKey("Suryansh"));

        // Removing a key-pair
        System.out.println(hmap.remove("Suryansh"));
        System.out.println(hmap);

    }
}