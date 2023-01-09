package com.ppj.practice20;

/*
Create two classes – Person and Car. Class Person has two fields: name (String) and car (Car).
Not all persons have cars — for those who haven’t, the field car will be null.
The Car class has fields make (String) and price (int).
In both classes, all fields are private, so appropriate getters will probably be needed.
Both classes override method toString (or, if you don’t know what’s that,
define a method info which just prints information on the object it’s been invoked on).

Write three static member functions in class Person:
• getCars which takes an array of references to persons,
  creates and returns a, perhaps empty, array of (references to) cars owned by these persons.
  Remember that not all persons own cars. The array returned cannot contain nulls;
• expensiveCars which takes an array of (references to) persons and a minimum price (int),
  creates and returns an array of (references to) cars owned by the persons,
  but only those cars with prices not less than the given minimum.
  The function returns an empty array if there is no car which meets the criterion.
  The array returned cannot contain nulls.
• getPrice which takes an array of (references to) persons and a name (String),
  and returns the price of the car of a person with this name,
  or -2 if there was no person with this name, or -1 if person with this name doesn’t have a car.

In function main (in a separate class), create an array of persons and test both functions.

For example. the attached program should print something like:
Ford(15000) Dodge(11100) Buick(11000) Opel(18000) Buick(12500) Ford(15000) Opel(18000) Buick(12500)
Price of Adam's car: 18000
 */

class Task2004 {
    public static void main(String[] args) {
        Car c1 = new Car("Ford", 15000);
        Car c2 = new Car("Dodge", 11100);
        Car c3 = new Car("Buick", 11000);
        Person john = new Person("John", c1);
        Person mary = new Person("Mary", c2);
        Person kate = new Person("Kate");
        Person lucy = new Person("Lucy", c3);
        Person adam = new Person("Adam",
                new Car("Opel", 18000));
        Person[] persons = {
                john, mary, kate, lucy, adam, new Person("Jill"),
                new Person("Josh", new Car("Buick",12500))};

        Car[] cars = Person.getCars(persons);
        for (Car c : cars)
            System.out.print(c + " "); // or c.info();
        System.out.println();

        cars = Person.expensiveCars(persons, 12000);
        for (Car c : cars)
            System.out.print(c + " "); // or c.info();
        System.out.println();
        String name = "Adam";
        System.out.println("Price of " + name + "'s car: " +
                Person.getPrice(persons, name));
    }

}

class Car {
    private String name;
    private int price;
    Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

}

class Person {
    private String name;
    private Car car;
    Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    Person(String name) {
        this.name = name;
        this.car = null;
    }

    public static Car[] getCars(Person[] persons) {
        return new Car[0];
    }

    public static Car[] expensiveCars(Person[] persons, int i) {
        return new Car[0];
    }

    public static String getPrice(Person[] persons, String name) {
        return null;
    }
}
