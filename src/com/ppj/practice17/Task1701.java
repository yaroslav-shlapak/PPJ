package com.ppj.practice17;

/*
In the program below

public class Arr2DJagged {
    public static void main (String[] args) {
        int[][] arr = { {1,3}, {3,4,5,8}, {6,8}, {9} };
        double[] res = getAverages(arr);
        for (double e : res)
            System.out.print(e + " ");
    }
    // ...
}

add a static function getAverages which

• takes a two-dimensional array of ints (not necessarily rectangular);
• returns an array of numbers of type double with its size equal to number of ‘rows’ in the two-dimensional array
  passed to the function. Consecutive elements of the resulting array should be equal to arithmetic averages
  of all elements of consecutive rows of the input array.

For the array as above, the result should be

2.0 5.0 7.0 9.0
 */

class Task1701 {
    public static void main (String[] args) {
        int[][] arr = { {1,3}, {3,4,5,8}, {6,8}, {9} };
        double[] res = getAverages(arr);
        for (double e : res)
            System.out.print(e + " ");
    }

    private static double[] getAverages(int[][] arr) {
        double[] averages = new double[arr.length];
        int i = 0;
        for (int[] row : arr) {
            double sum = 0.0;
            for (int item : row) {
                sum += item;
            }
            averages[i] = sum / row.length;
            i++;
        }
        return averages;
    }
}
