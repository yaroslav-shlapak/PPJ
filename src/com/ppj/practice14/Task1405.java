package com.ppj.practice14;

/*
Define a three-dimensional array of ints representing deposits
and withdrawals of customers of a bank in and out of their accounts (each customer may have several accounts).
For example download Arr3DBank.java

int[][][] opers = { { {100, -50, 25}, {150,-300}, {300,-90,100} }, { {90, -60, 250}, {300,20,-100} }, { {20, 50}, {300}, {20,-20,40}, {100,-200} } };

where

• the first index indicates a customer;
• the second index indicates, for a given customer, his/her account;
• the third index indicates, for a given customer and his/her account,
  subsequent deposits (positive values) and withdrawals (negative values).

The program should create an array of ints of dimension equal to the number of customers,
the elements of which are sums of all deposits and withdrawals for subsequent customers,
in and out of all his/her accounts (for the data as in the example above,
these should be the numbers 235, 500 and 310).
2 After modifications of the sizes and/or values of elements of the array oper,
the program should work correctly without any other changes
 */

class Task1405 {
    public static void main(String[] args) {
        int[][][] opers = {
                {
                        {100, -50, 25},
                        {150, -300},
                        {300, -90, 100}
                },
                {
                        {90, -60, 250},
                        {300, 20, -100}
                },
                {
                        {20, 50},
                        {300},
                        {20, -20, 40},
                        {100, -200}
                }
        };

    }

    private static void swapMinMax(int[] arr) {
        if (arr.length == 0) return;
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
        swap(arr, indexOfMin, indexOfMax);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
