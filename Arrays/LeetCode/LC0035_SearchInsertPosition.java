package Arrays.LeetCode;

/*
 * ============================================================================
 * PROBLEM: LeetCode 35 - Search Insert Position
 * CATEGORY: Arrays / Binary Search
 * DIFFICULTY: Easy
 * ============================================================================
 * 
 * DESCRIPTION:
 * Given a sorted array of distinct integers and a target value, return the index 
 * if the target is found. If not, return the index where it would be if it were 
 * inserted in order.
 * 
 * SAMPLE INPUT / OUTPUT:
 * Input: nums = [1, 3, 5, 6], target = 5 -> Output: 2
 * Input: nums = [1, 3, 5, 6], target = 2 -> Output: 1
 * Input: nums = [1, 3, 5, 6], target = 7 -> Output: 4
 * 
 * COMPLEXITY:
 * Time Complexity: O(N) linear search / O(log N) binary search
 * Space Complexity: O(1)
 */

public class LC0035_SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
