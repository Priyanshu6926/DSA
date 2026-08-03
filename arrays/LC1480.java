package Arrays;
/*
 * LeetCode 1480 - Running Sum of 1D Array
 * Difficulty: Easy
 *
 * Approach:
 * 1. Create a new array 'ans' of the same size as the input array.
 * 2. Use a variable 'sum' to keep track of the running total.
 * 3. Traverse the array from left to right.
 * 4. Add the current element to 'sum'.
 * 5. Store the updated 'sum' in the answer array.
 * 6. Return the answer array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public int[] runningSum(int[] nums) {

        int sum = 0;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            ans[i] = sum;
        }

        return ans;
    }
}