package com.ppj.practice19;

/*
Temperature is measured mainly in three units: in degrees Celsius, degrees Fahrenheit and in kelvins.
It’s easy to convert any of them to the two others:
Kelvin to Celsius: C = K - 273.15
Celsius to Kelvin: K = C + 273.15
Kelvin to Fahrenheit: F = 9./5*(K - 273.15) + 32
Fahrenheit to Kelvin: K = 5./9*(F - 32) + 273.15
Celsius to Fahrenheit: F = 9./5*C + 32
Fahrenheit to Celsius: C = 5./9*(F - 32)

Write class Temperature with one (and only one!) private field of type double;
objects of the class describe temperature. The class has one constructor and three methods:
• Temperature(double tm, char unit) — constructor taking temperature (as a double)
  and symbol of the unit used: ’C’ for Celsius, ’F’ for Fahrenheit and ’K’ for kelvins;
• three methods („getters”) returning the temperature represented by an object, but in different units:
public double getInC()
public double getInF()
public double getInK()

For example, the attached program should print

C: 25,00
F: 77,00
K: 298,15
C: 25,00
F: 77,00
K: 298,15
C: 25,00
F: 77,00
K: 298,15

 */

class Task1902 {
    public static void main(String[] args) {
        Temperature t1 = new Temperature(25, 'C');
        System.out.printf("C: %6.2f%n", t1.getInC());
        System.out.printf("F: %6.2f%n", t1.getInF());
        System.out.printf("K: %6.2f%n", t1.getInK());
        Temperature t2 = new Temperature(77, 'F');
        System.out.printf("C: %6.2f%n", t2.getInC());
        System.out.printf("F: %6.2f%n", t2.getInF());
        System.out.printf("K: %6.2f%n", t2.getInK());
        Temperature t3 = new Temperature(298.15, 'K');
        System.out.printf("C: %6.2f%n", t3.getInC());
        System.out.printf("F: %6.2f%n", t3.getInF());
        System.out.printf("K: %6.2f%n", t3.getInK());
    }
}

class Temperature {
    private final double valueK;

    Temperature(double value, char unit) {
        switch (unit) {
            case 'C': {
                valueK = value + 273.15;
                break;
            }
            case 'F': {
                valueK = 5. / 9 * (value - 32) + 273.15;
                break;
            }
            case 'K': {
                valueK = value;
                break;
            }
            default: {
                valueK = -1;
            }
        }
    }

    public double getInC() {
        return valueK - 273.15;
    }

    public double getInF() {
        return 9. / 5 * (valueK - 273.15) + 32;
    }

    public double getInK() {
        return valueK;
    }
}

