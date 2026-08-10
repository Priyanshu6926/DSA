package Arrays.LeetCode;

/*
 * ============================================================================
 * PROBLEM: LeetCode 704 - Binary Search
 * CATEGORY: Binary Search / Arrays
 * DIFFICULTY: Easy
 * ============================================================================
 * 
 * DESCRIPTION:
 * Given an array of integers nums which is sorted in ascending order, and an 
 * integer target, write a function to search target in nums. If target exists, 
 * then return its index. Otherwise, return -1.
 * 
 * SAMPLE INPUT / OUTPUT:
 * Input: nums = [-1, 0, 3, 5, 9, 12], target = 9 -> Output: 4
 * Input: nums = [-1, 0, 3, 5, 9, 12], target = 2 -> Output: -1
 * 
 * COMPLEXITY:
 * Time Complexity: O(log N)
 * Space Complexity: O(1)
 */

public class LC0704_BinarySearch {

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
