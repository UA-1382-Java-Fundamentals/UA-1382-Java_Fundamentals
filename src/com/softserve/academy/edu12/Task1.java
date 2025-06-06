package com.softserve.academy.edu12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a five word sentence");
            String input = sc.nextLine();

            Pattern wordPattern = Pattern.compile("\\b\\w+\\b");
            Matcher matcher = wordPattern.matcher(input);

            String[] words = new String[5];
            int count = 0;

            while (matcher.find()) {
                if (count < 5) {
                    words[count++] = matcher.group();
                } else {
                    break;
                }
            }

            if (count != 5) {
                System.out.println("You can only enter five words");
                return;
            }

            String longestWord = words[0];
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            System.out.println("Longest word is: " + longestWord);
            System.out.println("Length of longest word is: " + longestWord.length());

            String secondWord = words[1];
            String reversedSecond = new StringBuilder(secondWord).reverse().toString();
            System.out.println("Reversed second word: " + reversedSecond);

            sc.close();
        }
    }