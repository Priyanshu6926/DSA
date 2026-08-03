package Arrays;
/**
 * LeetCode 26 - Remove Duplicates from Sorted Array
 *
 * Approach:
 * 1. Use two pointers:
 * - i scans the array.
 * - k keeps track of the next position for a unique element.
 * 2. Since the array is sorted, duplicates are adjacent.
 * 3. If nums[i] is different from nums[i - 1], place it at nums[k] and
 * increment k.
 * 4. Return k, the number of unique elements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}