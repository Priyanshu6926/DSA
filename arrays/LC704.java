/**
 * LeetCode 704 - Binary Search
 *
 * Approach:
 * 1. Initialize two pointers: left and right.
 * 2. Find the middle element.
 * 3. Compare the middle element with the target.
 *    - If equal, return the index.
 *    - If target is greater, search the right half.
 *    - If target is smaller, search the left half.
 * 4. Repeat until the target is found or the search space becomes empty.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}