package com.ppj.practice10;

/*
Write a program which reads integers from the user until he/she enters 0
(which merely signals end of input is not taken in further considerations).
Then the program prints the information whether in this series of numbers there were two consecutive equal ones.
 */

class Task1005 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int previous = 0;
        int input = scanner.nextInt();
        previous = input;
        boolean hasConsecutiveEquals = false;
        do  {
            input = scanner.nextInt();
            if (previous == input) {
                hasConsecutiveEquals = true;
            }
        } while (input != 0);
        System.out.println("hasConsecutiveEquals: " + hasConsecutiveEquals);
    }
}
