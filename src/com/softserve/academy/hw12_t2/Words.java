package com.softserve.academy.hw12_t2;

import java.util.Scanner;

public class Words {
    private String words;

    public void inputSentence() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a sentence with more than one space");
        words = sc.nextLine();
    }

    // Replace all consecutive spaces with a single space in the sentence
    public String replaceSpaces() {
        return words.trim().replaceAll("\\s+", " ");
    }
}
