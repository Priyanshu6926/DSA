package Strings;

/*
 * ============================================================================
 * MODULE: String Operations & StringBuilder
 * FILE: StringsDemo.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Practice of String methods, immutability, comparisons, substrings, and
 * mutable StringBuilder operations including string reversal algorithms.
 */

public class StringsDemo {

    /*
     * ------------------------------------------------------------------------
     * QUESTION 1: String Concatenation, Length & Character Traversal
     * ------------------------------------------------------------------------
     * Input: firstName = "tony", lastName = "stark"
     * Expected Output:
     * Length: 10 ("tony@stark")
     * Characters printed line by line: t, o, n, y, @, s, t, a, r, k
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public static void concatenationDemo() {
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + "@" + lastName;

        System.out.println("Length: " + fullName.length());

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 2: String Comparison (== vs .equals() vs .compareTo())
     * ------------------------------------------------------------------------
     * Demonstration: `==` compares reference memory addresses. `.equals()` compares value.
     * Expected Output: "Not Equal" when comparing new String("Tony") == new String("Tony")
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static void stringComparisonDemo() {
        String s1 = "Priyanshu";
        String s2 = "Priyanshu";

        if (s1.compareTo(s2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Not equal");
        }

        // Object reference check
        if (new String("Tony") == new String("Tony")) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal (Different Heap References)");
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 3: Substring Extraction
     * ------------------------------------------------------------------------
     * Task: Extract substring from index 2 up to 4 (exclusive).
     * Input: "Priyanshu"
     * Expected Output: "iy"
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public static void substringDemo() {
        String notname = "Priyanshu";
        String name = notname.substring(2, 4);
        System.out.println("Substring (2,4): " + name);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 4: StringBuilder Operations (Insert, Set, Delete)
     * ------------------------------------------------------------------------
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public static void stringBuilderDemo() {
        StringBuilder sb = new StringBuilder("Priyanshu");
        System.out.println("Original StringBuilder: " + sb);

        // Get char at index
        System.out.println("Char at index 1: " + sb.charAt(1));

        // Set char
        sb.setCharAt(0, 'P');
        System.out.println("Set char: " + sb);

        // Insert
        sb.insert(9, 'Z');
        System.out.println("After Insert: " + sb);

        // Delete
        sb.delete(0, 2);
        System.out.println("After Delete (0,2): " + sb);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 5: Reverse String (Two-Pointer In-Place Swap & Built-in Reverse)
     * ------------------------------------------------------------------------
     * Task: Reverse a given string.
     * Input: "Priyanshu"
     * Expected Output: "uhsnayirP"
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public static void reverseStringDemo() {
        StringBuilder sb = new StringBuilder("priyanshu");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println("Reversed (Two-Pointer): " + sb);

        // Built-in reverse method
        String original = "Priyanshu";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed (Built-in): " + reversed);
    }

    public static void main(String[] args) {
        System.out.println("--- String Demonstrations ---");
        stringComparisonDemo();
        substringDemo();
        reverseStringDemo();
    }
}
