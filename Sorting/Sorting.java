package Sorting;

/*
 * ============================================================================
 * MODULE: Elementary Sorting Algorithms
 * FILE: Sorting.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Implementation of basic comparison-based sorting algorithms:
 * 1. Bubble Sort
 * 2. Selection Sort
 * 3. Insertion Sort
 */

public class Sorting {

    // Helper function to print array elements
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /*
     * ------------------------------------------------------------------------
     * ALGORITHM 1: Bubble Sort
     * ------------------------------------------------------------------------
     * Idea: Repeatedly swap adjacent elements if they are in wrong order.
     * Input: {7, 8, 3, 1, 2}
     * Expected Output: 1 2 3 7 8
     * 
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     */
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /*
     * ------------------------------------------------------------------------
     * ALGORITHM 2: Selection Sort
     * ------------------------------------------------------------------------
     * Idea: Find the minimum element in unsorted array and swap with first unsorted element.
     * Input: {7, 8, 3, 1, 2}
     * Expected Output: 1 2 3 7 8
     * 
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     */
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    /*
     * ------------------------------------------------------------------------
     * ALGORITHM 3: Insertion Sort
     * ------------------------------------------------------------------------
     * Idea: Divide array into sorted & unsorted parts. Pick element from unsorted part
     * and place at correct position in sorted part.
     * Input: {7, 8, 3, 1, 2}
     * Expected Output: 1 2 3 7 8
     * 
     * Time Complexity: O(N^2) worst/average, O(N) best
     * Space Complexity: O(1)
     */
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {7, 8, 3, 1, 2};
        System.out.print("Original Array: ");
        printArray(arr1);

        System.out.print("Bubble Sorted: ");
        bubbleSort(arr1);
        printArray(arr1);

        int arr2[] = {7, 8, 3, 1, 2};
        System.out.print("Selection Sorted: ");
        selectionSort(arr2);
        printArray(arr2);

        int arr3[] = {7, 8, 3, 1, 2};
        System.out.print("Insertion Sorted: ");
        insertionSort(arr3);
        printArray(arr3);
    }
}
