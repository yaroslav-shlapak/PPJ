package com.ppj.practice16;

/*
Write a static recursive function which takes an array of ints, starting index and a value;
the function returns (but doesn’t print!) number of occurrences of this value in the part of the array starting
from the given index; for example, the attached program should print

2 -> 3
3 -> 4


Do not use static fields, loops or additional arrays/collections/strings!
 */

import java.util.Arrays;

class Task1601 {
    static int count(int[] arr, int from, int what, int count) {
        if (from == arr.length) {
            return count;
        } else {
            if (arr[from] == what) {
                count++;
            }
            return count(arr, ++from, what, count);
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 2, 4, 3, 1, 6, 3, 2, 3};
        System.out.println("2 -> " + count(a,0,2, 0));
        System.out.println("3 -> " + count(a,0,3, 0));
    }
}
