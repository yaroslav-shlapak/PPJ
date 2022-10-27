package com.ppj.practice06;

class Task0607 {
    public static void main(String[] args) {
        int value = 0xFED;
        int divider = 16;

        int v0 = value % divider;
        value = value / divider;
        System.out.println(v0);

        int v1 = value % divider;
        value = value / divider;
        System.out.println(v1);

        int v2 = value % divider;
        value = value / divider;
        System.out.println(v2);

        System.out.println(v0 + v1 + v2);
    }
}
