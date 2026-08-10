package Arrays.LeetCode;

/*
 * ============================================================================
 * PROBLEM: LeetCode 1929 - Concatenation of Array
 * CATEGORY: Arrays
 * DIFFICULTY: Easy
 * ============================================================================
 * 
 * DESCRIPTION:
 * Given an integer array nums of length n, create an array ans of length 2n where 
 * ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * 
 * SAMPLE INPUT / OUTPUT:
 * Input: nums = [1, 2, 1] -> Output: [1, 2, 1, 1, 2, 1]
 * Input: nums = [1, 3, 2, 1] -> Output: [1, 3, 2, 1, 1, 3, 2, 1]
 * 
 * COMPLEXITY:
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

public class LC1929_ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}
