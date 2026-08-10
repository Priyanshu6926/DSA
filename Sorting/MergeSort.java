package Sorting;

/*
 * ============================================================================
 * MODULE: Divide & Conquer Sorting Algorithms
 * FILE: MergeSort.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Implementation of Merge Sort algorithm using Divide and Conquer strategy.
 * 
 * ALGORITHM STEPS:
 * 1. Divide: Calculate mid = si + (ei - si) / 2.
 * 2. Conquer: Recursively sort left sub-array (si to mid) and right sub-array (mid+1 to ei).
 * 3. Combine: Merge the two sorted halves into a single sorted array.
 * 
 * COMPLEXITY:
 * Time Complexity: O(N log N) in all cases (Best, Average, Worst)
 * Space Complexity: O(N) auxiliary space for merged array
 */

public class MergeSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        System.out.print("Original Array: ");
        printArray(arr);

        divide(arr, 0, n - 1);

        System.out.print("Merge Sorted: ");
        printArray(arr);
    }
}
