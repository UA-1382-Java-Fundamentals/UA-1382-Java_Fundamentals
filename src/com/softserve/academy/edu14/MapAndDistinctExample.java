package com.softserve.academy.edu14;

import java.util.List;

public class MapAndDistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 5, 4, 5, 4, 6, 1, 8, 9, 6);
        List<Integer> modifiedNumbers = numbers.stream()
                .map(n -> n * 2) // Multiply each number by 2
                .distinct() // Remove duplicates
                .sorted() // Sort the numbers
                .toList(); // Collect to a List

        System.out.print("Original numbers: " + numbers);
        System.out.print("\nModified numbers: " + modifiedNumbers);
    }
}
