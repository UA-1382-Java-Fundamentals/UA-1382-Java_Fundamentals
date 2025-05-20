package com.softserve.academy.edu12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {
    public static void main(String[] args) {
        String text = "Now is the time";
//        String p = "[a-z]+";
//        Pattern pattern1 = Pattern.compile(p);
        Pattern pattern = Pattern.compile("[a-z]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.print(text.substring(matcher.start(), matcher.end()) + "*");
        }
        System.out.println();
        System.out.println(pattern.flags());

    }
}
