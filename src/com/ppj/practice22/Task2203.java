package com.ppj.practice22;

/*
Create three classes:

• CalculatingDevice with a sole constructor taking a name (String).
The class defines also a method public String calculate(double x, double y)
which calculates the sum of its arguments and returns a string (not a number)
with the name of the machine and the result of the addition.
Add a static method public static void printRes(CalculatingDevice[] a, double x, double y)
taking an array of calculataing machines and arguments x and y — the functions prints the results of calculations
with these arguments for each machine from the array.
• Calculator extending CalculatingDevice and overriding the calculate method.
The method gets the result of addition by invoking super.calculate and adds the result of subtraction (as a string).
• Computer extending Calculator and overriding the calculate.
The method gets the result of addition and subtraction by invoking super.calculate and adds, as a string,
the results of multiplication and division.

The attached program should print something like:

Cray: 21.0+7.0=28.0; 21.0-7.0=14.0; 21.0*7.0=147.0; 21.0/7.0=3.0
Abacus: 21.0+7.0=28.0
HP: 21.0+7.0=28.0; 21.0-7.0=14.0
 */

import java.util.Arrays;

class Task2203 {
    public static void main(String[] args) {
        CalculatingDevice[] arr = {
                new Computer("Cray"),
                new CalculatingDevice("Abacus"),
                new Calculator("HP")
        };
        CalculatingDevice.printRes(arr, 21, 7);
    }

}

class CalculatingDevice {
    private final String name;
    CalculatingDevice(String name) {
        this.name = name;
    }
    public static void printRes(CalculatingDevice[] arr, int i, int i1) {
        for (CalculatingDevice item : arr) {
            System.out.println(item.name + ": " + item.calculate(i, i1));
        }
    }
    public String calculate(double x, double y) {
        return String.format("%.1f + %.1f = %.1f", x, y, x + y);
    }
}

class Computer extends Calculator {

    Computer(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        return String.format("%s, %.1f * %.1f = %.1f, %.1f / %.1f = %.1f", super.calculate(x, y), x, y, x * y, x, y, x / y);
    }
}
class Calculator extends CalculatingDevice {

    Calculator(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        return String.format("%s, %.1f - %.1f = %.1f", super.calculate(x, y), x, y, x - y);
    }

}