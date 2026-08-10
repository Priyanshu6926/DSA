package Arrays.Basics;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ============================================================================
 * MODULE: Data Structures - Dynamic Array (ArrayList)
 * FILE: ArrayListDemo.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Demonstrating dynamic sizing, element operations (add, get, set, remove, size),
 * iteration, and sorting of Java ArrayList.
 */

public class ArrayListDemo {

    public static void main(String args[]) {
        // Generic Integer ArrayList initialization
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements: O(1) amortized
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Initial List: " + list);

        // Get element at index: O(1)
        int element = list.get(0);
        System.out.println("Element at index 0: " + element);

        // Add element at specific index (index, element): O(N)
        list.add(0, 3);
        System.out.println("After insert 3 at index 0: " + list);

        // Modify/Set element at index: O(1)
        list.set(0, 10);
        System.out.println("After setting index 0 to 10: " + list);

        // Delete/Remove element at index: O(N)
        list.remove(3);
        System.out.println("After removing element at index 3: " + list);

        // Get total size
        System.out.println("Current List Size: " + list.size());

        // Traversal using for loop
        System.out.print("Elements via loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sorting list using Collections.sort(): O(N log N)
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}
