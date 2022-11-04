package com.ppj.practice09;

/*
Write a program which reads five numbers of type int and prints the two greatest of them (which can be equal).
You can define at most three variables of type int.

Do not use loops or arrays.
 */

class Task0901 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Input 0 number");
        int max0 = scanner.nextInt();

        System.out.println("Input 1 number");
        int max1 = scanner.nextInt();
        int input = max0;
        if (max0 <= max1) {
            max0 = max1;
            max1 = input;
        }

        System.out.println("Input 2 number");
        input = scanner.nextInt();
        if (input >= max0 && input >= max1) {
            max1 = max0;
            max0 = input;
        }

        System.out.println("Input 3 number");
        input = scanner.nextInt();
        if (input >= max0 && input >= max1) {
            max1 = max0;
            max0 = input;
        }

        System.out.println("Input 4 number");
        input = scanner.nextInt();
        if (input >= max0 && input >= max1) {
            max1 = max0;
            max0 = input;
        }

        System.out.println(String.format("1st max = %d, 2nd max = %d", max0, max1));
    }

}
