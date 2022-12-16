package com.ppj.practice19;

/*
Create class Square with one private field of type double representing the length of the side.
Add the constructor and “getters” returning the side, length of the diagonal,
perimeter and surface area of the square represented by an object of the class.
Do not define “setters” — object of this class should be immutable.

Also, define a static function taking references to two squares and returning the reference to a square,
created in the function, with the surface area equal to the sum of the areas of the two squares passed to it.

Test your class in the main function of a separate class.
In order to ensure immutability of objects of our class,
its sole field should be declared not as a double, but rather as a final double.
Then, after construction, it will be impossible to modify it even by methods of the class.
 */

class Task1901 {
    public static void main(String[] args) {
        System.out.println(transformToSingleSquare(new Square(4), new Square(4)).getLength());
    }

    private static Square transformToSingleSquare(Square sq1, Square sq2) {
        double area = sq1.getArea() + sq2.getArea();
        return new Square(Math.sqrt(area));
    }
}

class Square {
    private final double length;
    private final double diagonal;

    Square(double length) {
        this.length = length;
        this.diagonal = Math.sqrt(2 * length * length);
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
}
