package com.ppj.practice07;

class Task0703 {
    /*
    Write a program which reads three integers (say, a, b and c), then prints these three numbers

    System.out.println(a + " " + b + " " + c);

    and then rearranges the values in these variables in such a way
    that a contains the smallest of the three numbers, b — the middle one, and c — the largest.
    Print again System.out.println(a + " " + b + " " + c);
    and you shoud see the same three numbers, but in ascending order.
    Any two (or all three) numbers may be equal.

    Do not use arrays or Strings!
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input 0 number");
        int a = scanner.nextInt();
        System.out.println("Input 1 number");
        int b = scanner.nextInt();
        System.out.println("Input 2 number");
        int c = scanner.nextInt();
        System.out.println(a + " " + b + " " + c);

        int min = getMin(a, b, c);
        int middle = getMiddle(a, b, c);
        int max = getMax(a, b, c);
        a = min;
        b = middle;
        c = max;

        System.out.println(a + " " + b + " " + c);
    }

    private static int getMax(int a, int b, int c) {
        int tmp = a >= b ? a : b;
        int max = tmp >= c ? tmp : c;
        return max;
    }

    private static int getMin(int a, int b, int c) {
        int tmp = a <= b ? a : b;
        int min = tmp <= c ? tmp : c;
        return min;
    }

    private static int getMiddle(int a, int b, int c) {
        int middle = 0;
        if (isXMiddle(a, b, c)) {
            middle = a;
        } else if (isXMiddle(b, c, a)) {
            middle = b;
        } else if (isXMiddle(c, a, b)) {
            middle = c;
        }
        return middle;
    }

    private static boolean isXMiddle(int x, int y, int z) {
        return x >= y && x <= z || x <= z && x >= y;
    }
}
