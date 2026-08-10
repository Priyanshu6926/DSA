package Basics_and_Patterns;

import java.util.Scanner;

/*
 * ============================================================================
 * MODULE: Java Functions & Methods
 * FILE: Functions.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Practice exercises on Java methods/functions: parameters, return types,
 * mathematical calculations, modularization, and helper functions.
 */

public class Functions {

    /*
     * ------------------------------------------------------------------------
     * QUESTION 1: Print Given Name
     * ------------------------------------------------------------------------
     * Task: Takes a name as String parameter and prints it.
     * Input: "Priyanshu"
     * Expected Output: Priyanshu
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static void printMyName(String name) {
        System.out.println(name);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 2: Calculate Sum of Two Numbers
     * ------------------------------------------------------------------------
     * Task: Takes two integers a and b, returns their sum.
     * Input: a = 10, b = 20
     * Expected Output: 30
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static int printSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 3: Calculate Product of Two Numbers
     * ------------------------------------------------------------------------
     * Task: Takes two integers a and b, returns their product (a * b).
     * Input: a = 4, b = 5
     * Expected Output: 20
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static int printProduct(int a, int b) {
        return a * b;
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 4: Calculate Factorial of a Number
     * ------------------------------------------------------------------------
     * Task: Calculate n! = n * (n-1) * ... * 1.
     * Input: n = 5
     * Expected Output: 120
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 5: Calculate Average of 3 Numbers
     * ------------------------------------------------------------------------
     * Task: Takes 3 numbers and returns their average: (a + b + c) / 3.
     * Input: a = 10, b = 20, c = 30
     * Expected Output: 20
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static int printAvg(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 6: Sum of All Odd Numbers from 1 to N
     * ------------------------------------------------------------------------
     * Task: Iterate from 1 to n and calculate sum of odd numbers.
     * Input: n = 6 (1 + 3 + 5)
     * Expected Output: 9
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     * 
     * ERRORS / CORRECTIONS IN ORIGINAL CODE:
     * In the original file, the method definition was placed outside any class definition.
     * Moved cleanly inside the `Functions` class.
     * ------------------------------------------------------------------------
     */
    public static int printSumofOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 7: Greater of Two Numbers
     * ------------------------------------------------------------------------
     * Task: Return maximum of a and b.
     * Input: a = 15, b = 25
     * Expected Output: 25
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static int printGreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 8: Circumference of a Circle
     * ------------------------------------------------------------------------
     * Task: Takes radius r and calculates circumference = 2 * pi * r.
     * Input: r = 7
     * Expected Output: 43.96 (approx)
     * 
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static double printCircumference(int r) {
        return 2 * 3.14 * r;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Testing Functions ---");
        System.out.print("Factorial of 5: ");
        printFactorial(5);

        System.out.print("Sum of odd numbers up to 6: ");
        System.out.println(printSumofOdd(6));

        System.out.print("Circumference of radius 5: ");
        System.out.println(printCircumference(5));
        
        sc.close();
    }
}
