package com.softserve.academy.edu12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A utility class demonstrating various methods of the Matcher class in Java.
 * Provides examples of using methods like lookingAt(), reset(), find(), group(), start(), and end().
 */
public class MatcherMethodsExample {

    /**
     * Demonstrates the lookingAt() method of Matcher.
     * The lookingAt() method attempts to match the input sequence, starting at the beginning,
     * against the pattern.
     *
     * @param text  The text to match against
     * @param regex The regular expression pattern
     * @return true if the pattern matches at the beginning of the text, false otherwise
     * @throws IllegalArgumentException if the text or regex parameter is null
     */
    public static boolean demonstrateLookingAt(String text, String regex) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        if (regex == null) {
            throw new IllegalArgumentException("Regex pattern cannot be null");
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.lookingAt();
    }

    /**
     * Demonstrates the reset() method of Matcher.
     * The reset() method resets the matcher, allowing it to be reused.
     *
     * @param text  The text to match against
     * @param regex The regular expression pattern
     * @throws IllegalArgumentException if the text or regex parameter is null
     */
    public static void demonstrateReset(String text, String regex) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        if (regex == null) {
            throw new IllegalArgumentException("Regex pattern cannot be null");
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Before reset:");
        if (matcher.find()) {
            System.out.println("Found match: " + matcher.group());
            System.out.println("Start position: " + matcher.start());
            System.out.println("End position: " + matcher.end());
        } else {
            System.out.println("No match found");
        }

        matcher.reset();
        System.out.println("\nAfter reset:");
        if (matcher.find()) {
            System.out.println("Found match: " + matcher.group());
            System.out.println("Start position: " + matcher.start());
            System.out.println("End position: " + matcher.end());
        } else {
            System.out.println("No match found");
        }
    }

    /**
     * Demonstrates the find(), group(), start(), and end() methods of Matcher.
     * The find() method attempts to find the next subsequence of the input that matches the pattern.
     * The group() method returns the matched subsequence.
     * The start() method returns the start index of the matched subsequence.
     * The end() method returns the end index of the matched subsequence.
     *
     * @param text  The text to match against
     * @param regex The regular expression pattern
     * @throws IllegalArgumentException if the text or regex parameter is null
     */
    public static void demonstrateFindGroupStartEnd(String text, String regex) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        if (regex == null) {
            throw new IllegalArgumentException("Regex pattern cannot be null");
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Finding matches in text: \"" + text + "\" with pattern: \"" + regex + "\"");
        int matchCount = 0;

        while (matcher.find()) {
            matchCount++;
            System.out.println("\nMatch #" + matchCount + ":");
            System.out.println("Group: \"" + matcher.group() + "\"");
            System.out.println("Start position: " + matcher.start());
            System.out.println("End position: " + matcher.end());
        }

        if (matchCount == 0) {
            System.out.println("No matches found");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Demonstrating lookingAt() method:");
            String[] textsForLookingAt = {"one two three", "two one three", "123 456"};
            String regexForLookingAt = "\\w+";

            for (String text : textsForLookingAt) {
                boolean result = demonstrateLookingAt(text, regexForLookingAt);
                System.out.println("Text: \"" + text + "\" - lookingAt(\"" + regexForLookingAt + "\"): " + result);
            }

            System.out.println("\nDemonstrating reset() method:");
            demonstrateReset("one two three", "\\w+");

            System.out.println("\nDemonstrating find(), group(), start(), end() methods:");
            demonstrateFindGroupStartEnd("one two three", "\\w+");

            System.out.println("\nMore complex example with multiple matches:");
            demonstrateFindGroupStartEnd("Java is a programming language. Java is object-oriented.", "Java");

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}