package com.softserve.academy.edu1.String_Regular_expressions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().trim();
        String[] words = sentence.split("\\s+");

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());

        StringBuilder reversedSecond = new StringBuilder(words[1]).reverse();
        System.out.println("Second word reversed: " + reversedSecond);
    }
}