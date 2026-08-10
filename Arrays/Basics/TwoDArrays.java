package Arrays.Basics;

import java.util.Scanner;

/*
 * ============================================================================
 * MODULE: Data Structures - 2D Arrays / Matrices
 * FILE: TwoDArrays.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Operations on 2D Arrays (Matrices):
 * 1. Matrix Input & Grid Printing
 * 2. Search for Element x in Matrix and output (row, col) coordinates
 * 3. Transpose of a Matrix
 */

public class TwoDArrays {

    /*
     * ------------------------------------------------------------------------
     * EXERCISE 1: Matrix Input & Print
     * ------------------------------------------------------------------------
     * Time Complexity: O(rows * cols)
     * Space Complexity: O(rows * cols)
     */
    public static void matrixInputAndPrint(Scanner sc) {
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
     * ------------------------------------------------------------------------
     * EXERCISE 2: Search Location (row, col) of Element x in 2D Array
     * ------------------------------------------------------------------------
     * Input: rows=2, cols=3, grid={{1, 2, 3}, {4, 5, 6}}, x=5
     * Expected Output: X found at locations(1, 1)
     * 
     * Time Complexity: O(rows * cols)
     * Space Complexity: O(rows * cols)
     */
    public static void searchElementIn2DArray(Scanner sc) {
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("X found at locations(" + i + "," + j + ")");
                }
            }
        }
    }

    /*
     * ------------------------------------------------------------------------
     * EXERCISE 3: Transpose of a Matrix
     * ------------------------------------------------------------------------
     * Task: Swap rows and columns (matrix[i][j] becomes transpose[j][i]).
     * Input: 
     * 1 2 3
     * 4 5 6
     * Expected Output (Transpose):
     * 1 4
     * 2 5
     * 3 6
     * 
     * Time Complexity: O(rows * cols)
     * Space Complexity: O(rows * cols)
     */
    public static void transposeMatrix(Scanner sc) {
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix Transpose:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.println("--- 2D Array Matrix Operations Class Initialized ---");
    }
}
