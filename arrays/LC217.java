package Arrays;
/**
 * LeetCode 217 - Contains Duplicate
 *
 * Approach (Brute Force):
 * 1. Compare every element with all the elements after it.
 * 2. If two elements are equal, return true.
 * 3. If no duplicate is found after checking all pairs, return false.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}