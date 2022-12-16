package com.ppj.practice18;

/*
Create and test functions taking a two-dimensional array of doubles
and returning a boolean (functions returning a boolean are called predicates)

• isRectangular — checking if the given array is rectangular;
• isSquare — checking if the given array is square;
• isSymmetric — checking if the given array is symmetric (i.e., is square and a_ij = a_ji).
  Create also predicates taking two two-dimensional arrays
• isSameShape — checking if given arrays are of the same shape, i.e., all dimensions are equal;
• isSame — checking if given arrays are identical.

 */

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Task1802 {
    public static void main(String[] args) {
        int[][] arr1 = {};
        int[][] arr2 = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 8},
        };
        int[][] arr3 = {
                {1, 2},
                {2, 1},
        };
        int[][] arr4 = {
                {1, 2},
                {2, 4},
                {3, 5},
        };
        int[][][] arrays = {arr1, arr2, arr3, arr4};
        Map<String, RunFunction> tests = new LinkedHashMap<>();
        tests.put(
                "isRectangular",
                () -> runFunctionInLoop(arrays, "isRectangular", (arr) -> isRectangular(arr))
        );
        tests.put(
                "isSquare",
                () -> runFunctionInLoop(arrays, "isSquare", (arr) -> isSquare(arr))
        );
        tests.put(
                "isSymmetric",
                () -> runFunctionInLoop(arrays, "isSymmetric", (arr) -> isSquare(arr))
        );
        tests.put(
                "isSameShape",
                () -> {
                    printFunctionWithTwoArrays(arrays[0], arrays[1], "isSameShape", (a1, a2) -> isSameShape(a1, a2));
                    printFunctionWithTwoArrays(arrays[1], arrays[1], "isSameShape", (a1, a2) -> isSameShape(a1, a2));
                    printFunctionWithTwoArrays(arrays[0], arrays[0], "isSameShape", (a1, a2) -> isSameShape(a1, a2));
                    printFunctionWithTwoArrays(arrays[1], arrays[2], "isSameShape", (a1, a2) -> isSameShape(a1, a2));
                    printFunctionWithTwoArrays(arrays[2], arrays[2], "isSameShape", (a1, a2) -> isSameShape(a1, a2));
                    printFunctionWithTwoArrays(arrays[0], arrays[2], "isSameShape", (a1, a2) -> isSameShape(a1, a2));
                    printFunctionWithTwoArrays(arrays[3], arrays[2], "isSameShape", (a1, a2) -> isSameShape(a1, a2));
                    printFunctionWithTwoArrays(arrays[3], arrays[3], "isSameShape", (a1, a2) -> isSameShape(a1, a2));
                }
        );
        tests.put(
                "isSameShape",
                () -> {
                    printFunctionWithTwoArrays(arrays[0], arrays[1], "isSame", (a1, a2) -> isSame(a1, a2));
                    printFunctionWithTwoArrays(arrays[1], arrays[1], "isSame", (a1, a2) -> isSame(a1, a2));
                    printFunctionWithTwoArrays(arrays[0], arrays[0], "isSame", (a1, a2) -> isSame(a1, a2));
                    printFunctionWithTwoArrays(arrays[1], arrays[2], "isSame", (a1, a2) -> isSame(a1, a2));
                    printFunctionWithTwoArrays(arrays[2], arrays[2], "isSame", (a1, a2) -> isSame(a1, a2));
                    printFunctionWithTwoArrays(arrays[0], arrays[2], "isSame", (a1, a2) -> isSame(a1, a2));
                    printFunctionWithTwoArrays(arrays[3], arrays[2], "isSame", (a1, a2) -> isSame(a1, a2));
                    printFunctionWithTwoArrays(arrays[3], arrays[3], "isSame", (a1, a2) -> isSame(a1, a2));
                }
        );


        for (Map.Entry<String, RunFunction> test : tests.entrySet()) {
            System.out.println("--- " + test.getKey() + " ---");
            test.getValue().run();
        }
    }

    public static boolean isRectangular(int[][] arr) {
        if (arr.length == 0 || arr[0].length == 0) {
            return false;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[0].length != arr[i].length) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSquare(int[][] arr) {
        if (arr.length == 0 || arr[0].length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSymmetric(int[][] arr) {
        if (arr.length == 0 || arr[0].length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSameShape(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length != arr2[i].length) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSame(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length != arr2[i].length) {
                return false;
            }
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr1[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void runFunctionInLoop(int[][][] arrays, String name, RunFunctionWithArray runFunctionWithArray) {
        for (int i = 0; i < arrays.length; i++) {
            printFunctionWithArray(name, runFunctionWithArray, arrays[i]);
        }
    }

    private static void printFunctionWithArray(String name, RunFunctionWithArray runFunctionWithArray, int[][] arrays) {
        System.out.println("arr");
        printArray(arrays);
        System.out.println(name + ": " + runFunctionWithArray.run(arrays));
        System.out.println("-------");
    }

    private static void printFunctionWithTwoArrays(
            int[][] arr1,
            int[][] arr2,
            String name,
            RunFunctionWithTwoArrays runFunctionWithTwoArrays
    ) {
        System.out.println("arr1");
        printArray(arr1);
        System.out.println("arr2");
        printArray(arr2);
        System.out.println(name + ": " + runFunctionWithTwoArrays.run(arr1, arr2));
        System.out.println("-------");
    }

    private static void printArray(int[][] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
        }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}

interface RunFunction {
    void run();
}

interface RunFunctionWithArray {
    boolean run(int[][] arr);
}

interface RunFunctionWithTwoArrays {
    boolean run(int[][] arr1, int[][] arr2);
}
