package com.ppj.practice14;

/*
Write a static function which takes an array of ints and returns the difference
between the index of the last even element and the index of the first even element
(or -1 if there are no at least two even elements).
Create a program which prints the array (in one line) and tests your function.
 */

class Task1401 {
    public static void main(String[] args) {
        System.out.println(getDiffBetweenLastAndFirstNumbers(new int[]{1, 2, 2, 4, 5, 1, 1}));
        System.out.println(getDiffBetweenLastAndFirstNumbers(new int[]{}));
        System.out.println(getDiffBetweenLastAndFirstNumbers(new int[]{0}));
        System.out.println(getDiffBetweenLastAndFirstNumbers(new int[]{1, 3, 5, 7, 8, 11}));
        System.out.println(getDiffBetweenLastAndFirstNumbers(new int[]{10, 8, 6, 4, 20}));
    }

    private static int getDiffBetweenLastAndFirstNumbers(int[] arr) {
        int diff = -1;
        if (arr.length == 0) return diff;
        int first = diff;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (counter == 0) {
                    first = i;
                } else {
                    diff = i - first;
                }
                counter++;
            }
        }
        return diff;
    }
}
