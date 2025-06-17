package com.softserve.academy.hw12_t3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    String text;

    public void inputText() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a sentence which includes at least once: a dollar sign ($) followed by any number of digits, a dot, and two digits after the dot");
        try {
            text = sc.nextLine();
        } catch (Exception e) {
            throw new Exception("Unknown error");
        }
    }

    // US currency format: a dollar sign ($) followed by any number of digits, a dot, and two digits after the dot
    // display all the occurrences of US currency format
    public void outputUsCurrencyFormat() {
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(text);
        boolean matchFound = false;

        while (matcher.find()) {
            System.out.println("US currency format: " + matcher.group());
            matchFound = true;
        }

        if(!matchFound) {
            System.out.println("No US currency format in text");
        }
    }

}
