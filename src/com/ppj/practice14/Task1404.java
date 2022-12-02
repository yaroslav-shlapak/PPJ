package com.ppj.practice14;

/*
Define a two-dimensional array of Strings with names of countries and their capitals, for example as below \

String[][] arr = {
  {"Kenya", "Nairobi"}, {"Rwanda", "Kigali"},
  {"Gambia", "Banjul"}, {"Ghana", "Accra"},
  {"Niger", "Niamey"}, {"Zambia", "Lusaka"}
};

and then write a program which reads the name of a country and prints the name of its capital
(don’t forget that Strings should be compared using equals or equalsIgnoreCase, not == operator!).
The program should display an appropriate message if the country name entered cannot be found.
 */

import java.util.Arrays;

class Task1404 {
    public static void main(String[] args) {
        String[][] arr = {
                {"Kenya", "Nairobi"},
                {"Rwanda", "Kigali"},
                {"Gambia", "Banjul"},
                {"Ghana", "Accra"},
                {"Niger", "Niamey"},
                {"Zambia", "Lusaka"}
        };

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = "";
        while (!(s = scanner.next()).equals("exit")) {
            String capital = "";
            for (String[] row : arr) {
                if (row[0].equals(s)) {
                    capital = row[1];
                    break;
                }
            }
            if (capital.isEmpty()) {
                System.out.println("Capital for " + s + " is not found");
            } else {
                System.out.println("Capital for " + s + " is " + capital);
            }
        }
    }

    private static void swapMinMax(int[] arr) {
        if (arr.length == 0) return;
        int max = arr[0];
        int min = arr[0];
        int indexOfMin = 0;
        int indexOfMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexOfMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                indexOfMin = i;
            }
        }
        swap(arr, indexOfMin, indexOfMax);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
