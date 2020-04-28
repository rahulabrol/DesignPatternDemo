package com.example.designpatterndemo;

import java.util.Arrays;

/**
 * Created by Rahul Abrol on 2/4/20.
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        int element = -1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int k = i;
            if (arr[k] == arr[k++]) {
                continue;
            } else {
                if (k + 2 <= arr.length && arr[k + 2] != arr[k + 1]) {
                    element = arr[k];
                    break;
                }
            }
        }
        System.out.println(element);
    }
}
