/**
 * LeetCode 1470 - Shuffle the Array
 *
 * Approach:
 * 1. Create a new array of the same size as the input array.
 * 2. The first half of the array contains x values.
 * 3. The second half contains y values.
 * 4. Place x values at even indices (2 * i).
 * 5. Place y values at odd indices (2 * i + 1).
 * 6. Return the shuffled array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }

        return ans;
    }
}