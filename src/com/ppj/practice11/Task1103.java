package com.ppj.practice11;

/*
Write a program which reads an odd natural number n and writes on the console a symmetric ‘kite’
consisting of asterisks: in the first line n stars, in the second line n − 2 stars, . . . ,
in n-th – one star. For example, for n = 7 the output should look like this:

*******
 *****
  ***
   *

 */

class Task1103 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int input = scanner.nextInt();
        int padding  = 0;
        int width = input;

        while (width > 0) {
            for (int i = 0; i < input; i++) {
                if (i < padding || i >= width + padding) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            padding++;
            width -= 2;
            System.out.println();
        }
    }
}
