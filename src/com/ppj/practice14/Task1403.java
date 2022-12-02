package com.ppj.practice14;

/*
Define the following static functions operating on arrays of ints:
• printArr: takes an array and prints, in square brackets, its elements in one line, separated with spaces;
• numOdd: takes an array and returns the number of its odd elements;
• numEven: takes an array and returns the number of its even elements;
• getOddEven: takes an array and creates two (possibly empty) arrays —
  one containing only the odd elements of the input array and
  one containing only its even elements — and returns a two-element array containing the references to these two arrays;
• getMinMaxInd: takes an array and returns a two-element array containing the indices of the minimum and maximum elements.

For example, the attached main function should print something like array:

[ -1 9 3 0 -3 2 4 ]
odd: 4
even: 3
Index of min: 4
Index of max: 1 odd elements: [ -1 9 3 -3 ]
even elements: [ 0 2 4 ]
 */

import java.util.Arrays;

class Task1403 {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 9, 3, 0, -3, 2, 4};
        printArr(arr);

        System.out.println(numOdd(arr));

        System.out.println(numEven(arr));

        int[][] arrOddEven = getOddEven(arr);
        printArr(arrOddEven[0]);
        printArr(arrOddEven[1]);

        int[] minMax = getMinMaxInd(arr);
        System.out.println(minMax[0]);
        System.out.println(minMax[1]);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.println("]");
            } else {
                System.out.print(" ");
            }
        }
    }

    private static int numOdd(int[] arr) {
        int counter = 0;
        for (int n : arr) {
            if (n % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int numEven(int[] arr) {
        int counter = 0;
        for (int n : arr) {
            if (n % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[][] getOddEven(int[] arr) {
        int[] odds = new int[arr.length];
        int[] evens = new int[arr.length];
        int iOdd = 0;
        int iEven = 0;
        for (int n : arr) {
            if (n % 2 == 0) {
                evens[iEven] = n;
                iEven++;
            } else {
                odds[iOdd] = n;
                iOdd++;
            }
        }
        return new int[][]{Arrays.copyOf(odds, iOdd), Arrays.copyOf(evens, iEven)};
    }

    private static int[] getMinMaxInd(int[] arr) {
        if (arr.length == 0) return new int[]{};
        int max = arr[0];
        int min = arr[0];
        int indexOfMin = 0;
        int indexOfMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexOfMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                indexOfMin = i;
            }
        }
        return new int[]{indexOfMin, indexOfMax};
    }
}
