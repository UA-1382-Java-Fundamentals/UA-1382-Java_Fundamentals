package com.softserve.academy.hw12_t1;

import java.util.Scanner;

public class Words {
    private String words;

    public void inputElements() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a sentence of 5 words");
        try {
            words = sc.nextLine();
            while (words.split("\\s").length != 5) {
                System.out.println("Please enter a sentence of 5 words");
                words = sc.nextLine();
            }
        } catch (Exception e) {
            throw new Exception("Unknown error");
        }
    }

    // Identify the first longest word in the sentence
    public String theFirstLongestWord() {
        String [] string = words.split("\\s");
        String maxWord = "";

        for (String s : string) {
            if (s.length() > maxWord.length()) {
                maxWord = s;
            }
        }

        return maxWord;
    }

    // Determine the number of letters in the longest word
    public int numberOfLettersInTheLongestWord() {
        return theFirstLongestWord().length();
    }

    // Determine the second word
    public String defineTheSecondWord() {
        return words.split("\\s")[1];
    }
}
