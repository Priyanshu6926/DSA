package Recursion_and_Backtracking;

/*
 * ============================================================================
 * PROBLEM: LeetCode 37 - Sudoku Solver
 * FILE: SudokuSolver.java
 * CATEGORY: Backtracking / Recursion
 * ============================================================================
 * 
 * DESCRIPTION:
 * Write a program to solve a Sudoku puzzle by filling the empty cells ('.').
 * A sudoku solution must satisfy all of the following rules:
 * 1. Each of the digits 1-9 must occur exactly once in each row.
 * 2. Each of the digits 1-9 must occur exactly once in each column.
 * 3. Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
 * 
 * COMPLEXITY:
 * Time Complexity: O(9^(N*N)) where N=9 -> bounded constant O(1) for fixed 9x9 grid
 * Space Complexity: O(N*N) recursion stack depth bounded by 81 calls
 */

public class SudokuSolver {

    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Check Column constraint
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
        }

        // Check Row constraint
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == (char) (number + '0')) {
                return false;
            }
        }

        // Check 3x3 Sub-grid constraint
        int sr = 3 * (row / 3);
        int sc = 3 * (col / 3);

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }

        int nrow = 0;
        int ncol = 0;

        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }

        if (board[row][col] != '.') {
            if (helper(board, nrow, ncol)) {
                return true;
            }
        } else {
            // Fill digits from 1 to 9
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol))
                        return true;
                    else
                        board[row][col] = '.'; // Backtrack
                }
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] args) {
        System.out.println("Sudoku Solver Class Initialized Successfully.");
    }
}
