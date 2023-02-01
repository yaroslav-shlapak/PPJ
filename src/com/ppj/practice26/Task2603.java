package com.ppj.practice26;

/*
Complete the program below so it prints all words from the input file that start and end with the same letter,
ignoring their case (for example, the word Angola should be printed):

For example, if the input file contains

Angola, Bahama, Zanzibar, baobab,
égalité, ćwierć, pół, Kraśnik

the result should be

Angola
baobab
égalité
ćwierć
Kraśnik
 */


import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Task2603 {
    public static void main(String[] args) {
        String text = "Angola, Bahama, Zanzibar, baobab,\n" +
                "égalité, ćwierć, pół, Kraśnik";
        String reg = "\\b(\\w)\\w*?\\1(,|$)";
        Matcher m = Pattern.compile(reg,
                Pattern.CASE_INSENSITIVE |
                        Pattern.UNICODE_CHARACTER_CLASS |
                        Pattern.MULTILINE |
                        Pattern.DOTALL
        ).matcher(text);
        while (m.find()) {
            System.out.println(m.group().replace(",", ""));

        }
    }
}


