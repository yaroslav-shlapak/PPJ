package com.ppj.practice05;

class PrintA {
    public static void main(String[] args) {
        System.out.println('A' + 0); // converted to decimal
        System.out.println(0 + 'A'); // converted to decimal
        System.out.println('A' + 'A'); // converted to decimal
        System.out.println('A'); // not converted to decimal, char is printed
    }
}
