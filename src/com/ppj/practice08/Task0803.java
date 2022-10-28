package com.ppj.practice08;

class Task0803 {
    /*
    In places marked with multiline quotes, insert conditional expressions
    (using the ternary operator) such that strings s1 and s2 contain symbols of appropriate relational operators
    (as stated in the comments) and the program Cond.java prints, for example,

    Enter a -> 4
    Enter b -> 7

            4 != 7
            4 < 7

    or

    Enter a -> 2
    Enter b -> 2

            2 = 2
            2 = 2

    or

    Enter a -> 9
    Enter b -> 2

            9 != 2
            9 > 2
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input a number");
        System.out.print("Enter a -> ");
        int a = scanner.nextInt();
        System.out.print("Enter b -> ");
        int b = scanner.nextInt();
        scanner.close();

        // s1 should be " = " or " != "
        String s1 = a == b ? " = " : " != ";

        // s2 should be " = " or " < " or " > "
        String s2 = a == b ? " = " : a > b ? " > " : " < ";

        System.out.println(a + s1 + b);
        System.out.println(a + s2 + b);
    }

}



