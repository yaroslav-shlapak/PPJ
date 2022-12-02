package com.ppj.practice15;

/*
Define a two-dimensional array of Strings representing the results of matches in a tournament, for example as below

        String[][] arr = {
              {"Germany",  "2", "Scotland", "1"},
              {"Poland",   "2", "Germany",  "0"},
              {"Germany",  "1", "Ireland",  "1"},
              {"Poland",   "2", "Scotland", "2"},
              {"Scotland", "1", "Ireland",  "0"},
              {"Ireland",  "1", "Poland",   "1"},
              {"Ireland",  "1", "Scotland", "1"},
              {"Germany",  "3", "Poland",   "1"},
              {"Scotland", "2", "Germany",  "3"},
              {"Ireland",  "1", "Germany",  "0"},
              {"Scotland", "2", "Poland",   "2"},
              {"Poland",   "2", "Ireland",  "1"}
       };

and a four-element array of ints representing scores of teams of Germany, Ireland, Poland and Scotland (in this order).
The program calculates total score for each team (3 points for a win, 1 for a draw, 0 for a defeat),
puts them into the array and then prints it. It will be very helpful to define a small function which,
given the name of a country, returns its index in the array of total scores (switch expression would be appropriate here).
If a string str represents a number, like "435", you can get this number as an int using:

int n = Integer.parseInt(str);

For data as above you should get scores [10, 6, 9, 6].
 */

import java.util.Arrays;

class Task1501 {
    public static void main(String[] args) {
        String[][] arr = {
                {"Germany",  "2", "Scotland", "1"},
                {"Poland",   "2", "Germany",  "0"},
                {"Germany",  "1", "Ireland",  "1"},
                {"Poland",   "2", "Scotland", "2"},
                {"Scotland", "1", "Ireland",  "0"},
                {"Ireland",  "1", "Poland",   "1"},
                {"Ireland",  "1", "Scotland", "1"},
                {"Germany",  "3", "Poland",   "1"},
                {"Scotland", "2", "Germany",  "3"},
                {"Ireland",  "1", "Germany",  "0"},
                {"Scotland", "2", "Poland",   "2"},
                {"Poland",   "2", "Ireland",  "1"}
        };

        int[] scores = {0, 0, 0, 0};

        for (String[] row : arr) {
            String country0 = row[0];
            String country1 = row[2];
            int res0 = Integer.parseInt(row[1]);
            int res1 = Integer.parseInt(row[3]);

            if (res0 == res1) {
                addScoreForCountry(country0, 1, scores);
                addScoreForCountry(country1, 1, scores);
            } else if (res0 > res1) {
                addScoreForCountry(country0, 3, scores);
                addScoreForCountry(country1, 0, scores);
            } else {
                addScoreForCountry(country0, 0, scores);
                addScoreForCountry(country1, 3, scores);
            }
        }

        System.out.println(Arrays.toString(scores));

        String[] countries = { "Germany", "Ireland", "Poland", "Scotland" };
        for (String country : countries) {
            printScoreForCountry(country, scores);
        }
    }

    private static int printScoreForCountry(String countryName, int[] scores) {
        int score = 0;
        switch (countryName) {
            case "Germany": {
                score = scores[0];
                break;
            }
            case "Ireland": {
                score = scores[1];
                break;
            }
            case "Poland": {
                score = scores[2];
                break;
            }
            case "Scotland": {
                score = scores[3];
                break;
            }
        }
        System.out.println("score for " + countryName + " is " + score);
        return score;
    }

    private static void addScoreForCountry(String countryName, int score, int[] scores) {
        switch (countryName) {
            case "Germany": {
                scores[0] += score;
                break;
            }
            case "Ireland": {
                scores[1] += score;
                break;
            }
            case "Poland": {
                scores[2] += score;
                break;
            }
            case "Scotland": {
                scores[3] += score;
                break;
            }
        }
    }


}
