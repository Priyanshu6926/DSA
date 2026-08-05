/**
 * LeetCode 69 - Sqrt(x)
 *
 * Approach:
 * 1. Use Binary Search on the range [0, x].
 * 2. Find the middle value.
 * 3. Compare mid * mid with x.
 *    - If equal, return mid.
 *    - If smaller, search the right half.
 *    - If larger, search the left half.
 * 4. If no exact square root exists, return the largest integer
 *    whose square is less than x.
 *
 * Time Complexity: O(log x)
 * Space Complexity: O(1)
 */

class Solution {
    public int mySqrt(int x) {

        int left = 0;
        int right = x;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }

            if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
}