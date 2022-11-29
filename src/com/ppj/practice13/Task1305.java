package com.ppj.practice13;

/*
Write a program which for a given array of int-s prints all its elements,
but each value only once, without repetitions (and the number of different elements).
For example, for array

int[] arr = { 2,3,4,3,2,6,3,6,8,2,9 };

the result could be (the order of printed values is irrelevant):

4 3 6 8 2 9
There were 6 different numbers

Do not create any auxiliary arrays, collections or Strings.
Do not use any classes from packages other than the standard java.lang.
Do not modify the array (in particular, do not sort it).
 */

import java.util.Arrays;

class Task1305 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,2,6,3,6,8,2,9};

        System.out.println(Arrays.toString(arr));
        if (arr.length == 0) return;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isFirst(arr, arr[i], i)) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }

    private static boolean isFirst(int[] arr, int val, int n) {
        boolean isFirst = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] == val) {
                isFirst = false;
                break;
            }
        }
        return isFirst;
    }

}
