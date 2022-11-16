package com.ppj.practice11;

/*
Write a program which reads two natural numbers, w and h, and then prints a rectangle with width w and height h.
For example, if the numbers are 7 and 5, the result should look like this:

*******
*     *
*     *
*     *
*******

 */

class Task1104 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        for (int j = 0; j < h; j++) {
            if (j == 0 || j == h - 1) {
                for (int i = 0; i < w; i++) {
                    System.out.print("*");
                }
            } else {
                for (int i = 0; i < w; i++) {
                    if (i == 0 || i == w - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
