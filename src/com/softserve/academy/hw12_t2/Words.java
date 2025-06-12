package com.softserve.academy.hw12_t2;

import java.util.Scanner;

public class Words {
    private String words;

    public void inputElements() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a sentence with more than one space");
        try {
            words = sc.nextLine();
        } catch (Exception e) {
            throw new Exception("Unknown error");
        }
    }

    // Replace all consecutive spaces with a single space in the sentence
    public String replaceSpaces() {
        return words.trim().replaceAll("\\s+", " ");
    }
}
