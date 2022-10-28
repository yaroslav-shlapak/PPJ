package com.ppj.practice08;

import static com.ppj.practice08.Task0804.Direction.*;

class Task0804 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char input = 'a';

        Direction currentDirection = NORTH;

        while (isA(input) || isD(input)) {
            System.out.print("Make your turn: ");
            input = scanner.next().charAt(0);
            currentDirection = processDirection(currentDirection, input);
            System.out.println("Your current direction is: " + currentDirection);
        }

        scanner.close();
    }

    private static Direction processDirection(Direction currentDirection, char input) {
        Direction direction = currentDirection;
        if (isD(input)) {
            switch (currentDirection) {
                case NORTH:  {
                    direction = EAST;
                    break;
                }
                case EAST:  {
                    direction = SOUTH;
                    break;
                }
                case SOUTH:  {
                    direction = WEST;
                    break;
                }
                case WEST:  {
                    direction = NORTH;
                    break;
                }
            }
        } else if (isA(input)) {
            switch (currentDirection) {
                case NORTH: {
                    direction = WEST;
                    break;
                }
                case EAST: {
                    direction = NORTH;
                    break;
                }
                case SOUTH: {
                    direction = EAST;
                    break;
                }
                case WEST: {
                    direction = SOUTH;
                    break;
                }
            }
        }
        return direction;
    }

    private static boolean isA(char input) {
        return input == 'a';
    }

    private static boolean isD(char input) {
        return input == 'd';
    }

    enum Direction {
        NORTH, SOUTH, WEST, EAST
    }
}



