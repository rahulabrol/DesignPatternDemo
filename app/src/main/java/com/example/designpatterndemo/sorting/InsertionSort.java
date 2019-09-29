package com.example.designpatterndemo.sorting;

/**
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 * <p>
 * https://www.youtube.com/watch?time_continue=3&v=OGzPmgsI-pQ
 */
public class InsertionSort {
    /* A utility function to print array of size n*/
    private static void printArray(int[] arr) {
        int n = arr.length;
        for (int value : arr) System.out.print(value + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6};

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }

    /*Function to sort array using insertion sort*/
    private void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}