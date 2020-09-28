package com.example.designpatterndemo.sorting;

/**
 * Heap sort is a comparison based sorting technique based on Binary Heap data structure. It is
 * similar to selection sort where we first find the maximum element and place the maximum element
 * at the end. We repeat the same process for the remaining elements.
 * <p>
 * A Binary Heap is a Complete Binary Tree where items are stored in a special order such that
 * value in a parent node is greater(or smaller) than the values in its two children nodes. The
 * former is called as max heap and the latter is called min-heap. The heap can be represented by a
 * binary tree or array.
 * <p>
 * Why array based representation for Binary Heap?
 * Since a Binary Heap is a Complete Binary Tree, it can be easily represented as an array and the
 * array-based representation is space-efficient. If the parent node is stored at index I, the left
 * child can be calculated by 2 * I + 1 and right child by 2 * I + 2 (assuming the indexing starts at 0).
 * <p>
 * Heap Sort Algorithm for sorting in increasing order:
 * 1. Build a max heap from the input data.
 * 2. At this point, the largest item is stored at the root of the heap. Replace it with the last
 * item of the heap followed by reducing the size of heap by 1. Finally, heapify the root of the tree.
 * 3. Repeat step 2 while size of heap is greater than 1.
 */
public class HeapSort {
    /* A utility function to print array of size n */
    static void printArray(int[] arr) {
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }

    public void sort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}
