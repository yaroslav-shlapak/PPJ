package com.ppj.practice24;

/*
Create two custom exception classes
NotEnoughGas — checked;
Explosion — unchecked.

Then create a class Car with
fields of type int corresponding to the amount of fuel in the tank and the number of kilometers travelled.
  fields are initialized with the values 35 and 0, respectively;
method public void fill(), which
• with probability 10%, throws an exception of type Explosion (which we do not handle);
• if there was no explosion, fills the tank with additional random number of litres of gasoline
(from the range [15, 35]) and prints information on the current fuel level.
method public void drive100km() throws NotEnoughGas which
• throws an exception of type NotEnoughGas, if the fuel level is below 10 litres;
• if there is enough fuel, consumes 10 litres of gasoline and increments the number of kilometers travelled by 100 km;
• prints information on the total number of kilometers travelled and the current fuel level.
Note: Messages about exceptions printed by the JVM go to the error stream. To see all messages issued
by both the JVM and our program in the correct order, the program should print not to the standard output
but rather to the error stream; therefore, use System.err.println instead of System.out.println.

For example, the attached program should print something like:
100km driven, 25 liters left
200km driven, 15 liters left
300km driven, 5 liters left
Only 5 liters. Must fill the tank
After filling 35
400km driven, 25 liters left
500km driven, 15 liters left
600km driven, 5 liters left
Only 5 liters. Must fill the tank
After filling 23
700km driven, 13 liters left
800km driven, 3 liters left
Only 3 liters. Must fill the tank
After filling 20
900km driven, 10 liters left
1000km driven, 0 liters left
Only 0 liters. Must fill the tank
After filling 29
1100km driven, 19 liters left
1200km driven, 9 liters left
Only 9 liters. Must fill the tank
After filling 34
1300km driven, 24 liters left
1400km driven, 14 liters left
 1500km driven, 4 liters left
 Only 4 liters. Must fill the tank
After filling 19
1600km driven, 9 liters left
Only 9 liters. Must fill the tank
Exception in thread "main" Explosion: BOOOOOOM
at Car.fill(Excepts.java:21)
at Excepts.main(Excepts.java:10)
 */


import java.io.FileNotFoundException;

class Task2401 {
    public static void main (String[] args) {
        Car car = new Car();
        while (true) {
            try {
                car.drive100km();
            } catch(NotEnoughGas e) {
                System.err.println(e.getMessage());
                car.fill();
            }
        }
    }
}

class NotEnoughGas extends Exception {
    NotEnoughGas(String msg) {
        super(msg);
    }
}

class Explosion extends RuntimeException {

    Explosion(String msg) {
        super(msg);
    }
}

class Car {
    private int fuelCapacity;
    private int distance;

    Car() {
        fuelCapacity = 35;
        distance = 0;
    }

    public void drive100km() throws NotEnoughGas {
        if (fuelCapacity <= 10) {
            throw new NotEnoughGas("Only " + fuelCapacity + " liters. Must fill the tank");
        } else {
            fuelCapacity -= 10;
            distance += 100;
            System.err.printf("%dkm driven, %d liters left", distance, fuelCapacity);
            System.err.println();
        }
    }

    public void fill() throws Explosion {
        int rand = (int) (20 * Math.random()) + 15;
        if (rand == 20 || rand == 30) {
            throw new Explosion("BOOOOOOM!");
        } else {
            fuelCapacity += rand;
            System.err.printf("After filling %d", rand);
            System.err.println();
        }
    }
}

