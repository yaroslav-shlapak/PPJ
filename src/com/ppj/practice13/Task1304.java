package com.ppj.practice13;

/*
Write a program which rotates a given array of int-s by one position to the left,
i.e., the first element is replaced by the second, the second by the third etc.,
and the last by the first. For example, the array

1 2 3 4 5

after rotation should become

2 3 4 5 1

Do not create any auxiliary arrays or Strings!
 */

import java.util.Arrays;

class Task1304 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(arr));
        if (arr.length == 0) return;

        int previous = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            arr[i] = previous;
            previous = tmp;
        }
        arr[0] = previous;

        System.out.println(Arrays.toString(arr));
    }

}
