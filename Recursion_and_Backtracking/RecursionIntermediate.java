package Recursion_and_Backtracking;

/*
 * ============================================================================
 * MODULE: Recursion Level 2 (Intermediate)
 * FILE: RecursionIntermediate.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Intermediate recursive algorithms: Tower of Hanoi, String Reversal,
 * First and Last Occurrence of Character, and Checking if Array is Sorted.
 */

public class RecursionIntermediate {

    /*
     * ------------------------------------------------------------------------
     * QUESTION 1: Tower of Hanoi Problem
     * ------------------------------------------------------------------------
     * Task: Move n disks from source tower to destination tower using helper tower.
     * Rule: Only 1 disk can be moved at a time, and a larger disk cannot be placed on a smaller disk.
     * Input: n = 3, src = "S", helper = "H", dest = "D"
     * 
     * Time Complexity: O(2^N)
     * Space Complexity: O(N) call stack
     */
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 2: Reverse a String using Recursion
     * ------------------------------------------------------------------------
     * Task: Print characters of string from last index to index 0 recursively.
     * Input: "qwerty"
     * Expected Output: y t r e w q (printed characters)
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N) call stack
     */
    public static void printRev(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printRev(str, index - 1);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 3: Find 1st and Last Occurrence of Element in String
     * ------------------------------------------------------------------------
     * Task: Find first and last index of character 'element' in string recursively.
     * Input: str = "abaacdaefaah", element = 'a'
     * Expected Output:
     * First occurrence: 0
     * Last occurrence: 10
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N) call stack
     */
    public static int first = -1;
    public static int last = -1;

    public static void findOcc(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOcc(str, idx + 1, element);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 4: Check if Array is Strictly Sorted (Ascending)
     * ------------------------------------------------------------------------
     * Task: Recursively check if arr[idx] < arr[idx + 1] for all indices.
     * Input: arr = {1, 2, 4, 4, 5}
     * Expected Output: false (due to duplicate 4)
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N) call stack
     */
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.println("--- 1. Tower of Hanoi (n = 3) ---");
        towerOfHanoi(3, "S", "H", "D");

        System.out.print("\n--- 2. Reverse String ('qwerty'): ");
        printRev("qwerty", "qwerty".length() - 1);
        System.out.println();

        System.out.println("\n--- 3. First and Last Occurrence of 'a' ---");
        findOcc("abaacdaefaah", 0, 'a');

        System.out.println("\n--- 4. Is Array Sorted ({1, 2, 4, 4, 5}): " + isSorted(new int[]{1, 2, 4, 4, 5}, 0));
    }
}
