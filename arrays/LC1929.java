package Arrays;
/*
Problem: 1929. Concatenation of Array
Difficulty: Easy

Approach:
1. Find the length of the array.
2. Create a new array of size 2*n.
3. Traverse the original array once.
4. Copy each element to:
   - ans[i]
   - ans[i + n]
5. Return the new array.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}