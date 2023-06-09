import java.util.LinkedList;
import java.util.Arrays;

/*
 * LinkedList
 * 
 * i. Addition and deletion of an element from somewhere in the middle indeed 
 * was possible in ArrayList but it'd engage a lot of computational complexity 
 * provided that the size of the array in focus is large.
 * 
 * ii. Performance characteristics: ArrayList generally performs better in 
 * scenarios that involve random access, such as retrieving elements by index. 
 * 
 * LinkedList performs better in scenarios that involve frequent insertion and 
 * deletion of elements in the middle of the list.
 */
public class ii__LinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1972);
        l1.add(1976);
        l1.add(1999);
        l1.add(2004);
        l1.add(2011);
        l1.add(2, 26);
        l1.add(4, 18);
        System.out.println(l1); // Without even explicitly iterating over them using a loop

        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(9, 8, 11, 12, 5));
        System.out.println(l2);

        // Adding elements in the beginning and rear into LinkedList `l1`
        l1.addFirst(1509);
        l2.addLast(2611);
        System.out.println(l1);
    }

}
