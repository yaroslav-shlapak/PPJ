package com.ppj.practice14;

/*
Write a static function which takes an array of ints
and swaps (exchanges the values) of its greatest and smallest elements.
Create a program which prints the array (in one line) before and after this operation.
 */

import java.util.Arrays;

class Task1402 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 1, 1};
        swapMinMax(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        swapMinMax(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{8, 7, 6, 5, 4, 3, 2, 1, 0};
        swapMinMax(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swapMinMax(int[] arr) {
        if (arr.length == 0) return;
        int max = arr[0];
        int min = arr[0];
        int indexOfMin = 0;
        int indexOfMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexOfMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                indexOfMin = i;
            }
        }
        swap(arr, indexOfMin, indexOfMax);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
