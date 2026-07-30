/*
 * LeetCode 1672 - Richest Customer Wealth
 * Difficulty: Easy
 *
 * Approach:
 * 1. Create a variable 'richest' to store the maximum wealth.
 * 2. Traverse each customer (row).
 * 3. For each customer, reset 'sum' to 0.
 * 4. Traverse all bank accounts (columns) of that customer.
 * 5. Add each bank account balance to 'sum'.
 * 6. If 'sum' is greater than 'richest', update 'richest'.
 * 7. Return 'richest'.
 *
 * Time Complexity: O(m × n)
 * Space Complexity: O(1)
 */

class 1672 {
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