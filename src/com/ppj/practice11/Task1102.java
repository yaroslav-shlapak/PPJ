package com.ppj.practice11;

/*
Write a program which finds the greatest common divisor (GCD) of two numbers read from the user.
Use Euclid’s algorithm (Elements, Book VII). In order to find the GCD of number a i b (a, b ∈ N) repeat the sequence:
1. if a = b, then GCD=a and END;
2. if a > b, then decrease a by b or, if b > a, then decrease b by a;

Note that the algorithm requires only testing equality and subtracting.
For those mathematically inclined: show that the algorithm will always stop, i.e.,
that after a finite number of iterations the condition in step 1 will be satisfied
(and both a and b will then be equal to GCD of the two numbers that we started with).
 */

class Task1102 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        System.out.println("greatest common divisor is: " + a);
    }
}
