package com.ppj.practice21;

/*
A producer of cereal inserts a coupon into every box; with equal probability, of one out of N kinds.
Customers can win a prize after collecting at least one of every kind.
We assume that collectors do not cooperate (by exchanging their coupons).
Write a function boxesBought which simulates, using a pseudo-random number generator,
the process of buying boxes of cereal until at least one coupon of every kind is collected.
The function takes the number of kinds of coupons and returns the number of boxes bought.
Run many (e.g., 100000) such simulations and calculate the average number of boxes bought (for various values of N).
Compare the average obtained with the theoretically expected value which is, as can be calculated, NHN ,
where HN is the n-th harmonic number

(write an auxiliary function harmo calculating harmonic numbers.)
The attached program should print (of course, the numbers obtained from simulation can be a little different)

For N = 5

***** N = 5
Average : 11.37195
Expected: 11.416666666666666

For N = 30
***** N = 30
Average : 119.86697
Expected: 119.84961392761174

For N = 90
***** N = 90
Average : 457.93183
Expected: 457.4313542563665

The task could be accomplished more effectively by using streams and collections,
but plain loops and arrays can also be sufficient.
 */

class Task2102 {
    public static void main(String[] args) {

    }

}
