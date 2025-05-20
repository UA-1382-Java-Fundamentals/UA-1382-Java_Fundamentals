package com.softserve.academy.edu12;


/**
 * A utility class for converting date formats in text.
 * Specifically, converts dates from "dd-MM-yyyy" format to "yyyy-MM-dd" format.
 */
public class DateFormatConverter {
    private static final String DATE_REGEX = "\\b(\\d{2})-(\\d{2})-(\\d{4})\\b";

    /**
     * Converts dates in a text from "dd-MM-yyyy" format to "yyyy-MM-dd" format.
     *
     * @param text The text containing dates to convert
     * @return The text with converted date formats
     * @throws IllegalArgumentException if the input text is null
     */
    public static String convertDateFormat(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Input text cannot be null");
        }
        return text.replaceAll(DATE_REGEX, "$3-$2-$1");
    }

    public static void main(String[] args) {
        try {
            String dateText = "Date: 19-05-2025, other date: 20-05-2025";
            System.out.println("Original text with dates: " + dateText);
            String convertedText = convertDateFormat(dateText);
            System.out.println("Text with converted dates: " + convertedText);

            String multiDateText = "Events: 01-01-2023, 15-02-2023, 30-03-2023";
            System.out.println("\nOriginal text with multiple dates: " + multiDateText);
            String convertedMultiDateText = convertDateFormat(multiDateText);
            System.out.println("Text with converted dates: " + convertedMultiDateText);

            // Demonstrate error handling
            // System.out.println(convertDateFormat(null)); // Uncomment to see exception handling
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}