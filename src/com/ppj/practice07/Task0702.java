package com.ppj.practice07;

class Task0702 {
    /*
    Write a program which reads four integer numbers
    and prints the difference between the largest and the smallest of them.
    Don’t use arrays, strings or collections.
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input 0 number");
        int a = scanner.nextInt();
        System.out.println("Input 1 number");
        int b = scanner.nextInt();
        System.out.println("Input 2 number");
        int c = scanner.nextInt();
        System.out.println("Input 3 number");
        int d = scanner.nextInt();

        int one = a >= b ? a : b;
        int two = c >= d ? c : d;
        int max = one >= two ? one : two;
        one = a <= b ? a : b;
        two = c <= d ? c : d;
        int min = one <= two ? one : two;
        System.out.println(max + " - " + min + " = " + (max - min));
    }
}
