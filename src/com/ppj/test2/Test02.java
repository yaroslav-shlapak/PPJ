package com.ppj.test2;

import java.util.Arrays;

class Test02 {
    public static void main(String[] args) {
//        java.util.Scanner scanner = new java.util.Scanner(System.in);
//        int num = scanner.nextInt();
//        System.out.println();

//        int[] array = {4, 5, 3, 1, 2};
//        int buff = array[array.length - 1];
//
//        for (int i = array.length - 2; i <= 0; i--) {
//            array[i + 1] = array[i];
//        }
//        array[0] = buff;
//
//        System.out.println(Arrays.toString(array));

//        int[][] tab = {{1, 2, 3}, {4, 0, 5}, {6, 7, 8}};
//        fun(tab);
//        for(int[] a : tab) {
//            System.out.println(Arrays.toString(a));
//        }


//        int size = 7;
//        int sizeOfSpear = 3;
//        int padding = 0;
//        for (int i = 0; i <= size; i++) {
//            if (i + sizeOfSpear >= size) {
//                padding++;
//            }
//            for (int j = 0; j <= size; j++) {
//                if (j == padding || j == size - padding - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //System.out.println(ss());

        /*

         */

        //System.out.println(isPalindrome(12345432));


        //System.out.println(fun(new int[][]{{1, 2, 3}, {4, 0, 5}, {6, 7, 8}}));
    }

    public static int[][] fun(int[][] array, int searched) {
        int[][] res = new int[array.length][array[0].length];
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == searched) {
                    res[count] = new int[]{i, j};
                    count++;
                }
            }
        }

        return res;
    }

    private static boolean isPalindrome(int integer) {
        int val = integer;
        int length = 0;
        while (val > 0) {
            val /= 10;
            length++;
        }
        int[] arr = new int[length];
        val = integer;
        for (int i =0; i < length; i++) {
            arr[i] = val % 10;
            val /= 10;
        }

        for (int i = 0, j = length - 1; j > i; j--, i++) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }

    private static int task5() {
        int[] arr = {1, 2, 3, 3, 4, 1};
        int count = 0;
        if (arr.length == 0)
            return count;
        int prev = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > prev) {
                count++;
            }
            prev = arr[i];
        }
        return count;
    }

    private static void fun(int[][] arr) {
        if (arr.length == 0 || arr[0].length == 0) {
            return;
        }
        int[] ri = new int[arr.length];
        int[] ci = new int[arr[0].length];

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
               if (arr[i][j] == 0) {
                   ci[j] = ri[i] = 1;
               }
            }
        }

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (ri[i] == 1 || ci[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}
