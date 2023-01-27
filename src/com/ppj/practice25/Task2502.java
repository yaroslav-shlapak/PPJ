package com.ppj.practice25;

/*

Create a class Person with fields name of type String, birthYear of type int and car of type Car.
Class Car should contain fields make of type String and color of type java.awt.Color.
Program – in a separate class Main – reads a data file using a Scanner or a BufferedReader. Data file contains
• One line with a positive integral number (let’s call it N);
• N lines with information about N Persons.

The lines corresponding to persons look like this

John 1980 Mercedes 255 255 102
Mary 1997
Alice 1993 Skoda 0 127 153

Each line contains either only the name and birth year of a person, or the name and the birth year of a person,
the make of his/her car and its color in the form of three integers from the range [0, 255]
corresponding to three components – red, green and blue. Object of class Color (from package java.awt)
can be then created with the constructor taking three integers, e.g.,

Color c = new Color(r,g,b);

For each line an object of type Person is created
(with field car equal to null if there was no data about this person’s car) and inserted into the array of persons.
In class Person, create a static function

public static Car[] findAllCars(Person[] persons)

which takes an array of persons and returns an array (perhaps empty) of all cars owned by them.
The array returned must not contain null elements.
Write also a static function

public static Person[] findOwners(Person[] persons, String make)

taking an array of persons and returning an array (perhaps empty) of those persons who own a car of make make.
The array returned must not contain null elements.
Create a function

public static Color findColor(Person[] person, String name, int year)

which returns the color of the car belonging to a person with the name name and the birth year year,
or null if such a person has not been found or doesn’t possess any car.

Write a main function which tests all created functions.
 */


import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Task2502 {
    public static void main(String[] args) {
        String filePath = "/Users/yaroslavshlapak/IdeaProjects/PPJ/src/com/ppj/practice25/input.txt";

        File file = new File(filePath);
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))
        ) {

            String line;
            StringBuilder str = new StringBuilder();
//            John 1980 Mercedes 255 255 102
//            Mary 1997
//            Alice 1993 Skoda 0 127 153
            List<Person> persons = new ArrayList<Person>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                Person person;
                switch (words.length) {
                    case 2: {
                        person = new Person(words[0], Integer.parseInt(words[1]));
                        persons.add(person);
                        break;
                    }
                    case 6: {
                        person = new Person(
                                words[0],
                                Integer.parseInt(words[1]),
                                new Car(
                                        words[2],
                                        new Color(
                                                Integer.parseInt(words[3]),
                                                Integer.parseInt(words[4]),
                                                Integer.parseInt(words[5])
                                        )
                                )
                        );
                        persons.add(person);
                    }
                    default: {

                        break;
                    }
                }
            }

            System.out.println(findColor(persons, "John", 1980));
            System.out.println(findOwners(persons, "Skoda"));
            System.out.println(findAllCars(persons));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Car> findAllCars(List<Person> persons) {
        List<Car> cars = new ArrayList<>();
        for (Person person : persons) {
            Car car = person.car;
            if (car != null) {
                cars.add(person.car);
            }
        }
        return cars;
    }

    public static List<Person> findOwners(List<Person> persons, String make) {
        List<Person> carOwners = new ArrayList<>();
        for (Person person : persons) {
            Car car = person.car;
            if (car != null && car.type.equals(make)) {
                carOwners.add(person);
            }
        }
        return carOwners;
    }

    public static Color findColor(List<Person> persons, String name, int year) {
        for (Person person : persons) {
            Car car = person.car;
            if (car != null && person.birthYear == year && person.name.equals(name)) {
                return person.car.color;
            }
        }
        return null;
    }

}

class Person {
    final String name;
    final int birthYear;
    final Car car;

    Person(String name, int birthYear, Car car) {
        this.name = name;
        this.birthYear = birthYear;
        this.car = car;
    }

    Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.car = null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", car=" + car +
                '}';
    }
}

class Car {
    final String type;
    final Color color;

    Car(String type, Color color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color=" + color +
                '}';
    }
}


