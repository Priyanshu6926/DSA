package Arrays.Basics;

import java.util.Scanner;

/*
 * ============================================================================
 * MODULE: Data Structures - 1D Array Basics
 * FILE: ArrayBasics.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Fundamental 1D array operations in Java: static initialization, user input,
 * dynamic sizing, linear search for element x, and array of Strings.
 */

public class ArrayBasics {

    /*
     * ------------------------------------------------------------------------
     * EXERCISE 1: Direct Array Initialization & Print
     * ------------------------------------------------------------------------
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void directInitExample() {
        int marks[] = new int[3];
        marks[0] = 98;
        marks[1] = 78;
        marks[2] = 85;
        System.out.println("Marks[0]: " + marks[0]);
        System.out.println("Marks[1]: " + marks[1]);
        System.out.println("Marks[2]: " + marks[2]);
    }

    /*
     * ------------------------------------------------------------------------
     * EXERCISE 2: Array Literal Initialization & Iteration
     * ------------------------------------------------------------------------
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static void arrayLiteralExample() {
        int marks[] = {98, 78, 85};
        for (int i = 0; i < 3; i++) {
            System.out.println("Element at " + i + ": " + marks[i]);
        }
    }

    /*
     * ------------------------------------------------------------------------
     * EXERCISE 3: User Input Array & Linear Search for Element x
     * ------------------------------------------------------------------------
     * Input: size = 5, elements = {10, 20, 30, 40, 50}, x = 30
     * Expected Output: Index of x: 2
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public static void inputAndLinearSearch(Scanner sc) {
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter target element x to search: ");
        int x = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("Found x at index: " + i);
            }
        }
    }

    /*
     * ------------------------------------------------------------------------
     * EXERCISE 4: Array of Names Input & Output
     * ------------------------------------------------------------------------
     * Input: size = 3, names = {"Alice", "Bob", "Charlie"}
     * Expected Output: Alice, Bob, Charlie (printed line by line)
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public static void arrayOfNames(Scanner sc) {
        System.out.print("Enter size of names array: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }
        System.out.println("Names entered:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void main(String args[]) {
        System.out.println("--- 1. Direct Initialization ---");
        directInitExample();

        System.out.println("\n--- 2. Array Literal ---");
        arrayLiteralExample();
    }
}
