package Arrays.LeetCode;

/*
 * ============================================================================
 * PROBLEM: LeetCode 278 - First Bad Version
 * CATEGORY: Binary Search / Interactive
 * DIFFICULTY: Easy
 * ============================================================================
 * 
 * DESCRIPTION:
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad 
 * one, which causes all the following ones to be bad. You are given an API 
 * isBadVersion(version) which returns whether version is bad.
 * 
 * SAMPLE INPUT / OUTPUT:
 * Input: n = 5, bad = 4 -> Output: 4
 * 
 * COMPLEXITY:
 * Time Complexity: O(log N)
 * Space Complexity: O(1)
 */

class VersionControl {
    // Dummy stub implementation for parent class API simulation
    boolean isBadVersion(int version) {
        return version >= 4;
    }
}

public class LC0278_FirstBadVersion extends VersionControl {

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
