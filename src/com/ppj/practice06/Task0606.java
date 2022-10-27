package com.ppj.practice06;

class Task0606 {
    public static void main(String[] args) {
        int octal = 07321;
        int divider = 8;

        int o0 = octal % divider;
        octal = octal / divider;
        System.out.println(o0);

        int o1 = octal % divider;
        octal = octal / divider;
        System.out.println(o1);

        int o2 = octal % divider;
        octal = octal / divider;
        System.out.println(o2);

        int o3 = octal % divider;
        octal = octal / divider;
        System.out.println(o3);

        System.out.println(o0 + o1 + o2 + o3);
    }
}
