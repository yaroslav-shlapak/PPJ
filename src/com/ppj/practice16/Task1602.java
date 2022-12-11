package com.ppj.practice16;

/*
Write the function static void rotateMatrix(int[][] a)
which given a square array of ints rotates this array by 90◦ clockwise; for example, for the matrix

1 2 3 4
5 6 7 8
9 7 5 3
8 6 4 2

the result should be

8 9 5 1
6 7 6 2
4 5 7 3
2 3 8 4

Using auxiliary arrays, collections or Strings is not allowed.
Additionally, define the function static void printMatrix(int[][] a)
which pretty-prints two-dimensional arrays (one row in one line), so the attached program prints

Array a - original
1 2 3 4
5 6 7 8
9 7 5 3
8 6 4 2

Array a - rotated
8 9 5 1
6 7 6 2
4 5 7 3
2 3 8 4

Array b - original
1 2 3 4 5
5 6 7 8 9
9 7 5 3 1
8 6 4 2 0
0 4 6 4 0

Array b - rotated
0 8 9 5 1
4 6 7 6 2
6 4 5 7 3
4 2 3 8 4
0 0 1 9 5

 */

class Task1602 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 7, 5, 3},
                {8, 6, 4, 2}
        };

        int[][] b = {
                {1, 2, 3, 4, 5},
                {5, 6, 7, 8, 9},
                {9, 7, 5, 3, 1},
                {8, 6, 4, 2, 0},
                {0, 4, 6, 4, 0}
        };
        System.out.println("Array a - original");
        printMatrix(a);
        rotateMatrix(a);
        System.out.println("Array a - rotated");
        printMatrix(a);

        System.out.println("Array b - original");
        printMatrix(b);
        rotateMatrix(b);
        System.out.println("Array b - rotated");
        printMatrix(b);

    }

    private static void rotateMatrix(int[][] a) {
        rotateMatrix(a, a.length, 0, 0);
    }

    private static  void rotateMatrix(int[][] arr, int length, int rowIndex, int columnIndex) {

        if (rowIndex >= length || columnIndex >= length || length == 1)
            return;

        int val = arr[rowIndex][columnIndex];

        if (columnIndex == (length - 1))
            rotateMatrix(arr, length, rowIndex + 1, 0);
        else
            rotateMatrix(arr, length, rowIndex, columnIndex + 1);

        arr[columnIndex][(length - 1) - rowIndex] = val;
    }

    private static void printMatrix(int[][] a) {
        for (int[] row : a) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
