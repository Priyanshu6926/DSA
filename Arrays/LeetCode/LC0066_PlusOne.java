package Arrays.LeetCode;

/*
 * ============================================================================
 * PROBLEM: LeetCode 66 - Plus One
 * CATEGORY: Arrays / Math
 * DIFFICULTY: Easy
 * ============================================================================
 * 
 * DESCRIPTION:
 * You are given a large integer represented as an integer array digits, where 
 * each digits[i] is the ith digit of the integer. Increment the large integer 
 * by one and return the resulting array of digits.
 * 
 * SAMPLE INPUT / OUTPUT:
 * Input: digits = [1, 2, 3] -> Output: [1, 2, 4]
 * Input: digits = [9, 9, 9] -> Output: [1, 0, 0, 0]
 * 
 * COMPLEXITY:
 * Time Complexity: O(N)
 * Space Complexity: O(1) auxiliary (O(N) if all digits are 9)
 */

public class LC0066_PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}
