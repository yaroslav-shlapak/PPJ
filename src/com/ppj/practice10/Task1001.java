package com.ppj.practice10;

/*
Invoking Math.random() returns a (pseudo)random number of type double from the half-open interval [0, 1).
Use this generator to draw one card from a standard deck.
First, draw an integer from the interval [1, 4]
(corresponding to suit: clubs, diamonds, hearts, spades)
and then another number from the interval [2, 14]
(deuce, trey, four, five, . . . , ten, Jack, Queen, King, Ace).
Using the switch instruction, define a string describing the card and display it on the console; for example

Jack diamonds

There should be only one System.out.println statement in the program.
 */

class Task1001 {
    public static void main(String[] args) {
        int suitInt = (int) (Math.random() * 4);
        String suit;
        switch (suitInt) {
            case 0: {
                suit = "clubs";
                break;
            }
            case 1: {
                suit = "diamonds";
                break;
            }
            case 2: {
                suit = "hearts";
                break;
            }
            case 3: {
                suit = "spades";
                break;
            }
            default: {
                suit = "not possible";
                break;
            }
        }

        int numberInt = (int) (Math.random() * 13) + 2;
        String number;
        switch (numberInt) {
            case 2: {
                number = "deuce";
                break;
            }
            case 3: {
                number = "trey";
                break;
            }
            case 4: {
                number = "four";
                break;
            }
            case 5: {
                number = "five";
                break;
            }
            case 6: {
                number = "six";
                break;
            }
            case 7: {
                number = "seven";
                break;
            }
            case 8: {
                number = "eight";
                break;
            }
            case 9: {
                number = "nine";
                break;
            }
            case 10: {
                number = "ten";
                break;
            }
            case 11: {
                number = "Jack";
                break;
            }
            case 12: {
                number = "Queen";
                break;
            }
            case 13: {
                number = "King";
                break;
            }
            case 14: {
                number = "Ace";
                break;
            }
            default: {
                number = "not possible";
                break;
            }
        }
        System.out.println(number + " " + suit);
    }
}
