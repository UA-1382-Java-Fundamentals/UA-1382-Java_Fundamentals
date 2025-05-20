package com.softserve.academy.edu12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A utility class demonstrating the use of capturing groups in regular expressions.
 * Provides methods for extracting and working with groups in regex patterns.
 */
public class RegexGroupExample {

    /**
     * Extracts and displays all capturing groups from a pattern match.
     *
     * @param text  The text to match against
     * @param regex The regular expression with capturing groups
     * @throws IllegalArgumentException if the text or regex parameter is null
     */
    public static void displayCaptureGroups(String text, String regex) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        if (regex == null) {
            throw new IllegalArgumentException("Regex pattern cannot be null");
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Full match: " + matcher.group());

            int groupCount = matcher.groupCount();
            System.out.println("Number of capturing groups: " + groupCount);

            for (int i = 0; i <= groupCount; i++) {
                try {
                    System.out.println("Group " + i + ": " + matcher.group(i));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Group " + i + ": <index out of bounds>");
                }
            }
        } else {
            System.out.println("No match found for pattern: " + regex);
        }
    }

    /**
     * Gets the number of capturing groups in a regular expression pattern.
     *
     * @param regex The regular expression pattern
     * @return The number of capturing groups
     * @throws IllegalArgumentException if the regex parameter is null
     */
    public static int getGroupCount(String regex) {
        if (regex == null) {
            throw new IllegalArgumentException("Regex pattern cannot be null");
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(""); // Empty string for just getting group count
        return matcher.groupCount();
    }

    public static void main(String[] args) {

        try {
            System.out.println("Example with digit groups:");
            String text1 = "123-34";
            String regex1 = "(\\d{3})-(\\d{2})";

            System.out.println("Text: " + text1);
            System.out.println("Regex: " + regex1);
            displayCaptureGroups(text1, regex1);

            System.out.println("\nExample with word groups:");
            String text2 = "John Smith";
            String regex2 = "(\\w+)\\s+(\\w+)";

            System.out.println("Text: " + text2);
            System.out.println("Regex: " + regex2);
            displayCaptureGroups(text2, regex2);

            System.out.println("\nExample with nested groups:");
            String text3 = "2023-05-15";
            String regex3 = "((\\d{4})-(\\d{2})-(\\d{2}))";

            System.out.println("Text: " + text3);
            System.out.println("Regex: " + regex3);
            displayCaptureGroups(text3, regex3);

            System.out.println("\nGetting group count for patterns:");
            String[] patterns = {
                    "\\d+",                  // No capturing groups
                    "(\\d+)",                // One capturing group
                    "(\\d+)-(\\d+)",         // Two capturing groups
                    "((\\d+)-(\\d+))"        // Nested capturing groups (3 total)
            };

            for (String pattern : patterns) {
                int groupCount = getGroupCount(pattern);
                System.out.println("Pattern: " + pattern + " - Group count: " + groupCount);
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}