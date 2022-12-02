package com.ppj.practice15;

/*
Write a static function trans which takes a two-dimensional rectangular (by assumption) array of ints.
The function creates and returns a new two-dimensional array the consecutive columns of which contain elements
from consecutive rows of the original array. It doesn’t print anything!

For example, the following program attached program

should print
[1, 2, 3, 4, 5, 6]
[2, 3, 4, 5, 6, 7]
[3, 4, 5, 6, 7, 8]
[4, 5, 6, 7, 8, 9]

[1, 2, 3, 4]
[2, 3, 4, 5]
[3, 4, 5, 6]
[4, 5, 6, 7]
[5, 6, 7, 8]
[6, 7, 8, 9]
 */

import java.util.Arrays;

class Task1502 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6, 7},
                {3, 4, 5, 6, 7, 8},
                {4, 5, 6, 7, 8, 9}
        };
        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : trans(a))
            System.out.println(Arrays.toString(r));
    }

    private static int[][] trans(int[][] a) {
        int width = a.length;
        int height = a[0].length;
        int[][] t = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                t[i][j] = a[j][i];
            }
        }
        return t;
    }
}
