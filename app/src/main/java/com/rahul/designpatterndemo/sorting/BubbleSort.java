package com.rahul.designpatterndemo.sorting;

import java.util.HashMap;

/**
 * Bubble Sort is the simplest sorting algorithm that
 * works by repeatedly swapping the adjacent elements if
 * they are in wrong order
 * <p>
 * Worst complexity: n^2
 * Average complexity: n^2
 * Best complexity: n
 * <p>
 * Space complexity: 1
 */
public class BubbleSort {

    public static void main(String[] args) {


        BubbleSort ob = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    /* Prints the array */
    private void printArray(int[] arr) {
        int n = arr.length;
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }
}
