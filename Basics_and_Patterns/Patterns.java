package Basics_and_Patterns;

/*
 * ============================================================================
 * MODULE: Pattern Printing Problems
 * FILE: Patterns.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Collection of standard pattern printing problems solved using nested loops.
 * Demonstrates outer loop for rows and inner loop for columns/spaces.
 */

public class Patterns {

    /*
     * ------------------------------------------------------------------------
     * PATTERN 1: Solid Rectangle Pattern
     * ------------------------------------------------------------------------
     * Rows: n = 5, Columns: m = 4
     * Expected Output:
     * * * * * 
     * * * * * 
     * * * * * 
     * * * * * 
     * * * * * 
     * 
     * Time Complexity: O(n * m)
     * Space Complexity: O(1)
     */
    public static void solidRectangle(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * ------------------------------------------------------------------------
     * PATTERN 2: Hollow Rectangle Pattern
     * ------------------------------------------------------------------------
     * Rows: n = 4, Columns: m = 5
     * Expected Output:
     * *****
     * *   *
     * *   *
     * *****
     * 
     * Time Complexity: O(n * m)
     * Space Complexity: O(1)
     */
    public static void hollowRectangle(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
     * ------------------------------------------------------------------------
     * PATTERN 3: Half Pyramid Star Pattern
     * ------------------------------------------------------------------------
     * Rows: n = 5
     * Expected Output:
     * *
     * **
     * ***
     * ****
     * *****
     * 
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static void halfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * ------------------------------------------------------------------------
     * PATTERN 4: Inverted Half Pyramid Star Pattern
     * ------------------------------------------------------------------------
     * Rows: n = 5
     * Expected Output:
     * *****
     * ****
     * ***
     * **
     * *
     * 
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static void invertedHalfPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * ------------------------------------------------------------------------
     * PATTERN 5: Inverted Half Pyramid (Rotated by 180 degrees)
     * ------------------------------------------------------------------------
     * Rows: n = 5
     * Expected Output:
     *     *
     *    **
     *   ***
     *  ****
     * *****
     * 
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static void rotatedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * ------------------------------------------------------------------------
     * PATTERN 6: Half Pyramid with Numbers
     * ------------------------------------------------------------------------
     * Rows: n = 5
     * Expected Output:
     * 1 
     * 1 2 
     * 1 2 3 
     * 1 2 3 4 
     * 1 2 3 4 5 
     * 
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static void halfPyramidNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
     * ------------------------------------------------------------------------
     * PATTERN 7: Inverted Half Pyramid with Numbers
     * ------------------------------------------------------------------------
     * Rows: n = 5
     * Expected Output:
     * 12345
     * 1234
     * 123
     * 12
     * 1
     * 
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static void invertedHalfPyramidNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * ------------------------------------------------------------------------
     * PATTERN 8: Floyd's Triangle
     * ------------------------------------------------------------------------
     * Rows: n = 5
     * Expected Output:
     * 1 
     * 2 3 
     * 4 5 6 
     * 7 8 9 10 
     * 11 12 13 14 15 
     * 
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static void floydsTriangle(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    /*
     * ------------------------------------------------------------------------
     * PATTERN 9: 0-1 Triangle Pattern
     * ------------------------------------------------------------------------
     * Rows: n = 5
     * Logic: If (row + col) is even, print 1, else print 0.
     * Expected Output:
     * 1
     * 01
     * 101
     * 0101
     * 10101
     * 
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static void zeroOneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.println("--- Pattern Demonstrations ---");
        System.out.println("1. Solid Rectangle:");
        solidRectangle(4, 5);

        System.out.println("\n2. Hollow Rectangle:");
        hollowRectangle(4, 5);

        System.out.println("\n3. Half Pyramid:");
        halfPyramid(5);

        System.out.println("\n4. 0-1 Triangle:");
        zeroOneTriangle(5);
    }
}
