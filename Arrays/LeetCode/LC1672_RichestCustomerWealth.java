package Arrays.LeetCode;

/*
 * ============================================================================
 * PROBLEM: LeetCode 1672 - Richest Customer Wealth
 * CATEGORY: Arrays / Matrix
 * DIFFICULTY: Easy
 * ============================================================================
 * 
 * DESCRIPTION:
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount 
 * of money the i-th customer has in the j-th bank. Return the wealth that the 
 * richest customer has.
 * 
 * SAMPLE INPUT / OUTPUT:
 * Input: accounts = [[1, 2, 3], [3, 2, 1]] -> Output: 6
 * Input: accounts = [[1, 5], [7, 3], [3, 5]] -> Output: 10
 * 
 * COMPLEXITY:
 * Time Complexity: O(M * N)
 * Space Complexity: O(1)
 * 
 * ERRORS / CORRECTIONS IN ORIGINAL CODE:
 * In original file `LC1672.java`:
 * `class 1672` was declared. In Java, identifiers cannot start with a digit.
 * Fixed class name to `LC1672_RichestCustomerWealth`.
 */

public class LC1672_RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int richest = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }

            if (sum > richest) {
                richest = sum;
            }
        }

        return richest;
    }
}
