package com.ppj.practice09;

/*
Define a logical variable isFemale.
Then declare a variable of type String and initialize it with the string "Woman" or "Man",
depending on the value of isFemale. Additionally, define a logical variable isYoung.
Then declare a variable of type String and initialize it with the string "Woman", "Man", "Boy" or "Girl"
depending on the values of isFemale and isYoung
 */

class Task0905 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter isFemale:");
        boolean isFemale = scanner.nextBoolean();

        System.out.println("Enter isYoung:");
        boolean isYoung = scanner.nextBoolean();

        String result = "";
        if (isFemale) {
            if (isYoung) {
                result = "Girl";
            } else {
                result = "Woman";
            }
        } else {
            if (isYoung) {
                result = "Boy";
            } else {
                result = "Man";
            }
        }

        System.out.println(result);
    }
}
