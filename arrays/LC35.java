/**
 * LeetCode 35 - Search Insert Position
 *
 * Approach (Linear Search):
 * 1. Traverse the array from left to right.
 * 2. If the current element is greater than or equal to the target,
 *    return its index.
 * 3. If the target is greater than all elements,
 *    return nums.length.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }
}