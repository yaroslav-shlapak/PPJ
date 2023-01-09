package com.ppj.practice20;

/*
Create two classes, Square (with a field corresponding to the length of the side) and
Circle (with the field describing the radius).
Both classes should have one parameter constructors,
methods returning side/radius (getSide/getRadius),
area (getArea) and perimeter (getPerimeter) and should override method toString from class Object.

The class Square should contain methods getInscribedCircle and getCircumscribedCircle returning
objects of class Circle corresponding to circles inscribed in and circumscribed about this square.
Similarily, the class Circle should contain methods getInscribedSquare and getCircumscribedSquare
returning objects of class Square corresponding to squares inscribed in and circumscribed about this circle.
Add constructors to both classes: in class Square a constructor taking an object of class Circle and
constructing a square with the same area as the given circle, and analogous constructor
in class Circle taking an object of class Square.

Class Circle should define static function

public static Square[] getSquares(Circle[] arr)

which takes an array of references to objects of type Circle and creates and
returns an array of objects of type Square, which have the same area as the corresponding circles.
In the main function of another class (e.g., Main) create a few objects of both classes and
test the constructors and methods. For example, the attached program should print

Square[2.0] Square[1.0] Square[3.0] Square[4.0]
Areas: 4.0 1.0 9.0 16.0
Perimeters: 8.0 4.0 12.0 16.0
Areas of squares from circles: 12.57 3.14 28.27 50.27

NOTE: The value of π is available as Math.PI; square root of x can be calculated as Math.sqrt(x).
 */

import java.util.Locale;

class Task2001 {
    public static void main(String[] args) {
        // we want doubles to be printed with a dot
        Locale.setDefault(Locale.US);

        Square[] sqs = {
                new Square(2), new Square(1), new Square(3)
        };

        System.out.print("Squares: ");
        for (Square s : sqs)
            System.out.print(s + " ");
        System.out.print("\nAreas: ");
        for (Square s : sqs)
            System.out.print(s.getArea() + " ");
        System.out.print("\nPerimeters: ");
        for (Square s : sqs)
            System.out.print(s.getPerimeter() + " ");
        System.out.print("\nInscribed circles: ");
        for (Square s : sqs)
            System.out.print(s.getInscribedCircle() + " ");
        System.out.print("\nCircumscribed circles: ");
        for (Square s : sqs)
            System.out.print(s.getCircumscribedCircle() + " ");

        System.out.println("\n\n...and now circles from squares...");
        Circle[] circles = Square.getCircles(sqs);
        System.out.print("Circles: ");
        for (Circle c : circles)
            System.out.print(c + " ");
        System.out.print("\nAreas: ");
        for (Circle c : circles)
            System.out.print(c.getArea() + " ");
        System.out.print("\nInscribed squares: ");
        for (Circle c : circles)
            System.out.print(c.getInscribedSquare() + " ");
        System.out.print("\nCircumscribed squares: ");
        for (Circle c : circles)
            System.out.print(c.getCircumscribedSquare() + " ");

        System.out.println("\n\n...and back to squares...");
        Square[] squares = Circle.getSquares(circles);
        System.out.print("Squares: ");
        for (Square s : squares)
            System.out.print(s + " ");
        System.out.println();
    }

}

class Square {
    private final double length;
    private final double diagonal;

    Square(double length) {
        this.length = length;
        this.diagonal = Math.sqrt(2 * length * length);
    }

    public static Circle[] getCircles(Square[] sqs) {
        return new Circle[0];
    }

    public double getLength() {
        return length;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getArea() {
        return length * length;
    }

    public double getPerimeter() {
        return 0;
    }

    public double getInscribedCircle() {
        return 0;
    }

    public double getCircumscribedCircle() {
        return 0;
    }
}

class Circle {
    public static Square[] getSquares(Circle[] circles) {
        return new Square[0];
    }

    public double getArea() {
        return 0;
    }

    public double getInscribedSquare() {
        return 0;
    }

    public double getCircumscribedSquare() {
        return 0;
    }
}

