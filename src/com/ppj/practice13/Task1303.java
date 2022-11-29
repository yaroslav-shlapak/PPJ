package com.ppj.practice13;

/*
Define in a program an array of non-negative integers, for example

int[] arr = {1, 5, 8, 2, 6};

and then print a vertical ‘histogram’ of data contained in the array, i.e.,
in subsequent columns as many asterisks as is the value
of subsequent element of the array (columns aligned at the bottom).
For the data as above, the program should print:

  *
  *
  * *
 ** *
 ** *
 ** *
 ****
*****
 */

import java.util.Arrays;

class Task1303 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 2, 6};

        System.out.println(Arrays.toString(arr));
        if (arr.length == 0) return;

        int max = findMax(arr);

        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < arr.length; j ++) {
                printStarOrSpace(max, i, arr[j]);
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(arr));
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    private static void printStarOrSpace(int max, int i, int value) {
        System.out.print(max - i >= value ? " " : "*");
    }
}
