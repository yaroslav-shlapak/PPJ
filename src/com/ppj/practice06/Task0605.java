package com.ppj.practice06;

class Task0605 {
    public static void main(String[] args) {
        int binary = 0b10010;
        int divider = 2;

        int b0 = binary % divider;
        binary = binary / divider;
        System.out.println(b0);

        int b1 = binary % divider;
        binary = binary / divider;
        System.out.println(b1);

        int b2 = binary % divider;
        binary = binary / divider;
        System.out.println(b2);

        int b3 = binary % divider;
        binary = binary / divider;
        System.out.println(b3);

        int b4 = binary % divider;
        binary = binary / divider;
        System.out.println(b4);

        System.out.println(b0 + b1 + b2 + b3 + b4);
    }
}
