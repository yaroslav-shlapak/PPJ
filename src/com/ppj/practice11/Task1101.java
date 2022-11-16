package com.ppj.practice11;

/*
Write a program which reads an integer and checks if it is a prime number
 */

class Task1101 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int input = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "the number is prime" : "the number is not prime");
    }
}
