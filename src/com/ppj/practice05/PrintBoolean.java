package com.ppj.practice05;

class PrintBoolean {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(a ^ b); // true

        a = false;
        b = true;

        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(a ^ b); // true

        a = true;
        b = true;

        System.out.println(a && b); // true
        System.out.println(a || b); // true
        System.out.println(a ^ b); // false

        a = false;
        b = false;

        System.out.println(a && b); // false
        System.out.println(a || b); // false
        System.out.println(a ^ b); // false
    }
}
