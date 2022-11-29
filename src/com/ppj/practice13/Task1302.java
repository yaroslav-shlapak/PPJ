package com.ppj.practice13;

/*
Write a program which swaps maximum and minimum element of a given array.
Print the array before and after this operation.
 */

import java.util.Arrays;

class Task1302 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 1, 1};

        System.out.println(Arrays.toString(arr));
        if (arr.length == 0) return;
        int min = arr[0];
        int max = arr[0];
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexOfMin = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                indexOfMax = i;
            }
        }
        swap(arr, indexOfMin, indexOfMax);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
