package com.softserve.academy.edu12;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A utility class for extracting Ukrainian words from text.
 * Uses regex pattern matching to identify words written in the Ukrainian alphabet.
 */
public class UkrainianTextExtractor {
    private static final String UKRAINIAN_WORD_REGEX = "[А-Яа-яЄєІіЇїҐґ']+";

    /**
     * Extracts all Ukrainian words from a given text.
     *
     * @param text The text to extract Ukrainian words from
     * @return A list of Ukrainian words found in the text
     * @throws IllegalArgumentException if the input text is null
     */
    public static List<String> extractUkrainianWords(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Input text cannot be null");
        }

        List<String> ukrainianWords = new ArrayList<>();
        Pattern pattern = Pattern.compile(UKRAINIAN_WORD_REGEX, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            ukrainianWords.add(matcher.group());
        }

        return ukrainianWords;
    }

    public static void main(String[] args) {
        try {
            String ukrainianText = "Привіт! Як справи? Їхати треба на навчання.";
            System.out.println("Original Ukrainian text: " + ukrainianText);
            System.out.println("Extracted Ukrainian words:");

            List<String> ukrainianWords = extractUkrainianWords(ukrainianText);
            for (String word : ukrainianWords) {
                System.out.println("- " + word);
            }

            String mixedText = "Hello, Світ! This is a mixed text з українськими словами.";
            System.out.println("\nOriginal mixed text: " + mixedText);
            System.out.println("Extracted Ukrainian words only:");

            List<String> extractedWords = extractUkrainianWords(mixedText);
            for (String word : extractedWords) {
                System.out.println("- " + word);
            }

            // Demonstrate error handling
            // System.out.println(extractUkrainianWords(null)); // Uncomment to see exception handling
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}