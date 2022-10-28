package com.ppj.practice08;

class Task0802 {
    public static void main(String[] args) {
        int a1 = 2;
        int a2 = 4;
        int b1 = 1;
        int b2 = 6;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input a number");
        int x = scanner.nextInt();

        System.out.println(String.format("Interval A = [%s, %s]", a1, a2));
        System.out.println(String.format("Interval B = [%s, %s]", b1, b2));
        System.out.println(String.format("Enter x %s", x));

        boolean xInA = x >= a1 && x <= a2;
        boolean xInB = x >= b1 && x <= b2;
        System.out.println(String.format("x in A: %b", xInA));
        System.out.println(String.format("x in B: %b", xInB));
        System.out.println(String.format("x in A/B: %b", xInA && !xInB));
        System.out.println(String.format("x in B/A: %b", xInB && !xInA));
        System.out.println(String.format("x in intersection of A and B: %b", xInA && xInB));
        System.out.println(String.format("x in union of A and B: %b", xInA || xInB));
        System.out.println(String.format("x in symm. diff. of A and B: %b", xInA && !xInB || !xInA && xInB));

        scanner.close();
    }

}
