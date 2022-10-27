package com.ppj.practice07;

class Task0701 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input 0 number");
        int a = scanner.nextInt();
        System.out.println("Input 1 number");
        int b = scanner.nextInt();
        System.out.println("Input 2 number");
        int c = scanner.nextInt();
        int middle = 0;
        if (isXMiddle(a, b, c)) {
            middle = a;
        } else if (isXMiddle(b, c, a)) {
            middle = b;
        } else if (isXMiddle(c, a, b)) {
            middle = c;
        }
        System.out.println("The middle number is: " + middle);
    }

    private static boolean isXMiddle(int x, int y, int z) {
        return x >= y && x <= z || x <= z && x >= y;
    }
}
