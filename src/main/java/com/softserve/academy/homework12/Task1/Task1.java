package com.softserve.academy.homework12.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {
            System.out.printf("Enter word  %d: ", i + 1);
            strings[i] = console.nextLine();
        }

        printArray(strings);
        longestWord(strings);

        System.out.println(reverseString(strings[1]));

    }

    public static String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static void longestWord(String[] array){
        String longestWord = "";
        for (String s : array) {
            if (s.length() > longestWord.length()) {
                longestWord = s;
            }
        }
        System.out.println("Longest word is " + longestWord);
        System.out.println("Length of longest word is " + longestWord.length());
    }
    public static void printArray(String[] array){
     for (String s : array) {
         System.out.println(s);
     }
    }
}
