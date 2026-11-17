package Wrapper_Classes_And_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class ArrayList_Demo {
    static void main() {
        // this is for the dymanic size.
        // java Arraylist is the class
        // ArrayList is the non primitive and is become in the heap memory.
        ArrayList<Integer> list = new ArrayList<>(100); // this will change the capacity to 100 and get the things done.
        // this is concept for the generics.
        // size is 0 in the arraylist
        // capacity is maximum number of elements that can be put in the memory.
        // by default iski capacity 10 hoti hain.
        // add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(1, 12);
        System.out.println(list);
        // get
        System.out.println(list.get(2)); // O(1) time complexity hoti hain iski and get the things done.
        // remove
        System.out.println(list.remove(2));
        System.out.println(list);
        // update
        list.set(1, -2);
        System.out.println(list);
        Collections.sort(list); // this is used for sorting the ArrayList.
        // for sorting the list in the reverse order.
        Collections.sort(list, Collections.reverseOrder()); // reverse order sorting.


        // Traversal in the Arraylist.
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // forEach loop or enhanced for loop for doing the traversal without accessing the index in this list.
        int[] arr = new int[5];
        // for arrayList
        for (int element : list) {
            System.out.println(element);
        }
        // for array
        for (int element : arr) {
            System.out.println(element);
        }
        // ArrayList me hum index skip karke hum values add nhi kar sakte hain.
        // jaise humara size or capacity equal hua
        // ArrayList humara (OldCapacity * 1.5) se grow karta hain.
        // Hum constant time isliye bol paa rahe hain kyuki copy karne ka time jo hain wo on an average 2 lag raha hain.
        // Vector Java me bhi hote hain jaise C++ me hota hain.
        // Vector me capacity ki growth 2 times hoti hain.
        Vector<Integer> listVector= new Vector<>();
        System.out.println(listVector.capacity());
        System.out.println(list.add(12));
        // Jo difference hota hain vector aur ArrayList me ki Vector Thread safe hota hain aur ArrayList Thread safe nhi hota hain.
        // Thread Safe matlab hota hain ki Vector automatically synchronize kar lega aur ArrayList me esa nhi hota hain.
        // Hume coding me isse koi matlab nhi hota hain ye sirf development me hota hain.

    }
}
