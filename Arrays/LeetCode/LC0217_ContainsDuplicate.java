package Arrays.LeetCode;

/*
 * ============================================================================
 * PROBLEM: LeetCode 217 - Contains Duplicate
 * CATEGORY: Arrays / Hash Table / Sorting
 * DIFFICULTY: Easy
 * ============================================================================
 * 
 * DESCRIPTION:
 * Given an integer array nums, return true if any value appears at least twice 
 * in the array, and return false if every element is distinct.
 * 
 * SAMPLE INPUT / OUTPUT:
 * Input: nums = [1, 2, 3, 1] -> Output: true
 * Input: nums = [1, 2, 3, 4] -> Output: false
 * 
 * COMPLEXITY:
 * Time Complexity: O(N^2) for Brute Force (can be optimized to O(N) using HashSet or O(N log N) with Sorting)
 * Space Complexity: O(1)
 */

public class LC0217_ContainsDuplicate {

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
