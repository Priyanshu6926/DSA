/**
 * LeetCode 283 - Move Zeroes
 *
 * Approach:
 * 1. Use a pointer (nonZero) to track the next position for a non-zero element.
 * 2. Traverse the array once.
 * 3. Whenever a non-zero element is found, place it at nums[nonZero] and increment nonZero.
 * 4. After placing all non-zero elements, fill the remaining positions with zeros.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public void moveZeroes(int[] nums) {

        int nonZero = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZero] = nums[i];
                nonZero++;
            }
        }

        // Fill the remaining positions with zeros
        while (nonZero < nums.length) {
            nums[nonZero] = 0;
            nonZero++;
        }
    }
}