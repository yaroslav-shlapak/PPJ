package com.ppj.practice08;

/*
Write a program which reads three natural numbers, a, b and c,
and then prints "OK" if for any two of them their sum is strictly
larger than the third (in other words, if a triangle with side lengths equal those numbers exists),
and "NOT OK" otherwise.
 */

class Task0801 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input 0 number");
        int a = scanner.nextInt();
        System.out.println("Input 1 number");
        int b = scanner.nextInt();
        System.out.println("Input 2 number");
        int c = scanner.nextInt();

        String successMessage = "OK";
        String failMessage = "NOT OK";

        if (isTriangle(a, b, c)) {
            System.out.println(successMessage);
        } else {
            System.out.println(failMessage);
        }

        String result = isTriangle(a, b, c) ? successMessage : failMessage;

        System.out.println(result);

        scanner.close();
    }

    private static boolean isTriangle(int a, int b, int c) {
        return ((a + b) > c) && ((b + c) > a) && ((c + a) > b);
    }

}
