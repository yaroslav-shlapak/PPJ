package com.ppj.practice15;

/*
Write a static function which takes a two-dimensional rectangular array of ints, for example

int[][] arr = { {1,3,2}, {3,4,8}, {2,6,8}, {1,8,5} };

and then calculates and prints the index of the ‘row’ with the largest sum of elements and the index of the ‘column’
with the largest sum of elements (in the example above this would be indices 2 and 2).
Of course, the program should work for any two-dimensional rectangular array, with arbitrary dimensions.
 */

import java.util.Arrays;

class Task1503 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 2},
                {3, 4, 8},
                {2, 6, 8},
                {1, 8, 5}
        };

        int indexOfMaxSum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int[] row = arr[i];
            int sum = 0;
            for (int item : row) {
                sum += item;
            }
            if (i == 0) {
                maxSum = sum;
            }
            if (sum > maxSum) {
                maxSum = sum;
                indexOfMaxSum = i;
            }
        }

        System.out.println(indexOfMaxSum);

        indexOfMaxSum = 0;
        maxSum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            if (i == 0) {
                maxSum = sum;
            }
            if (sum > maxSum) {
                maxSum = sum;
                indexOfMaxSum = i;
            }
        }
        System.out.println(indexOfMaxSum);
    }


}
