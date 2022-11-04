package com.ppj.practice09;

/*
Write a program which reads five numbers of type int and after reading the third,
fourth and fifth prints the sum of three numbers last read.

You can define at most three variables of type int.
Do not use loops or arrays.
 */

class Task0902 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Input 0 number");
        int x = scanner.nextInt();

        System.out.println("Input 1 number");
        int y = scanner.nextInt();

        System.out.println("Input 2 number");
        int z = scanner.nextInt();
        System.out.println(String.format("sum = %d", x + y + z));

        System.out.println("Input 3 number");
        x = y;
        y = z;
        z = scanner.nextInt();
        System.out.println(String.format("sum = %d", x + y + z));

        System.out.println("Input 4 number");
        x = y;
        y = z;
        z = scanner.nextInt();
        System.out.println(String.format("sum = %d", x + y + z));
    }
}
