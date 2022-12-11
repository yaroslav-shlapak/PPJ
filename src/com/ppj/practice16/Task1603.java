package com.ppj.practice16;

/*
Create a class FuncStat containing only public static functions:

• public static int fiboR(int n) calculating the n-th Fibonacci number


using this recursive formula, which is rather unwise but enlightening — therefore,
the function should be recursive (in particular, no loops are allowed in its implementation!);

• public static int fiboI(int n) calculating the n-th Fibonacci number without recursion
  (i.e., iteratively — using a loop);
• public static int factR(int n) calculating n! recursively;
• public static int factI(int n) calculating n! iteratively;
• public static int gcdR(int a, int b) calculating the GCD, i.e., the greatest common divisor, of a and b recursively;
• public static int gcdI(int a, int b) calculating the GCD of a and b iteratively;
• public static int maxElem(int[] arr, int from) returning the largest element in the part of the array arr
  starting from element with index from. It must be a recursive function.
  Function max from class Math may be useful but is not necessary;
• public static int numEven(int[] arr, int from) returning the number of even elements in the part of the array arr
  starting from element with index from. It must be a recursive function.
• public static void reverse(int[] arr, int from) reversing the order of elements in the part of the array arr
  from the element with index from to the element with index arr.length-1-from. It must be a recursive function.
  Do not create any auxiliary arrays!.
• public static boolean isPalindrom(String s) returning true if, and only if, string s is a palindrom,
  i.e., a word which reads the same forward and backward, as, e.g., words radar or madam.
  Methods charAt and substring from class String may be useful. It must be a recursive function.

Then, in the main function of a separate class Main test all these functions.
Remark: according to Euclid (Elements, Book VII), the greatest common divisor of two positive integers, a and b,
can be calculated as follows:
1. if a = b, then the result is a (or b, as they are equal);
2. from the larger of these two numbers subtract the smaller and go to 1.

Do not use any classes from packages other than basic java.lang (in particular, no collections are allowed).
You can assume that functions will be invoked with legal arguments
(e.g., no negative argument of the factorial function).
For example, the attached main function should print
(note that calculating Fibonacci number F45 recursively takes a while. . . )

Wait...
1134903170
1134903170
479001600
479001600
97
97
Max : 9
Num even: 3
Before: [3, 8, 2, 9, 7, 4]
After : [4, 7, 9, 2, 8, 3]

Is 'radar' a palindrom? true
Is 'abba' a palindrom? true
Is 'rover' a palindrom? false

 */

import java.util.Arrays;

class Task1603 {
    public static void main (String[] args) {
/*        System.out.println("Wait...");
        System.out.println(FuncStat.fiboR(45));
        System.out.println(FuncStat.fiboI(45));
        System.out.println(FuncStat.factR(12));
        System.out.println(FuncStat.factI(12));
        System.out.println(FuncStat.gcdR(12125,40643));
        System.out.println(FuncStat.gcdI(12125,40643));
        int[] a = {3,8,2,9,7,4};
        System.out.println("Max     : " + FuncStat.maxElem(a,0));
        System.out.println("Num even: " + FuncStat.numEven(a,0));
        System.out.println("Before:   " + Arrays.toString(a));
        FuncStat.reverse(a,0);
        System.out.println("After :   " + Arrays.toString(a));
        System.out.println("Is 'radar' a palindrom? " +
                FuncStat.isPalindrom("radar"));
        System.out.println("Is 'abba' a palindrom?  " +
                FuncStat.isPalindrom("abba"));
        System.out.println("Is 'rover' a palindrom? " +
                FuncStat.isPalindrom("rover"));*/
    }

}

class FuncStat {

    public static boolean fiboR(int i) {
        return false;
    }

    public static boolean fiboI(int i) {
        return false;
    }
}
