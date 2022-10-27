package com.ppj.practice07;

import java.util.Scanner;

class Task0704 {
    /*
    Write a program reading (using a Scanner) three values of type boolean
    and storing them in three variables (e.g., a, b and c).
    Then define five additional logical variables
    and set their values according to the following interpretation
    (abbreviation iff stands for if, and only if ):
    allThree: true iff all three values are true;
    exactlyOne: true iff exactly one of them is true;
    exactlyTwo: true iff exactly two are true;
    atLeastOne: true iff at least one of them is true;
    atLeastTwo: true iff at least two of them are true;
    NOTE: entering a logical value from the keyboard, type the word true or false

    Attached program should, for some combinations of input values, print:

    a, b, c = false, true, false 
    allThree: false 
    exactlyOne: true 
    exactlyTwo: false 
    atLeastOne: true
    atLeastTwo: false 
    a, b, c = true, true, false 
    allThree: false 
    exactlyOne: false
    exactlyTwo: true
    atLeastOne: true
    atLeastTwo: true 
    a, b, c = true, true, true
    allThree: true
    exactlyOne: false 
    exactlyTwo: false
    atLeastOne: true
    atLeastTwo: true
    */
    public static void main(String[] args) {
        test();
        Scanner sca = new Scanner(System.in);
        System.out.print(
                "Enter three boolean " +
                        "values (true or false) "
        );
        boolean a = sca.nextBoolean();
        boolean b = sca.nextBoolean();
        boolean c = sca.nextBoolean();
        sca.close();

        calulateAndPrint(a, b, c);
    }

    private static void calulateAndPrint(boolean a, boolean b, boolean c) {
        boolean allThree = a & b & c;
        boolean exactlyOne = a ^ b ^ c;
        boolean exactlyTwo = (a && b) ^ (b && c) ^ (a && c);
        boolean atLeastOne = a || b || c;
        boolean atLeastTwo = (a && b) || (b && c) || (a && c);

        System.out.println(
                "a, b, c = " + a + ", " + b +
                        ", " + c + "\nallThree: " + allThree +
                        "\nexactlyOne: " + exactlyOne +
                        "\nexactlyTwo: " + exactlyTwo +
                        "\natLeastOne: " + atLeastOne +
                        "\natLeastTwo: " + atLeastTwo
        );
    }

    private static void test() {
        calulateAndPrint(false, true, false);
        calulateAndPrint(true, true, false);
        calulateAndPrint(true, true, true);
    }
}
