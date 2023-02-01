package com.ppj.practice26;

/*
Define an array of regular expressions and then read from the console (or from a file) lines of text.
For each line, print information which regexes it matches and which it does not.
After reading a line beginning with ’q’ (or encountering the end of file),
the program prints how many lines matched each of the regex.

The String::matches method should be sufficient here.

For example for regexes
"\\p{L}+\\p{P}" — a sequence of letter ending with a punctuation mark
"\\D+" — a sequence of non-digits

the result could look like this:

Wciórności
"\p{L}+\p{P}" -> false "\D+" -> true

Hello, World!
"\p{L}+\p{P}" -> false "\D+" -> true

Hello! "\p{L}+\p{P}" -> true "\D+" -> true

Pal 6!
"\p{L}+\p{P}" -> false "\D+" -> false

q

Counters:
0 -> 1
1 -> 3

The regexes in the array could describe, for example:

• three at least three-letter words in any language separated by sequences of white characters;
• an integer number from the interval [7, 88];
• a date in the yyyy-mm-dd format, where month and day may be one-digit numbers;
• an e-mail address;
• e.t.c.
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

class Task2601 {
    public static void main(String[] args) {
        List<Pattern> regexes = new ArrayList<>();
        regexes.add(Pattern.compile("\\S+\\s\\S+\\s\\S+"));
        regexes.add(Pattern.compile("[7-9]|[1-7][0-9]|8[0-8]"));
        regexes.add(Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$"));
        regexes.add(Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE));

        List<String> input = new ArrayList<>();
        input.add("Wciórności");
        input.add("Wci órno ści");
        input.add("Hello, World!");
        input.add("Pal 6!");
        input.add("asd fgh klj");
        input.add("7");
        input.add("88");
        input.add("50");
        input.add("59");
        input.add("2022-01-31");
        input.add("yaroslav@gmail.com");

        for (String line : input) {
            int counter = 0;
            for (Pattern regex : regexes) {
                boolean matches = regex.matcher(line).find();
                System.out.println("Line: " + line + ", regex: " + regex + ", matches: " + matches);
                if (matches) counter++;
            }
            System.out.println("Line: [" + line + "] has " + counter + " matches");
        }
    }
}


