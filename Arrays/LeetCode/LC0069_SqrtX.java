package Arrays.LeetCode;

/*
 * ============================================================================
 * PROBLEM: LeetCode 69 - Sqrt(x)
 * CATEGORY: Math / Binary Search
 * DIFFICULTY: Easy
 * ============================================================================
 * 
 * DESCRIPTION:
 * Given a non-negative integer x, return the square root of x rounded down 
 * to the nearest integer. The returned integer should be non-negative as well.
 * 
 * SAMPLE INPUT / OUTPUT:
 * Input: x = 4 -> Output: 2
 * Input: x = 8 -> Output: 2
 * 
 * COMPLEXITY:
 * Time Complexity: O(log X) using Binary Search
 * Space Complexity: O(1)
 */

public class LC0069_SqrtX {

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
