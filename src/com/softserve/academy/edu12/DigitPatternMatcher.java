package com.softserve.academy.edu12;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A utility class for validating and extracting digit patterns using regular expressions.
 * Provides methods to check if a string matches a specific digit pattern and to find all digit sequences in a text.
 */
public class DigitPatternMatcher {
    private static final String DIGITS_REGEX = "\\d+";// Pattern for matching any sequence of digits
    private static final String FOUR_DIGITS_REGEX = "\\d{4}"; // Pattern for matching exactly 4 digits

    /**
     * Validates if the provided string consists of exactly 4 digits.
     *
     * @param input The string to validate
     * @return true if the string consists of exactly 4 digits, false otherwise
     * @throws IllegalArgumentException if the input parameter is null
     */
    public static boolean isValidFourDigitNumber(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return Pattern.matches(FOUR_DIGITS_REGEX, input);
    }

    /**
     * Finds all sequences of digits in the provided text.
     *
     * @param text The text to search for digit sequences
     * @return A list of all digit sequences found in the text
     * @throws IllegalArgumentException if the text parameter is null
     */
    public static List<String> findDigitSequences(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }

        List<String> results = new ArrayList<>();
        Pattern pattern = Pattern.compile(DIGITS_REGEX);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            results.add(matcher.group());
        }

        return results;
    }

    /**
     * Finds all digit sequences in the provided text, starting from a specific position.
     *
     * @param text     The text to search for digit sequences
     * @param startPos The position to start searching from
     * @return A list of all digit sequences found in the text from the start position
     * @throws IllegalArgumentException if the text parameter is null or startPos is negative
     */
    public static List<String> findDigitSequencesFrom(String text, int startPos) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        if (startPos < 0) {
            throw new IllegalArgumentException("Start position cannot be negative");
        }

        List<String> results = new ArrayList<>();
        Pattern pattern = Pattern.compile(DIGITS_REGEX);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find(startPos)) {
            do {
                results.add(matcher.group());
            } while (matcher.find());
        }

        return results;
    }


    public static void main(String[] args) {
        try {
            // Validate 4-digit numbers
            System.out.println("Validating 4-digit numbers:");
            String[] numbersToValidate = {"1234", "123", "12345", "abcd"};
            for (String number : numbersToValidate) {
                System.out.println(number + " is a valid 4-digit number: " + isValidFourDigitNumber(number));
            }

            // Find digit sequences in text
            System.out.println("\nFinding digit sequences in text:");
            String text1 = "12 34 56 789 22 1 hoihvofduhbuogh2 onoboubobu4";
            System.out.println("Text: " + text1);
            List<String> digits1 = findDigitSequences(text1);
            System.out.println("Found digit sequences:");
            for (String digit : digits1) {
                System.out.println("- " + digit);
            }

            // Find digit sequences in another text
            System.out.println("\nFinding digit sequences in another text:");
            String text2 = "d22jjvbifhdvbhidf345ijdfbv;jidfbv999ijibi;ug9";
            System.out.println("Text: " + text2);
            List<String> digits2 = findDigitSequences(text2);
            System.out.println("Found digit sequences:");
            for (String digit : digits2) {
                System.out.println("- " + digit);
            }

            // Find digit sequences from a specific position
            System.out.println("\nFinding digit sequences from position 4:");
            List<String> digitsFromPos = findDigitSequencesFrom(text2, 4);
            System.out.println("Found digit sequences from position 4:");
            for (String digit : digitsFromPos) {
                System.out.println("- " + digit);
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}