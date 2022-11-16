package com.ppj.practice11;

/*
Random variables a, b, c, have uniform distribution on the interval [0, 1) and are independent.
Estimate, using sufficient number of random trials (e.g., 10 000 000),
the probability that the equation ax2 + bx + c = 0 has a real solution.
Compare the result with the value (5 + 3 ln 4)/36 ≈ 0.25441342.
 */


class Task1105 {
    public static void main(String[] args) {
        int counter = 0;
        long n = 10_000_000L;
        for (long i = 0; i < n; i++) {
            double a = Math.random();
            double b = Math.random();
            double c = Math.random();
            double d = b * b - 4 * a * c;
            if (d >= 0 && a != 0) {
                counter++;
            }
        }

        double probability = ((double) counter) / n;
        System.out.println("number of real results: " + counter + ", probability: " + probability +
                " is " + (probability > 0.25441342 ? "greater or equal" : "less") + " than (5 + 3 ln 4)/36");
    }
}
