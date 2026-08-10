package Arrays.LeetCode;

/*
 * ============================================================================
 * PROBLEM: LeetCode 1295 - Find Numbers with Even Number of Digits
 * CATEGORY: Arrays / Math
 * DIFFICULTY: Easy
 * ============================================================================
 * 
 * DESCRIPTION:
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * 
 * SAMPLE INPUT / OUTPUT:
 * Input: nums = [12, 345, 2, 6, 7896] -> Output: 2 (12 and 7896 have 2 & 4 digits)
 * Input: nums = [555, 901, 482, 1771] -> Output: 1 (1771 has 4 digits)
 * 
 * COMPLEXITY:
 * Time Complexity: O(N * D) where D is number of digits (effectively O(N))
 * Space Complexity: O(1)
 */

public class LC1295_FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;

            if (num == 0) {
                count = 1;
            }

            while (num != 0) {
                count++;
                num /= 10;
            }

            if (count % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }
}
