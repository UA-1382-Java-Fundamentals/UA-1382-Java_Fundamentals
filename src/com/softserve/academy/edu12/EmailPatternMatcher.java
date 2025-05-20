package com.softserve.academy.edu12;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A utility class for validating and extracting email addresses using regular expressions.
 * Provides methods to check if a string is a valid email and to find all emails in a text.
 */
public class EmailPatternMatcher {

    private static final String STANDARD_EMAIL_REGEX = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
    private static final String SIMPLE_EMAIL_REGEX = "\\w+@\\w+\\.com";

    /**
     * Validates if the provided string is a valid email address using the standard email pattern.
     *
     * @param email The email string to validate
     * @return true if the string is a valid email, false otherwise
     * @throws IllegalArgumentException if the email parameter is null
     */
    public static boolean isValidEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }
        return Pattern.matches(STANDARD_EMAIL_REGEX, email);
    }

    /**
     * Validates if the provided string is a valid email address using a simple email pattern.
     * This only matches the basic format: word@word.com
     *
     * @param email The email string to validate
     * @return true if the string is a valid simple email, false otherwise
     * @throws IllegalArgumentException if the email parameter is null
     */
    public static boolean isValidSimpleEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }
        return Pattern.matches(SIMPLE_EMAIL_REGEX, email);
    }

    /**
     * Finds all email addresses in the provided text using the standard email pattern.
     *
     * @param text The text to search for email addresses
     * @return A list of all email addresses found in the text
     * @throws IllegalArgumentException if the text parameter is null
     */
    public static List<String> findEmails(String text) {
        return findEmails(text, STANDARD_EMAIL_REGEX);
    }

    /**
     * Finds all email addresses in the provided text using the simple email pattern.
     *
     * @param text The text to search for simple email addresses
     * @return A list of all simple email addresses found in the text
     * @throws IllegalArgumentException if the text parameter is null
     */
    public static List<String> findSimpleEmails(String text) {
        return findEmails(text, SIMPLE_EMAIL_REGEX);
    }

    /**
     * Finds all patterns matching the provided regex in the text.
     *
     * @param text  The text to search in
     * @param regex The regular expression pattern to match
     * @return A list of all matches found in the text
     * @throws IllegalArgumentException if the text or regex parameter is null
     */
    private static List<String> findEmails(String text, String regex) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        if (regex == null) {
            throw new IllegalArgumentException("Regex pattern cannot be null");
        }

        List<String> results = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            results.add(matcher.group());
        }

        return results;
    }

    public static void main(String[] args) {
        try {
            String text = "My email is testemail@gmail.com and my friend's email is friend@test.net";
            System.out.println("Original text: " + text);

            // Find emails using standard pattern
            System.out.println("\nFinding emails with standard pattern:");
            List<String> emails = findEmails(text);
            for (String email : emails) {
                System.out.println("Found email: " + email);
            }

            // Find emails using a simple pattern
            System.out.println("\nFinding emails with simple pattern:");
            List<String> simpleEmails = findSimpleEmails(text);
            for (String email : simpleEmails) {
                System.out.println("Found simple email: " + email);
            }

            // Validate individual emails
            System.out.println("\nValidating individual emails:");
            String[] emailsToValidate = {
                    "test@example.com",
                    "invalid-email",
                    "user.name@domain.co.uk",
                    "simple@domain.com"
            };

            for (String email : emailsToValidate) {
                System.out.println(email + " - Standard validation: " + isValidEmail(email));
                System.out.println(email + " - Simple validation: " + isValidSimpleEmail(email));
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}