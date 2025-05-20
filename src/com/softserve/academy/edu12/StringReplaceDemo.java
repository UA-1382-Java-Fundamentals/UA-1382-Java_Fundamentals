package com.softserve.academy.edu12;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A comprehensive demonstration of string replacement and manipulation methods in Java.
 * This class shows various ways to replace characters and substrings, use regular expressions
 * for replacement, split strings, and work with text blocks.
 */
public class StringReplaceDemo {

    /**
     * Prints a section header for better readability in the console output.
     *
     * @param title The title of the section
     */
    private static void printSectionHeader(String title) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" " + title);
        System.out.println("=".repeat(60));
    }

    private static void demonstrateBasicReplacement() {
        printSectionHeader("BASIC CHARACTER AND SUBSTRING REPLACEMENT");

        String original = "Hello World. It's demo class.";
        System.out.println("Original string: \"" + original + "\"");

        // Replace a single character
        String charReplaced = original.replace('W', 'w');
        System.out.println("\nAfter replace('W', 'w'): \n\"" + charReplaced + "\"");

        // Replace a substring (exact match)
        String substringReplaced = original.replace("World", "Java");
        System.out.println("\nAfter replace(\"World\", \"Java\"): \n\"" + substringReplaced + "\"");

        // Replace a substring that doesn't exist (no change)
        String nonExistentReplaced = original.replace("Hello World!", "Good night, World!");
        System.out.println("\nAfter replace(\"Hello World!\", \"Good night, World!\"): \n\"" + nonExistentReplaced + "\"");

        // Replace all occurrences of a character
        String multipleCharsReplaced = original.replace('e', 'E');
        System.out.println("\nAfter replacing all 'e' with 'E': \n\"" + multipleCharsReplaced + "\"");
    }

    private static void demonstrateRegexReplacement() {
        printSectionHeader("REGEX-BASED REPLACEMENT");

        String original = "Hello World. It's demo class. Hello again.";
        System.out.println("Original string: \"" + original + "\"");

        // replaceFirst with dot (matches any character)
        String firstDotReplaced = original.replaceFirst(".", "!");
        System.out.println("\nAfter replaceFirst(\".\", \"!\"): \n\"" + firstDotReplaced + "\"");

        // replaceAll with dot (matches any character)
        String allDotsReplaced = original.replaceAll(".", "!");
        System.out.println("\nAfter replaceAll(\".\", \"!\"): \n\"" + allDotsReplaced + "\"");

        // replaceAll with escaped dot (matches literal dot)
        String allLiteralDotsReplaced = original.replaceAll("\\.", "!");
        System.out.println("\nAfter replaceAll(\"\\\\.\", \"!\"): \n\"" + allLiteralDotsReplaced + "\"");

        // replaceFirst with escaped dot (matches literal dot)
        String firstLiteralDotReplaced = original.replaceFirst("\\.", "!");
        System.out.println("\nAfter replaceFirst(\"\\\\.\", \"!\"): \n\"" + firstLiteralDotReplaced + "\"");

        // Replace word boundaries
        String wordBoundaryReplaced = original.replaceAll("\\bHello\\b", "Hi");
        System.out.println("\nAfter replaceAll(\"\\\\bHello\\\\b\", \"Hi\"): \n\"" + wordBoundaryReplaced + "\"");

        // Replace it with case insensitivity
        String caseInsensitiveReplaced = original.replaceAll("(?i)world", "Java");
        System.out.println("\nAfter replaceAll(\"(?i)world\", \"Java\"): \n\"" + caseInsensitiveReplaced + "\"");
    }

    /**
     * Demonstrates advanced replacement techniques using Pattern and Matcher.
     */
    private static void demonstrateAdvancedReplacement() {
        printSectionHeader("ADVANCED REPLACEMENT WITH PATTERN AND MATCHER");

        String original = "User1: John, User2: Alice, User3: Bob";
        System.out.println("Original string: \"" + original + "\"");

        Pattern pattern = Pattern.compile("User(\\d+): (\\w+)");
        Matcher matcher = pattern.matcher(original);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String replacement = "Person" + matcher.group(1) + ": " + matcher.group(2).toUpperCase();
            matcher.appendReplacement(result, replacement);
        }
        matcher.appendTail(result);

        System.out.println("\nAfter Pattern/Matcher replacement: \n\"" + result.toString() + "\"");

        // Using replaceAll with back references
        String backReferenceReplaced = original.replaceAll("User(\\d+): (\\w+)", "Person$1: $2");
        System.out.println("\nUsing replaceAll with back references: \n\"" + backReferenceReplaced + "\"");
    }

    /**
     * Demonstrates string splitting methods.
     */
    private static void demonstrateSplitting() {
        printSectionHeader("STRING SPLITTING");

        String original = "Hello World. It's demo class.";
        System.out.println("Original string: \"" + original + "\"");

        // Split by space
        String[] splitBySpace = original.split(" ");
        System.out.println("\nAfter split(\" \"): ");
        printArray(splitBySpace);

        // Split by space with limit
        String[] splitWithLimit = original.split(" ", 2);
        System.out.println("\nAfter split(\" \", 2): ");
        printArray(splitWithLimit);

        // Split by dot
        String[] splitByDot = original.split("\\.");
        System.out.println("\nAfter split(\"\\\\.\"): ");
        printArray(splitByDot);

        // Split by regex (word boundary)
        String[] splitByWordBoundary = original.split("\\b");
        System.out.println("\nAfter split(\"\\\\b\"): ");
        printArray(splitByWordBoundary);
    }

    /**
     * Demonstrates the use of text blocks (Java 15+).
     */
    private static void demonstrateTextBlocks() {
        printSectionHeader("TEXT BLOCKS");

        // Basic text block
        String basicTextBlock = """
                This is a text block.
                It can span multiple lines.
                No need for escape characters for most cases.
                """;
        System.out.println("Basic text block:");
        System.out.println(basicTextBlock);

        // Text block with escape sequences
        String textBlockWithEscapes = """
                     line1    \s
                         line2   \
                             line3   
                     """;
        System.out.println("\nText block with escape sequences:");
        System.out.println(textBlockWithEscapes);

        // Text block with string interpolation
        String name = "Java";
        String interpolatedTextBlock = """
                Hello, %s!
                Welcome to text blocks.
                """.formatted(name);
        System.out.println("\nText block with string interpolation:");
        System.out.println(interpolatedTextBlock);
    }

    /**
     * Demonstrates other string manipulation methods related to replacement.
     */
    private static void demonstrateOtherManipulations() {
        printSectionHeader("OTHER STRING MANIPULATIONS");

        // String.join
        String[] words = {"Hello", "World", "Java"};
        String joined = String.join(" - ", words);
        System.out.println("After String.join(\" - \", words): \n\"" + joined + "\"");

        // StringBuilder replace
        StringBuilder sb = new StringBuilder("Hello World");
        sb.replace(6, 11, "Java");
        System.out.println("\nAfter StringBuilder replace(6, 11, \"Java\"): \n\"" + sb.toString() + "\"");

        // String.repeat (Java 11+)
        String repeated = "*-*".repeat(10);
        System.out.println("\nAfter \"*-*\".repeat(10): \n\"" + repeated + "\"");

        // String.strip (Java 11+)
        String withWhitespace = "   Hello World   ";
        System.out.println("\nOriginal string with whitespace: \"" + withWhitespace + "\"");
        System.out.println("After strip(): \"" + withWhitespace.strip() + "\"");
    }

    /**
     * Demonstrates Integer object comparison behavior.
     * This is included to explain the example in the original code.
     */
    private static void demonstrateIntegerComparison() {
        printSectionHeader("INTEGER OBJECT COMPARISON");

        // Integer objects within the cache range (-128 to 127)
        Integer a = 127;
        Integer b = 127;
        System.out.println("Integer a = 127, b = 127");
        System.out.println("a == b: " + (a == b) + " (true because values are in the Integer cache range)");

        // Integer objects outside the cache range
        Integer c = 128;
        Integer d = 128;
        System.out.println("\nInteger c = 128, d = 128");
        System.out.println("c == d: " + (c == d) + " (false because values are outside the Integer cache range)");

        // Proper comparison using equals
        System.out.println("\nProper comparison using equals:");
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("c.equals(d): " + c.equals(d));
    }

    /**
     * Helper method to print an array of strings.
     *
     * @param array The array to print
     */
    private static void printArray(String[] array) {
        System.out.println("Array elements: " + Arrays.toString(array));
        System.out.println("Array as list: " + Arrays.asList(array));
    }

    /**
     * Main method to run all string replacement demonstrations.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("STRING REPLACEMENT AND MANIPULATION DEMONSTRATION");
        System.out.println("This program demonstrates various string replacement and manipulation methods in Java.");

        try {
            demonstrateBasicReplacement();
            demonstrateRegexReplacement();
            demonstrateAdvancedReplacement();
            demonstrateSplitting();
            demonstrateTextBlocks();
            demonstrateOtherManipulations();
            demonstrateIntegerComparison();

            System.out.println("\n" + "=".repeat(60));
            System.out.println(" All string replacement examples completed");
            System.out.println("=".repeat(60));
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
