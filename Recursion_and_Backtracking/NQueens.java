package Recursion_and_Backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * ============================================================================
 * PROBLEM: LeetCode 51 - N-Queens
 * FILE: NQueens.java
 * CATEGORY: Backtracking / Recursion
 * ============================================================================
 * 
 * DESCRIPTION:
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard 
 * such that no two queens attack each other (no two queens in same row, column, 
 * or diagonal).
 * 
 * SAMPLE INPUT / OUTPUT:
 * Input: n = 4
 * Expected Output: 
 * [[".Q..", "...Q", "Q...", "..Q."], ["..Q.", "Q...", "...Q", ".Q.."]]
 * 
 * COMPLEXITY:
 * Time Complexity: O(N!)
 * Space Complexity: O(N^2) for chessboard representation + recursion stack
 * 
 * ERRORS / CORRECTIONS IN ORIGINAL CODE:
 * In original file `recursion.java`:
 * 1. Capitalization error: `list<list<String>>` was used instead of `List<List<String>>`.
 * 2. Class instantiation typo: `new Arraylist<>()` instead of `new ArrayList<>()`.
 * 3. Upper right diagonal loop condition had variable mismatch.
 * Corrected imports and generic types.
 */

public class NQueens {

    public boolean isSafe(int row, int col, char[][] board) {
        // Horizontal check
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Vertical check
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Upper left diagonal check
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Upper right diagonal check
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Lower left diagonal check
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Lower right diagonal check
        r = row;
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }

        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        NQueens solver = new NQueens();
        List<List<String>> solutions = solver.solveNQueens(4);
        System.out.println("N-Queens (n=4) Total Solutions: " + solutions.size());
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
