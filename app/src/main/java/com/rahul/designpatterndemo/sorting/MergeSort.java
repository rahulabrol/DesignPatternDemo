package com.rahul.designpatterndemo.sorting;

/**
 * Merge Sort is a Divide and Conquer algorithm. It divides input array
 * in two halves, calls itself for the two halves and then merges the two
 * sorted halves. The merge() function is used for merging two halves. The
 * merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r] are
 * sorted and merges the two sorted sub-arrays into one.
 * <p>
 * Time Complexity: Sorting arrays on different machines. Merge Sort is a recursive
 * algorithm and time complexity can be expressed as following recurrence relation.
 * T(n) = 2T(n/2) + \Theta(n)
 * The above recurrence can be solved either using Recurrence Tree method or Master method.
 * It falls in case II of Master Method and solution of the recurrence is \Theta(nLogn).
 * Time complexity of Merge Sort is \Theta(nLogn) in all 3 cases (worst, average and best) as merge
 * sort always divides the array into two halves and take linear time to merge two halves.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }

    /* A utility function to print array of size n */
    private static void printArray(int[] arr) {
        int n = arr.length;
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }

    private void sort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /**
     * Merges two subarrays of arr[].
     * First subarray is arr[l..m]
     * Second subarray is arr[m+1..r]
     *
     * @param arr array
     * @param l   left sub array
     * @param m   median
     * @param r   right sub array
     */
    private void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];

        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
}
