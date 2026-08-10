package Arrays.LeetCode;

/*
 * ============================================================================
 * PROBLEM: LeetCode 26 - Remove Duplicates from Sorted Array
 * CATEGORY: Arrays / Two Pointers
 * DIFFICULTY: Easy
 * ============================================================================
 * 
 * DESCRIPTION:
 * Given an integer array nums sorted in non-decreasing order, remove the 
 * duplicates in-place such that each unique element appears only once.
 * Return k after placing the final result in the first k slots of nums.
 * 
 * SAMPLE INPUT / OUTPUT:
 * Input: nums = [1, 1, 2]
 * Expected Output: k = 2, nums = [1, 2, _]
 * 
 * Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
 * Expected Output: k = 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]
 * 
 * COMPLEXITY:
 * Time Complexity: O(N) single pass
 * Space Complexity: O(1) in-place modification
 */

public class LC0026_RemoveDuplicatesFromSortedArray {

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
