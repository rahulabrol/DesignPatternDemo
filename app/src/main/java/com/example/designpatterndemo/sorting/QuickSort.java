package com.example.designpatterndemo.sorting;

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
        if (low < high) {
        /* pi is partitioning index, arr[pi] is now
           at right place */
            int pi = partition(arr, low, high);


            sort(arr, low, pi - 1);  // Before pi
            sort(arr, pi + 1, high); // After pi
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
        // pivot (Element to be placed at right position)
        int pivot = arr[high];

        int i = (low - 1);  // Index of smaller element

        for (int j = low; j < high; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
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

        return i + 1;
    }
}
