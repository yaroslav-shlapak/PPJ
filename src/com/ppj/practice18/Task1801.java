package com.ppj.practice18;

/*
Write a function selSort which sorts a given array of ints (orders its elements from the smallest to the largest)
using selection sort algorithm. Namely, we iterate over positions (indices) of the array from index 0 to the last
but one and for each index (say, i) we find the index of the smallest element among those with indices larger
than i (i.e., to the right of the i-th element). If the element found is smaller than the i-th, we swap them.

Note that the number of swaps will be at most n − 1 where n is the size of the array.

Write two static functions, both taking a two-dimensional array of ints and using the function selSort
• sortRows — which sorts separately each ‘row’ of the array (note that the array need not be rectangular);
• sortCols — which sorts separately each ‘column’ of the array (this, of course, can be done only for rectangular arrays).

Write also a function which prints a two-dimensional array on the console. For example, the attached program should print:

[3, 2, 6, 1, 3, 5, 6, 1, 3]
[3, 1, 2, 1, 5, 7, 2]
[8, 9, 2, 1]

After:
[1, 1, 2, 3, 3, 3, 5, 6, 6]
[1, 1, 2, 2, 3, 5, 7]
[1, 2, 8, 9]

Now columns
Before:
[3, 2, 6, 1, 6]
[7, 1, 2, 1, 5]
[5, 3, 1, 8, 7]
[8, 9, 2, 7, 1]

After:
[3, 1, 1, 1, 1]
[5, 2, 2, 1, 5]
[7, 3, 2, 7, 6]
[8, 9, 6, 8, 7]
 */

import java.util.Arrays;

class Task1801 {
    public static void selSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                   min = arr[j];
                   minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void sortRows(int[][] arr) {
        for (int[] row : arr) {
            selSort(row);
        }
    }

    public static void sortCols(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                int min = arr[i][j];
                int minIndex = i;
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[k][j] < min) {
                        min = arr[k][j];
                        minIndex = k;
                    }
                }
                swap2d(arr, minIndex, j, i, j);
            }
        }
    }

    public static void printArr2D(int[][] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
        }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void swap2d(int[][] arr, int i1, int j1, int i2, int j2) {
        int temp = arr[i1][j1];
        arr[i1][j1] = arr[i2][j2];
        arr[i2][j2] = temp;
    }

    public static void main(String[] args) {
        int[][] a = {
                {3, 2, 6, 1, 3, 5, 6, 1, 3},
                {3, 1, 2, 1, 5, 7, 2},
                {8, 9, 2, 1}
        };
        System.out.println("Before:");
        printArr2D(a);
        sortRows(a);
        System.out.println("After:");
        printArr2D(a);

        int[][] b = {
                {3, 2, 6, 1, 6},
                {7, 1, 2, 1, 5},
                {5, 3, 1, 8, 7},
                {8, 9, 2, 7, 1}
        };
        System.out.println("Now columns\nBefore:");
        printArr2D(b);
        sortCols(b);
        System.out.println("After:");
        printArr2D(b);
    }
}
