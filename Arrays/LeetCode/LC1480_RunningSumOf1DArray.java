package Arrays.LeetCode;

/*
 * ============================================================================
 * PROBLEM: LeetCode 1480 - Running Sum of 1D Array
 * CATEGORY: Arrays / Prefix Sum
 * DIFFICULTY: Easy
 * ============================================================================
 * 
 * DESCRIPTION:
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 * 
 * SAMPLE INPUT / OUTPUT:
 * Input: nums = [1, 2, 3, 4] -> Output: [1, 3, 6, 10]
 * Input: nums = [1, 1, 1, 1, 1] -> Output: [1, 2, 3, 4, 5]
 * 
 * COMPLEXITY:
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

public class LC1480_RunningSumOf1DArray {

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
