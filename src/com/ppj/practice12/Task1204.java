package com.ppj.practice12;

/*
Write a program reading integers until zero is entered and printing
the length of the longest sequence of consecutive numbers of the same value (and this value).
For example, for
2 2 2 2 3 3 3 2 6 6 6 0
the result should be

Longest sequence: 4 times 2

for
2 2 2 3 3 3 3 3 2 6 6 6 0
the result should be

Longest sequence: 5 times 3

and for
2 2 333 333 2 3 -66 -66 -66 0

it should be Longest sequence: 3 times -66


Do not use arrays, strings or any other kind of collections.
Check your solutions for different cases: when the longest sequence is at the beginning,
somewhere in the middle, or at the very end.
 */

class Task1204 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n;
        int counter = 1;
        int previous = 0;
        int largestCounterN = 0;
        int largestCounter = 1;
        n = scanner.nextInt();
        if (n != 0) {
            previous = n;
            largestCounterN = previous;
            largestCounter = 1;
            while (n != 0) {
                n = scanner.nextInt();
                if (n == previous) {
                    counter++;
                } else {
                    if (counter > largestCounter) {
                        largestCounter = counter;
                        largestCounterN = previous;
                    }
                    counter = 1;
                }
                previous = n;
            }
        }

        System.out.printf("Longest sequence: %d times %d", largestCounter, largestCounterN);
    }
}
