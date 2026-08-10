package Arrays.LeetCode;

/*
 * ============================================================================
 * PROBLEM: LeetCode 283 - Move Zeroes
 * CATEGORY: Arrays / Two Pointers
 * DIFFICULTY: Easy
 * ============================================================================
 * 
 * DESCRIPTION:
 * Given an integer array nums, move all 0's to the end of it while maintaining 
 * the relative order of the non-zero elements. Must modify array in-place.
 * 
 * SAMPLE INPUT / OUTPUT:
 * Input: nums = [0, 1, 0, 3, 12] -> Output: [1, 3, 12, 0, 0]
 * Input: nums = [0] -> Output: [0]
 * 
 * COMPLEXITY:
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class LC0283_MoveZeroes {

    public void moveZeroes(int[] nums) {
        int nonZero = 0;

        // Shift all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZero] = nums[i];
                nonZero++;
            }
        }

        // Fill remaining trailing positions with zeroes
        while (nonZero < nums.length) {
            nums[nonZero] = 0;
            nonZero++;
        }
    }
}
