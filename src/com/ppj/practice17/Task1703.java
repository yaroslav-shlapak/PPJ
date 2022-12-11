package com.ppj.practice17;

/*
Write a function which takes a two-dimensional rectagular array of ints and prints its elements in the order
form the upper-left corner along a spiral winding clockwise inwards


For example, the attached program should print

1 3 5 7 9 7 5 3 1 3 5 7 9 7 5 3 1 3 0 2 4 6 8 6 4 2 0 1 3 5
 */

class Task1703 {
    public static void main(String[] args) {
        System.out.println("1 3 5 7 9 7 5 3 1 3 5 7 9 7 5 3 1 3 0 2 4 6 8 6 4 2 0 1 3 5");
        int[][] a = {
                {1, 3, 5, 7, 9},
                {3, 0, 2, 4, 7},
                {1, 1, 3, 6, 5},
                {3, 0, 5, 8, 3},
                {5, 2, 4, 6, 1},
                {7, 9, 7, 5, 3}
        };
        spiral(a);
    }

    private static void spiral(int[][] a) {

        int count = 0;
        int endPadding = 0;
        int bottomPadding = 0;
        int startPadding = 0;
        int topPadding = 0;
        int width = a[0].length;
        int length = a.length;
        int maxCount = width * length;
        while (count < maxCount) {
            for (int i = startPadding; i < width - endPadding; i++) {
                System.out.print(a[topPadding][i] + " ");
                count++;
            }
            topPadding++;
            for (int i = topPadding; i < length - bottomPadding; i++) {
                System.out.print(a[i][width - 1 - endPadding] + " ");
                count++;
            }
            endPadding++;
            for (int i = width - 1 - endPadding; i >= startPadding; i--) {
                System.out.print(a[length - 1 - bottomPadding][i] + " ");
                count++;
            }
            bottomPadding++;
            for (int i = length - 1 - bottomPadding; i >= topPadding; i--) {
                System.out.print(a[i][startPadding] + " ");
                count++;
            }
            startPadding++;
        }
    }
}
