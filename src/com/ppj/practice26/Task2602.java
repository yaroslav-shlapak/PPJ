package com.ppj.practice26;

/*
Write a program analysing a string and looking for enclosed in round parentheses pairs of words separated
by a comma (perhaps with some spaces before and/or after it).
The program prints (in separate lines) for each such pair found both words — first the second one and then,
after any separator, the first.

For example, the attached program should print:
Portugal -> Lisbon
Poland -> Warsaw
Italy -> Rome
 */


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Task2602 {
    public static void main(String[] args) {
        String str = "Lisboa (Lisbon , Portugal), " +
                "Warszawa (Warsaw,  Poland), and " +
                "Roma (Rome,Italy)";
        String pat = "\\((\\S+) ?, *(\\S+)\\)";

        Matcher m = Pattern.compile(pat).matcher(str);
        while (m.find()) {
            System.out.print(m.group(2));
            System.out.print(" -> ");
            System.out.println(m.group(1));
        }
    }
}


