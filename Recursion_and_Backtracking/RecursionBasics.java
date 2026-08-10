package Recursion_and_Backtracking;

/*
 * ============================================================================
 * MODULE: Recursion Level 1 (Basics)
 * FILE: RecursionBasics.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Fundamental recursive problems demonstrating base cases, call stacks, 
 * and state propagation.
 */

public class RecursionBasics {

    /*
     * ------------------------------------------------------------------------
     * QUESTION 1: Print Numbers from N down to 1
     * ------------------------------------------------------------------------
     * Input: n = 5
     * Expected Output: 5 4 3 2 1
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N) call stack
     */
    public static void printNumbDescending(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbDescending(n - 1);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 2: Print Numbers from 1 up to N
     * ------------------------------------------------------------------------
     * Input: n = 1, limit = 5
     * Expected Output: 1 2 3 4 5
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N) call stack
     */
    public static void printNumbAscending(int n, int limit) {
        if (n > limit) {
            return;
        }
        System.out.println(n);
        printNumbAscending(n + 1, limit);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 3: Print Sum of First N Natural Numbers using Recursion
     * ------------------------------------------------------------------------
     * Input: i = 1, n = 5, sum = 0
     * Expected Output: 15
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N) call stack
     */
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 4: Calculate Factorial of N using Recursion
     * ------------------------------------------------------------------------
     * Input: n = 5
     * Expected Output: 120
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N) call stack
     */
    public static int calcFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact_nm1 = calcFactorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    /*
     * ------------------------------------------------------------------------
     * QUESTION 5: Print Fibonacci Series up to N terms
     * ------------------------------------------------------------------------
     * Input: a = 0, b = 1, n = 7
     * Expected Output: 0 1 1 2 3 5 8
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N) call stack
     */
    public static void printFibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(a + " ");
        printFibonacci(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        System.out.println("--- 1. Print 5 down to 1 ---");
        printNumbDescending(5);

        System.out.println("\n--- 2. Print 1 up to 5 ---");
        printNumbAscending(1, 5);

        System.out.print("\n--- 3. Sum of first 5 natural numbers: ");
        printSum(1, 5, 0);

        System.out.println("--- 4. Factorial of 5: " + calcFactorial(5));

        System.out.print("--- 5. Fibonacci terms (7 terms): ");
        printFibonacci(0, 1, 7);
        System.out.println();
    }
}
