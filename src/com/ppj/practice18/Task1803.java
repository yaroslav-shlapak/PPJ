package com.ppj.practice18;

/*
Create a class OneLiners with four static functions described below.
Try to implement them as ‘oneliners’, i.e. in such a way that each of them consists only of one return statement.

• public static boolean hasTwoRoots(double a, double b, double c) returns true if,
  and only if, the equation ax2 + bx + c has exactly two different solutions, and false otherwise;
• public static boolean monot(double a, double b, double c) returns true if,
  and only if, the numbers a, b and c constitute a strictly increasing sequence
  (each subsequent term is bigger than the previous) or a strictly decreasing one, and false otherwise;
• public static double maxEl(double a, double b, double c)) returns the maximum value of the numbers a, b and c;
• public static int numPos(double a, double b, double c) returns the number of positive values among a, b and c.

For example, the attached program, after implementing the functions, should print:

(a, b, c,)=(  2.0, 3.0,  1.0 ): hasTwoRoots? true
(a, b, c,)=(  0.0, 2.0,  1.0 ): hasTwoRoots? false
(a, b, c,)=(  2.0, 1.0, -1.0 ): monot? true
(a, b, c,)=(  2.0, 1.0,  2.0 ): monot? false
(a, b, c,)=(  2.0, 1.0,  2.0 ): maxEl = 2.0
(a, b, c,)=(  2.0, 2.0,  4.0 ): maxEl = 4.0
(a, b, c,)=( -2.0, 1.0, -3.0 ): numPos = 1
(a, b, c,)=( -2.0, 1.0,  3.0 ): numPos = 2
 */

class Task1803 {
    public static void main (String[] args) {
        System.out.println("(a, b, c,)=(  2.0, 3.0,  1.0 ): hasTwoRoots? "  +   hasTwoRoots( 2.0, 3.0,  1.0));
        System.out.println("(a, b, c,)=(  0.0, 2.0,  1.0 ): hasTwoRoots? "  +   hasTwoRoots( 0.0, 2.0,  1.0));
        System.out.println("(a, b, c,)=(  2.0, 1.0, -1.0 ): monot? "         +   monot( 2.0, 1.0, -1.0));
        System.out.println("(a, b, c,)=(  2.0, 1.0,  2.0 ): monot? "         +   monot( 2.0, 1.0,  2.0));
        System.out.println("(a, b, c,)=(  2.0, 1.0,  2.0 ): maxEl? "        +   maxEl( 2.0, 1.0,  2.0));
        System.out.println("(a, b, c,)=(  2.0, 2.0,  4.0 ): maxEl? "        +   maxEl( 2.0, 2.0,  4.0));
        System.out.println("(a, b, c,)=( -2.0, 1.0, -3.0 ): numPos? "       +   numPos(-2.0, 1.0, -3.0));
        System.out.println("(a, b, c,)=( -2.0, 1.0,  3.0 ): numPos? "       +   numPos(-2.0, 1.0,  3.0));
    }

    public static boolean hasTwoRoots(double a, double b, double c) {
        return b * b - 4 * a * c >= 0;
    }

    public static boolean monot(double a, double b, double c) {
        return a > b && b > c || a < b && b < c;
    }

    public static double maxEl(double a, double b, double c) {
        return a > b && a > c ? a : b > a && b > c ? b : c;
    }

    public static int numPos(double a, double b, double c) {
        double[] arr = {a, b, c};
        int count = 0;
        for (double item : arr) {
            if (item > 0) count++;
        }
        return count;
    }


}
