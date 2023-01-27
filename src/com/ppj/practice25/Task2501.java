package com.ppj.practice25;

/*
Write a program which reads a binary file (e.g., an executable .exe file, Java .class file or a .pdf file)
and finds words in this file. By word we mean any sequence of at least N bytes corresponding to ASCII (Latin) letters;
N is by default 4, but may be different. The program writes the words found to a text file, each word in a separate line.

For example, taking the .class file of the program described above as the input, one can get around 150 lines starting with
init
Code
LineNumberTable
main
Ljava
lang
String
StackMapTable
closeResource
Ljava
lang
Throwable

Of course, different version of even the same program will give different results.
 */


import java.io.*;

class Task2501 {
    public static void main(String[] args) {
        String inputFile = "/Users/yaroslavshlapak/IdeaProjects/PPJ/src/com/ppj/practice25/Task2501.java";

        File file = new File(inputFile);
        try (
                FileInputStream stream = new FileInputStream(file);
        ) {

            int letter;
            StringBuilder str = new StringBuilder();
            while ( (letter = stream.read()) != -1) {
                if (letter >= 'A' && letter <= 'Z' || letter >= 'a' && letter <= 'z') {
                    str.append((char) letter);
                } else {
                    if (str.length() >= 4) {
                        System.out.println(str);
                    }
                    str.delete(0, str.length());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


