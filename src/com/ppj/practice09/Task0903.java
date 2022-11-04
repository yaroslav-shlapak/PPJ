package com.ppj.practice09;

/*
In the U.S.A., fuel consumption is measured in units called mpg — miles per gallon,
i.e., how many miles you will be able to drive on one gallon of gasoline.
In Europe the same quantity is measured in l/100 km — how many litres you will use to drive 100 km.

One mile = 1.609344 km.
One gallon = 3.785412 l.

Write a program which asks the user for fuel consumption,
as a double, and units used, as a String: eu if this is in European units or usa otherwise.
Then the corresponding fuel consumption in the other units is printed.
If the string entered is not one of eu or usa, the program prints an error message.

For example, a run of the program could look like this:

Enter fuel consumption and units ("eu" or "usa") 6.6 eu
6.6 l/100km = 35.63857526590168 mpg

Use switch statement, or, preferably, expression
 */

class Task0903 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter consumption units (\"eu\" or \"usa\"):");
        String units = scanner.nextLine();

        System.out.println("Enter consumption:");
        Double value = scanner.nextDouble();

        double k = 100 / 1.609344 * 3.785412;

        switch (units) {
            case "eu": {
                System.out.println(String.format("%.2fl/100km = %.2f mpg", value, k / value));
                break;
            }
            case "usa": {
                System.out.println(String.format("%.2f mpg = %.2fl/100km", value, k / value));
            }
            default: {
                System.out.println("Unknown units");
            }
        }
    }
}
