package com.softserve.academy.edu13;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousClassExample {
    public static void main(String[] args) {
        // Example 1: Anonymous class for a custom interface
        interface Calculator {
            int calculate(int a, int b);
        }
//        Calculator adder = new Calculator() {
//            @Override
//            public int calculate(int a, int b) {
//                return a + b;
//            }
//        };
        // Anonymous class implementing Calculator
        Calculator adder = Integer::sum;

        // Use the calculator
        System.out.println("Sum of 5 and 3: " + adder.calculate(5, 3)); // Output: Sum of 5 and 3: 8

        // Example 2: Anonymous class for Comparator
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        // Use the comparator to sort an array
        String[] words = {"Apple", "Banana", "Kiwi"};
        Arrays.sort(words, lengthComparator);
        System.out.println("Sorted by length: " + Arrays.toString(words)); // Output: Sorted by length: [Kiwi, Apple, Banana]

    }
}