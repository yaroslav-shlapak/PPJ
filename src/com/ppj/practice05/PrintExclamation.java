package com.ppj.practice05;

class PrintExclamation {
    public static void main(String[] args) {
        System.out.println('!' + 0); // prints ! as decimal, 33
        System.out.println('!' + '!'); // two chars are converted to decimal and then their sum, 66
        System.out.println((char)('!' + '!')); // char is 1
    }
}
