package com.ppj.practice13;

/*
Write a program which finds the difference between the maximum and minimum elements of a given array.
 */

class Task1301 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 1, 1};

        if (arr.length == 0) return;
        int min = arr[0];
        int max = arr[0];
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        System.out.println(max - min);
    }
}
