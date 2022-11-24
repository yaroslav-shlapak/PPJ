package com.ppj.practice12;

/*
Write a program which reads from the user three non-negative integers and then prints, using symbols ’*’,
a ‘histogram’ of the data represented by the numbers, i.e., three vertical bars, aligned at the bottom,
with heights equal to the values of the three numbers. For example, for numbers 3,
1 and 8 the result should look like this:
  *
  *
  *
  *
  *
* *
* *
***

Do not use arrays, strings or any other kind of collections.
 */

class Task1202 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = getMax(getMax(a, c), getMax(b, c));

        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < 3; j ++) {
                switch (j) {
                    case 0: {
                        printStarOrSpace(max, i, a);
                        break;
                    }
                    case 1: {
                        printStarOrSpace(max, i, b);
                        break;
                    }
                    case 2: {
                        printStarOrSpace(max, i, c);
                        break;
                    }
                }
            }
            System.out.println();
        }
    }

    private static void printStarOrSpace(int max, int i, int value) {
        System.out.print(max - i >= value ? " " : "*");
    }

    private static int getMax(int lastMax, int newNumber) {
        return lastMax >= newNumber ? lastMax : newNumber;
    }
}
