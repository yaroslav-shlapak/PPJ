package com.ppj.practice09;

/*
Write a program reading one real number (say, d) and the name of a geometrical figure
• "disc" – d is then interpreted as the radius of a disc;
• "triangle" – d is then interpreted as the side of a equilateral triangle;
• "square" – d is then interpreted as the side of a square;
• "rand" – the kind of figure is one of the above with equal probability (use Math.random(),
which gives a number of type double in range [0, 1)) and d is interpreted as above.

Use the switch expression to initialize a variable area the value of which is the area of the figure.
 */

class Task0904 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter name of figure:");
        String figureName = scanner.nextLine();

        System.out.println("Enter d:");
        Double d = scanner.nextDouble();

        if (figureName.equals("rand")) {
            int rand = (int) (Math.random() * 3);
            switch (rand) {
                case 0: {
                    figureName = "disc";
                    break;
                }
                case 1: {
                    figureName = "triangle";
                    break;
                }
                case 2: {
                    figureName = "square";
                    break;
                }
                default: {
                    figureName = "rand";
                    break;
                }
            }
        }

        double result = 0;
        switch (figureName) {
            case "disc": {
                result = Math.PI * Math.pow(d, 2);
                break;
            }
            case "triangle": {
                result = Math.pow(3, 0.5) / 4 * Math.pow(d, 2);
                break;
            }
            case "square": {
                result = Math.pow(d, 2);
                break;
            }
            default: {
                result = 0;
                break;
            }
        }

        if (result != 0) {
            System.out.println(String.format("Area of %s is %.3f", figureName, result));
        } else {
            System.out.println(String.format("Figure is unknown: %s", figureName));
        }
    }
}
