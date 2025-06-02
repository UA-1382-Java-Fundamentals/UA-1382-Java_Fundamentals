package com.softserve.academy.edu12;

/**
 * This class demonstrates various String methods in Java
 */
public class StringExample {
    public static void main(String[] args) {
        // Original string
        String str = "I study Java language";
        System.out.println("Original string: " + str);

        // Finding character position
        int indexOfCharJ = str.indexOf('J');
        System.out.println("Char J is at index: " + indexOfCharJ);

        // Getting character at a specific position
        char charAtIndex = str.charAt(8);
        System.out.println("Char at index 8: " + charAtIndex);

        // Substring operations
        String str1 = str.substring(13);
        System.out.println("Substring from index 13: " + str1);
        String str2 = str.substring(8, 12);
        System.out.println("Substring from index 8 to 12: " + str2);

        // String prefix and suffix checks
        boolean startsWithIStudy = str.startsWith("I study");
        System.out.println("Does the sentence start with 'I study': " + startsWithIStudy);
        System.out.println("Does the sentence end with 'I study': " + str.endsWith("I study"));
        System.out.println("Does the sentence end with 'language': " + str.endsWith("language"));
    }
}
//// Additional useful String methods
//String spacedString = "  Hello World  ";
//        System.out.println("Original string with spaces: '" + spacedString + "'");
//        System.out.println("After trim(): '" + spacedString.trim() + "'");
//
//        // String case conversion
//        System.out.println("Original: " + str);
//        System.out.println("Uppercase: " + str.toUpperCase());
//        System.out.println("Lowercase: " + str.toLowerCase());
//
//        // String replacement
//        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
//
//// String comparison
//String str3 = "Java";
//String str4 = "java";
//        System.out.println("str3: " + str3 + ", str4: " + str4);
//        System.out.println("str3.equals(str4): " + str3.equals(str4));
//        System.out.println("str3.equalsIgnoreCase(str4): " + str3.equalsIgnoreCase(str4));
//
//        // String length
//        System.out.println("Length of '" + str + "': " + str.length());