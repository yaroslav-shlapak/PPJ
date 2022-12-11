package com.ppj.practice16;

/*
Write a static function isLess which takes two strings (String) and returns a value of type boolean: true if,
and only if the first string is strictly “smaller” than the second. The criteria of comparison are:
• shorter string is “smaller” than a longer (the length of a string s is s.length());
• if the strings are of the same length, the one lexicographically later is “smaller”.
To compare string lexicographically, you can use the method compareTo from class String:
if s1 and s2 are references to objects of class String, then

 s1.compareTo(s2)

returns a negative integral value if s1 is lexicographically earlier than s2, a positive number,
if s2 is earlier, and 0 if they are equal.

Write also a static function sortSel which sorts an array of strings passed as the argument
and using the selection sort algorithm; use your function isLess to compare strings.

For example, a program with the attached main function should print

[Kate, Bea, Mary, Bea, Zoe]
[Zoe, Bea, Bea, Mary, Kate]
 */

import java.util.Arrays;

class Task1604 {
    public static void main(String[] args) {

        String[] arr = {"Kate", "Bea", "Mary", "Bea", "Zoe"};
        System.out.println(Arrays.toString(arr));
        sortSel(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void sortSel(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String min = arr[i];
            int indexMin = i;
            for (int j = i; j < arr.length; j++) {
                if (isLess(arr[j], min)) {
                    min = arr[j];
                    indexMin = j;
                    System.out.println(min);
                }
            }
            swap(arr, i, indexMin);
        }
    }

    private static boolean isLess(String first, String second) {
        return first.length() < second.length() || (first.length() == second.length() && first.compareTo(second) > 0);
    }

    private static void swap(String[] arr, int firstIndex, int secondIndex) {
        String tmp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tmp;
    }
}
