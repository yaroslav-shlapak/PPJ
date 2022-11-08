package com.ppj.practice10;

/*
Write a program which reads numbers until the user enters number 0
and then prints the maximum and minimum of the numbers that have been entered.
Don’t use arrays, strings or collections.
 */

class Task1002 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int input = scanner.nextInt();
        int max = input;
        int min = input;
        while (input != 0) {
            input = scanner.nextInt();
            max = input > max ? input : max;
            min = input < min ? input : min;
        };
        System.out.println(String.format("min: %d, max: %d", min, max));
    }
}
