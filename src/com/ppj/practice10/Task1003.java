package com.ppj.practice10;

/*
Write a program printing all divisors of a natural number (greater than 1)
entered by the user — including 1 and the number itself.
The program should also print the number of all divisors.
 */

class Task1003 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
