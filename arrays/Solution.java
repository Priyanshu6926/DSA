/**
 * LeetCode 278 - First Bad Version
 *
 * Approach:
 * 1. Use Binary Search on the version numbers.
 * 2. Check the middle version using the isBadVersion() API.
 * 3. If the middle version is bad, it could be the first bad version,
 *    so continue searching on the left side (including mid).
 * 4. If the middle version is good, search the right side.
 * 5. When left == right, the first bad version is found.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version);
*/

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}