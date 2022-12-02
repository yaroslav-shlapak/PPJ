package com.ppj.practice15;

/*
Write a function taking a two-dimensional, rectangular array of ints
and zeroing all rows and columns which contain at least one zero element.
As a result attached ZerosMatrix.java file should print should print something like:

Original matrix
4 9 10 0 1 2
7 -8 20 1 5 8
1 8 3 2 1 -3
1 8 -3 2 11 -3
17 0 5 -9 21 10

Zeroing rows and columns containg zero
0 0 0 0 0 0
7 0 20 0 5 8
1 0 3 0 1 -3
1 0 -3 0 11 -3
0 0 0 0 0 0

The function cannot create any two-dimensional arrays, but may create, no more than two, one-dimensional arrays.
 */

import java.util.Arrays;

class Task1504 {
    public static void main(String[] args){
        int[][] a = {
                {  4,  9, 10,  0,  1,  2 },
                {  7, -8, 20,  1,  5,  8 },
                {  1,  8,  3,  2,  1, -3 },
                {  1,  8, -3,  2, 11, -3 },
                { 17,  0,  5, -9, 21, 10 }
        };
        printArr(a, "Original matrix");
        setZeros(a);
        printArr(a, "Zeroing rows and columns containing zero");
    }

    public static void setZeros(int[][] arr) {
        int[] is = new int[arr[0].length * arr.length];
        int[] js = new int[arr[0].length * arr.length];
        int zerosCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    is[zerosCount] = i;
                    js[zerosCount] = j;
                    zerosCount++;
                }
            }
        }
        for (int i = 0; i < zerosCount; i++) {
            setZerosForRow(arr, is[i]);
            setZerosForColumn(arr, js[i]);
        }
    }

    private static void setZerosForColumn(int[][] arr, int column) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][column] = 0;
        }
    }

    private static void setZerosForRow(int[][] arr, int row) {
        for (int i = 0; i < arr[0].length; i++) {
            arr[row][i] = 0;
        }
    }

    public static void printArr(int[][] arr, String message) {
        System.out.println(message);
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
