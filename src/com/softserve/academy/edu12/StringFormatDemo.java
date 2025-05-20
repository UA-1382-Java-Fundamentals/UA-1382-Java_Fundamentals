package com.softserve.academy.edu12;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * A comprehensive demonstration of string formatting capabilities in Java.
 * This class shows various ways to format strings, numbers, dates, and other data types
 * using the String.format() method and printf() method.
 */
public class StringFormatDemo {

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

    /**
     * Demonstrates basic decimal number formatting.
     */
    private static void demonstrateBasicDecimalFormatting() {
        printSectionHeader("BASIC DECIMAL FORMATTING");

        double pi = 3.1415926535;

        // Basic decimal formatting with precision
        System.out.println("Basic precision (%.3f): " + String.format("%.3f", pi));

        // Width specification with the right alignment
        System.out.println("Right-aligned with width (%10.3f): '" + String.format("%10.3f", pi) + "'");

        // Width specification with left alignment
        System.out.println("Left-aligned with width (%-10.3f): '" + String.format("%-10.3f", pi) + "'");

        // Combining sign and alignment
        System.out.println("With sign, left-aligned (%+-10.3f): '" + String.format("%+-10.3f", pi) + "'");

        // Using a specific locale
        System.out.println("Using German locale: '" + String.format(Locale.GERMANY, "%10.3f", pi) + "'");

        // Zero padding
        System.out.println("With zero padding (%010.3f): '" + String.format("%010.3f", pi) + "'");

        // Grouping separator
        System.out.println("With grouping separator (%,.2f): '" + String.format("%,.2f", 1234567.89) + "'");
    }


    private static void demonstrateNumericFormatting() {
        printSectionHeader("NUMERIC FORMAT SPECIFIERS");

        // Integer formatting
        System.out.println("Integer (%d): " + String.format("%d", 42));
        System.out.println("Integer with padding (%05d): " + String.format("%05d", 42));

        // Hexadecimal formatting
        System.out.println("Hexadecimal lowercase (%x): " + String.format("%x", 255));
        System.out.println("Hexadecimal uppercase (%X): " + String.format("%X", 255));
        System.out.println("Hexadecimal with '0x' prefix (%#x): " + String.format("%#x", 255));

        // Octal formatting
        System.out.println("Octal (%o): " + String.format("%o", 64));
        System.out.println("Octal with '0' prefix (%#o): " + String.format("%#o", 64));

        // Scientific notation
        System.out.println("Scientific notation lowercase (%e): " + String.format("%e", 1234.5678));
        System.out.println("Scientific notation uppercase (%E): " + String.format("%E", 1234.5678));

        // General formatting (chooses between %f and %e)
        System.out.println("General format lowercase (%g): " + String.format("%g", 1234.5678));
        System.out.println("General format uppercase (%G): " + String.format("%G", 0.0000012345));
    }


    private static void demonstrateStringFormatting() {
        printSectionHeader("STRING FORMATTING");

        String text = "Java";

        // Basic string formatting
        System.out.println("Basic string (%s): " + String.format("%s", text));

        // Width and alignment
        System.out.println("Right-aligned with width (%10s): '" + String.format("%10s", text) + "'");
        System.out.println("Left-aligned with width (%-10s): '" + String.format("%-10s", text) + "'");

        // Uppercase conversion
        System.out.println("Uppercase (%S): " + String.format("%S", text));

        // Limiting string length
        String longText = "This is a very long text that will be truncated";
        System.out.println("Limited to 10 characters (%.10s): " + String.format("%.10s", longText));

        // Combining width, alignment, and limiting
        System.out.println("Width 20, left-aligned, limit 10 (%-20.10s): '" + 
                String.format("%-20.10s", longText) + "'");
    }

    /**
     * Demonstrates date and time formatting.
     */
    private static void demonstrateDateFormatting() {
        printSectionHeader("DATE AND TIME FORMATTING");

        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.DECEMBER, 31, 23, 59, 59);
        Date specificDate = calendar.getTime();

        // Time formatting
        System.out.println("Hours and minutes (%tR): " + String.format("%tR", currentDate));
        System.out.println("Hours, minutes, seconds (%tT): " + String.format("%tT", currentDate));
        System.out.println("12-hour time (%tr): " + String.format("%tr", currentDate));

        // Date formatting
        System.out.println("Year-Month-Day (%tF): " + String.format("%tF", specificDate));
        System.out.println("Month/Day/Year (%tD): " + String.format("%tD", specificDate));
        System.out.println("Day Month Year (%tc): " + String.format("%tc", specificDate));

        // Custom date components
        System.out.println("Custom format: " + 
                String.format("Date: %1$tA, %1$tB %1$td, %1$tY", specificDate));
    }

    /**
     * Demonstrates argument indexing in format strings.
     */
    private static void demonstrateArgumentIndexing() {
        printSectionHeader("ARGUMENT INDEXING");

        // Implicit indexing (arguments used in order)
        System.out.println("Implicit indexing: " + String.format("%s, %s, and %s", "one", "two", "three"));

        // Explicit indexing (arguments used by position)
        System.out.println("Explicit indexing: " + String.format("%3$s, %1$s, and %2$s", "one", "two", "three"));

        // Reusing arguments
        System.out.println("Reusing arguments: " + String.format("%1$s, %1$s, and %1$s", "repeated"));

        // Mixing explicit and relative indexing
        System.out.println("Mixed indexing: " + String.format("%1$s, %<s in uppercase: %<S", "Java"));
    }

    /**
     * Demonstrates formatting of different data types.
     */
    private static void demonstrateDataTypeFormatting() {
        printSectionHeader("DIFFERENT DATA TYPES");

        // Boolean formatting
        System.out.println("Boolean (%b): " + String.format("%b", true));
        System.out.println("Boolean uppercase (%B): " + String.format("%B", false));

        // Character formatting
        System.out.println("Character (%c): " + String.format("%c", 'A'));
        System.out.println("Character uppercase (%C): " + String.format("%C", 'a'));

        // Hash code formatting
        System.out.println("Hash code (%h): " + String.format("%h", "Java"));
        System.out.println("Hash code uppercase (%H): " + String.format("%H", "Java"));

        // Line separator
        System.out.println("Line separator (%n): First line" + String.format("%n") + "Second line");

        // Percent sign
        System.out.println("Percent sign (%%): " + String.format("Progress: %d%%", 75));
    }


    public static void main(String[] args) {
        System.out.println("STRING FORMATTING DEMONSTRATION");
        System.out.println("This program demonstrates various string formatting capabilities in Java.");

        demonstrateBasicDecimalFormatting();
        demonstrateNumericFormatting();
        demonstrateStringFormatting();
        demonstrateDateFormatting();
        demonstrateArgumentIndexing();
        demonstrateDataTypeFormatting();

        System.out.println("\n" + "=".repeat(60));
        System.out.println(" All string formatting examples completed");
        System.out.println("=".repeat(60));
    }
}
