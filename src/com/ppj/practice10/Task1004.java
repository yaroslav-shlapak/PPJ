package com.ppj.practice10;

/*
Write a program which reads positive integers from the user until he/she enters 0
(which merely signals end of input is not taken in further considerations).
Then the program prints the number of read integers which when divided by 7 give the remainder 3 or 4.
 */


class Task1004 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int count = 0;
        int input;
        do  {
            input = scanner.nextInt();
            int div = input % 7;
            if (div == 3 || div == 4) {
                count++;
            }
        } while (input != 0);
        System.out.println("The number of read integers which when divided by 7 give the remainder 3 or 4 is " + count);
    }
}
