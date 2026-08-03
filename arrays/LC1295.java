/**
 * LeetCode 1295 - Find Numbers with Even Number of Digits
 *
 * Approach:
 * 1. Traverse the array.
 * 2. Count the digits of each number by repeatedly dividing by 10.
 * 3. If the digit count is even, increment the answer.
 * 4. Return the total count.
 *
 * Time Complexity: O(n × d)
 * where d is the number of digits in each number.
 * Since d is at most 5 for the given constraints, it is effectively O(n).
 *
 * Space Complexity: O(1)
 */

class Solution {
    public int findNumbers(int[] nums) {

        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int count = 0;

            // Edge case: 0 has one digit
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