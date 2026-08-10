package Recursion_and_Backtracking;

/*
 * ============================================================================
 * MODULE: Recursion Level 3 (Advanced)
 * FILE: RecursionAdvanced.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Advanced recursive problems: All Permutations of a String.
 */

public class RecursionAdvanced {

    /*
     * ------------------------------------------------------------------------
     * QUESTION: Print All Permutations of a String
     * ------------------------------------------------------------------------
     * Task: Given a string, output all distinct permutations of its characters.
     * Input: "abc"
     * Expected Output: abc, acb, bac, bca, cab, cba
     * 
     * Time Complexity: O(N * N!) where N! is total permutations and N is work per state.
     * Space Complexity: O(N) call stack
     */
    public static void printPermutations(String str, int idx, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newStr, idx + 1, perm + currChar);
        }
    }

    public static void main(String args[]) {
        System.out.println("--- String Permutations ('abc') ---");
        printPermutations("abc", 0, "");
    }
}
