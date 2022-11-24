package com.ppj.practice12;

/*
Write a program which reads four integers a, b, c and d; we assume that a<b, c<d and all four
numbers belong to closed interval [−5, 5]. For all integers n from this interval,
the program prints information whether n belongs to the sum of closed intervals [a, b] and [c, d],
to their intersection, and to their symmetric difference.

For example, for a = −2, b = 3, c = 0, d = 4, the result should be something like:
-5: inSum? false; inIntersect? false; inSymDiff? false
-4: inSum? false; inIntersect? false; inSymDiff? false
-3: inSum? false; inIntersect? false; inSymDiff? false
-2: inSum? true; inIntersect? false; inSymDiff? true
-1: inSum? true; inIntersect? false; inSymDiff? true
+0: inSum? true; inIntersect? true; inSymDiff? false
+1: inSum? true; inIntersect? true; inSymDiff? false
+2: inSum? true; inIntersect? true; inSymDiff? false
+3: inSum? true; inIntersect? true; inSymDiff? false
+4: inSum? true; inIntersect? false; inSymDiff? true
+5: inSum? false; inIntersect? false; inSymDiff? false

Do not use any if statements; work on boolean variables and values.
 */

class Task1203 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for(int i = -5; i <= 5; i++) {
            boolean intSum = isInsideInterval(a, b, i) || isInsideInterval(c, d, i);
            boolean inIntersect = isInsideInterval(a, b, i) && isInsideInterval(c, d, i);
            boolean isSymDiff = isInsideInterval(a, b, i) ^ isInsideInterval(c, d, i);
            System.out.printf("%d: intSum? %b; inIntersect? %b; isSymDiff? %b", i, intSum, inIntersect, isSymDiff);
            System.out.println();
        }
    }

    private static boolean isInsideInterval(int p1, int p2, int n) {
        return n >= p1 && n <= p2;
    }
}
