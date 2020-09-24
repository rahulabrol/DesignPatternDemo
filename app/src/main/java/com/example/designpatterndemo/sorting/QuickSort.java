package com.example.designpatterndemo.sorting;

import java.util.Arrays;

/**
 * QuickSort is a Divide and Conquer algorithm. It picks an element as pivot
 * and partitions the given array around the picked pivot. There are many different
 * versions of quickSort that pick pivot in different ways.
 * <p>
 * Always pick first element as pivot.
 * Always pick last element as pivot (implemented below)
 * Pick a random element as pivot.
 * Pick median as pivot.
 * The key process in quickSort is partition(). Target of partitions is, given an array
 * and an element x of array as pivot, put x at its correct position in sorted array and put
 * all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x.
 * All this should be done in linear time.
 * <p>
 * [Analysis of QuickSort]
 * Time taken by QuickSort in general can be written as following.
 * <p>
 * T(n) = T(k) + T(n-k-1) + \theta(n)
 * The first two terms are for two recursive calls, the last term is for the partition
 * process. k is the number of elements which are smaller than pivot.
 * The time taken by QuickSort depends upon the input array and partition strategy. Following are three cases.
 *
 * @{1.} Worst Case: The worst case occurs when the partition process always picks greatest
 * or smallest element as pivot. If we consider above partition strategy where last
 * element is always picked as pivot, the worst case would occur when the array is already
 * sorted in increasing or decreasing order. Following is recurrence for worst case.
 * **
 * T(n) = T(0) + T(n-1) + \theta(n)
 * which is equivalent to
 * T(n) = T(n-1) + \theta(n)
 * The solution of above recurrence is \theta(n2).
 * <p>
 * @{2.} Best Case: The best case occurs when the partition process always picks the middle
 * element as pivot. Following is recurrence for best case.
 * **
 * T(n) = 2T(n/2) + \theta(n)
 * The solution of above recurrence is \theta(nLogn). It can be solved using case 2 of Master Theorem.
 * @{3.} Average Case: To do average case analysis, we need to consider all possible permutation of
 * array and calculate time taken by every permutation which doesn’t look easy. We can get an idea
 * of average case by considering the case when partition puts O(n/9) elements in one set
 * and O(9n/10) elements in other set. Following is recurrence for this case.
 * **
 * T(n) = T(n/9) + T(9n/10) + \theta(n)
 * Solution of above recurrence is also O(nLogn)
 * <p>
 * Although the worst case time complexity of QuickSort is O(n2)
 * which is more than many other sorting algorithms like Merge Sort and Heap Sort,
 * QuickSort is faster in practice, because its inner loop can be efficiently implemented on
 * most architectures, and in most real-world data. QuickSort can be implemented in different ways
 * by changing the choice of pivot, so that the worst case rarely occurs for a given type of data.
 * However, merge sort is generally considered better when data is huge and stored in external
 * storage.
 */
public class QuickSort {
    public static void main(String[] args) {
        /*int[] arr = {10, 80, 30, 90, 40, 50, 70};
        int low = 0, high = arr.length - 1;
        //quick sort
        quickSort(arr, low, high);
*/
        int[] arr = {2, 10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);

        System.out.println("sorted array");
        printArray(arr);
    }

    /* A utility function to print array of size n */
    private static void printArray(int[] arr) {
        int n = arr.length;
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }

    /**
     * The main function that implements QuickSort()
     *
     * @param arr  Array to be sorted,
     * @param low  Starting index,
     * @param high Ending index
     */
    private void sort(int[] arr, int low, int high) {
        System.out.println("Enter in sort() with Low: " + low + " high: " + high + " array: " + Arrays.toString(arr));
        if (low < high) {
        /* pi is partitioning index, arr[pi] is now
           at right place */
            int pi = partition(arr, low, high);

            System.out.println("1 Before pi Low: " + low + " High: " + pi);
            sort(arr, low, pi - 1);  // Before pi
            System.out.println("2 Before pi Low: " + low + " High: " + pi);
            System.out.println("1 After pi Low: " + pi + " High: " + high);
            sort(arr, pi + 1, high); // After pi
            System.out.println("2 After pi Low: " + pi + " High: " + high);
        }
    }

    /**
     * This function takes last element as pivot, places
     * the pivot element at its correct position in sorted
     * array, and places all smaller (smaller than pivot)
     * to left of pivot and all greater elements to right
     * of pivot
     *
     * @param arr  array for partition
     * @param low  start index
     * @param high end index
     * @return position of pivot element
     */
    private int partition(int[] arr, int low, int high) {
        System.out.println("Enter in partition() with Low: " + low + " high: " + high + " array: " + Arrays.toString(arr));

        // pivot (Element to be placed at right position)
        int pivot = arr[high];

        int i = (low - 1);  // Index of smaller element

        System.out.println(i + " first low: "+low +" high: "+high);

        for (int j = low; j < high; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                System.out.println(i + " inside loop");
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        System.out.println(i + " last");

        return i + 1;
    }
}
