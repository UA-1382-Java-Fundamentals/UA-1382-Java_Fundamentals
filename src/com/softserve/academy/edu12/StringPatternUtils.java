package com.softserve.academy.edu12;

import java.util.regex.Pattern;

/**
 * A utility class for string manipulation using regular expressions.
 * Provides methods for splitting strings based on regex patterns and other string operations.
 */
public class StringPatternUtils {

    private static final String WHITESPACE_REGEX = "\\s+";

    /**
     * Splits a string into an array of substrings based on whitespace.
     *
     * @param input The string to split
     * @return An array of substrings
     * @throws IllegalArgumentException if the input parameter is null
     */
    public static String[] splitByWhitespace(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        Pattern pattern = Pattern.compile(WHITESPACE_REGEX);
        return pattern.split(input);
    }

    /**
     * Splits a string into an array of substrings based on a custom regex pattern.
     *
     * @param input The string to split
     * @param regex The regular expression to use for splitting
     * @return An array of substrings
     * @throws IllegalArgumentException if the input or regex parameter is null
     */
    public static String[] splitByPattern(String input, String regex) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        if (regex == null) {
            throw new IllegalArgumentException("Regex pattern cannot be null");
        }
        Pattern pattern = Pattern.compile(regex);
        return pattern.split(input);
    }

    /**
     * Gets the string representation of the pattern used by a Pattern object.
     *
     * @param pattern The Pattern object
     * @return The string representation of the pattern
     * @throws IllegalArgumentException if the pattern parameter is null
     */
    public static String getPatternString(Pattern pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("Pattern cannot be null");
        }
        return pattern.pattern();
    }

    public static void main(String[] args) {

        try {

            System.out.println("Splitting string by whitespace:");
            String text = "one two three   four";
            System.out.println("Original text: \"" + text + "\"");

            String[] words = splitByWhitespace(text);
            System.out.println("After splitting:");
            for (String word : words) {
                System.out.println("- \"" + word + "\"");
            }

            System.out.println("\nSplitting string by custom pattern (comma):");
            String csvText = "apple,orange,banana,grape";
            System.out.println("Original text: \"" + csvText + "\"");

            String[] fruits = splitByPattern(csvText, ",");
            System.out.println("After splitting:");
            for (String fruit : fruits) {
                System.out.println("- \"" + fruit + "\"");
            }

            System.out.println("\nGetting pattern string:");
            Pattern whitespacePattern = Pattern.compile(WHITESPACE_REGEX);
            System.out.println("Pattern: " + getPatternString(whitespacePattern));

            Pattern digitPattern = Pattern.compile("\\d+");
            System.out.println("Pattern: " + getPatternString(digitPattern));

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}