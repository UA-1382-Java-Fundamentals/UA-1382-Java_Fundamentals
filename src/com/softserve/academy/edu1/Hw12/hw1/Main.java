package com.softserve.academy.edu1.Hw12.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence of exactly 5 words:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        if (words.length != 5) {
            System.out.println("Error: Please enter exactly 5 words");
            return;
        }

        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestWord.length());

        String secondWord = words[1];
        String reversedSecond = new StringBuilder(secondWord).reverse().toString();
        System.out.println("Second word reversed: " + reversedSecond);
    }
    }

