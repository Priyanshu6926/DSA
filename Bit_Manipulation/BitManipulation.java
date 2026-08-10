package Bit_Manipulation;

import java.util.Scanner;

/*
 * ============================================================================
 * MODULE: Bit Manipulation
 * FILE: BitManipulation.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Core Bitwise Operations: Get Bit, Set Bit, Clear Bit, Update Bit,
 * and checking if a number is a Power of 2.
 */

public class BitManipulation {

    /*
     * ------------------------------------------------------------------------
     * QUESTION 1: Get Bit (Check bit at position pos)
     * ------------------------------------------------------------------------
     * Logic: BitMask = 1 << pos. Perform Bitwise AND with n.
     * Input: n = 5 (0101 in binary), pos = 3
     * Expected Output: Bit was zero (since 3rd bit of 5 is 0)
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void getBitExample() {
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 2: Set Bit (Set bit at position pos to 1)
     * ------------------------------------------------------------------------
     * Logic: BitMask = 1 << pos. Perform Bitwise OR with n.
     * Input: n = 5 (0101 in binary), pos = 1
     * Expected Output: 7 (0111 in binary)
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void setBitExample() {
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 3: Clear Bit (Set bit at position pos to 0)
     * ------------------------------------------------------------------------
     * Logic: BitMask = 1 << pos. notBitMask = ~(bitMask). Perform Bitwise AND with n.
     * Input: n = 5 (0101 in binary), pos = 2
     * Expected Output: 1 (0001 in binary)
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void clearBitExample() {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 4: Update Bit (Update bit at position pos to 1 or 0)
     * ------------------------------------------------------------------------
     * Logic:
     * - For operation = 1: Set Bit (bitMask | n)
     * - For operation = 0: Clear Bit (~bitMask & n)
     * Input: oper = 1, n = 5, pos = 1
     * Expected Output: 7
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void updateBitExample(Scanner sc) {
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;

        int bitMask = 1 << pos;
        if (oper == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 5: Check Power of 2
     * ------------------------------------------------------------------------
     * Task: Determine if a given positive number n is a power of 2.
     * Logic: Properties of power of 2: n & (n - 1) == 0 (e.g. 4 is 100, 3 is 011; 100 & 011 = 000).
     * Input: n = 8 -> Output: Yes it is a power of 2
     * Input: n = 6 -> Output: No it is not a power of 2
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     * 
     * ERRORS / CORRECTIONS IN ORIGINAL CODE:
     * Fixed typing error `}ß` at line 84 of original bit.java.
     * ------------------------------------------------------------------------
     */
    public static void isPowerOfTwo(Scanner sc) {
        int n = sc.nextInt();
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("Yes it is a power of 2");
        } else {
            System.out.println("No it is not a power of 2");
        }
    }

    public static void main(String args[]) {
        System.out.println("--- Bit Manipulation Demonstrations ---");
        System.out.print("Get Bit at pos 3 of 5: ");
        getBitExample();

        System.out.print("Set Bit at pos 1 of 5: ");
        setBitExample();

        System.out.print("Clear Bit at pos 2 of 5: ");
        clearBitExample();
    }
}
