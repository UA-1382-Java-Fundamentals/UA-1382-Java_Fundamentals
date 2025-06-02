package com.softserve.academy.edu14;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * This class demonstrates practical examples of stream reduction operations
 * and specialized numeric streams in Java.
 */
public class StreamReductionExample {
    public static void main(String[] args) {
        // Example 1: Basic reduction with sum, min, max
        System.out.println("Example 1: Basic reduction operations");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sum using reduce
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // Max using reduce
        Optional<Integer> max = numbers.stream()
                .reduce(Integer::max);
        System.out.println("Max: " + max.orElse(0));

        // Min using reduce
        Optional<Integer> min = numbers.stream()
                .reduce(Integer::min);
        System.out.println("Min: " + min.orElse(0));

        // Product using reduce
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);

        // Example 2: Custom reduction - finding the longest string
        System.out.println("\nExample 2: Custom reduction - finding the longest string");
        List<String> words = Arrays.asList("Java", "Streams", "are", "powerful", "and", "flexible");

        Optional<String> longest = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
        System.out.println("Longest word: " + longest.orElse(""));

        // Example 3: Reduction with custom accumulator and combiner
        System.out.println("\nExample 3: Reduction with custom accumulator and combiner");

        // Calculate average without using average() method
        double average = numbers.stream()
                .reduce(
                        new double[]{0, 0}, // Initial value: [sum, count]
                        (acc, n) -> {
                            acc[0] += n;    // Add to sum
                            acc[1]++;       // Increment count
                            return acc;
                        },
                        (acc1, acc2) -> {
                            acc1[0] += acc2[0]; // Combine sums
                            acc1[1] += acc2[1]; // Combine counts
                            return acc1;
                        }
                )[0] / numbers.size();

        System.out.println("Average: " + average);

        // Example 4: Working with IntStream
        System.out.println("\nExample 4: Working with IntStream");

        // Generate range of integers
        int[] range = IntStream.rangeClosed(1, 100)
                .toArray();
        System.out.println("Range: " + range[0] + "..." + range[range.length - 1]);

        // Statistics
        IntSummaryStatistics stats = IntStream.of(range)
                .summaryStatistics();
        System.out.println("Statistics: " + stats);

        // Example 5: Working with LongStream
        System.out.println("\nExample 5: Working with LongStream");

        // Calculate factorial
        long factorial = LongStream.rangeClosed(1, 20)
                .reduce(1, (a, b) -> a * b);
        System.out.println("Factorial of 20: " + factorial);

        // Example 6: Working with DoubleStream
        System.out.println("\nExample 6: Working with DoubleStream");

        // Generate random doubles and calculate statistics
        double[] randomValues = DoubleStream.generate(Math::random)
                .limit(1000)
                .toArray();

        DoubleSummaryStatistics doubleStats = DoubleStream.of(randomValues)
                .summaryStatistics();
        System.out.println("Random values statistics: " + doubleStats);

        // Example 7: Practical example - Calculating shopping cart total
        System.out.println("\nExample 7: Calculating shopping cart total");

        List<Product> cart = Arrays.asList(
                new Product("Laptop", 1200.0, 1),
                new Product("Mouse", 25.0, 2),
                new Product("Keyboard", 45.0, 1),
                new Product("Monitor", 150.0, 2)
        );

        // Calculate total using reduce
        double total = cart.stream()
                .reduce(
                        0.0,
                        (subtotal, item) -> subtotal + item.getPrice() * item.getQuantity(),
                        Double::sum
                );

        System.out.println("Cart total: $" + total);

        // Calculate total with discount for items over $100
        double discountedTotal = cart.stream()
                .map(item -> {
                    double itemTotal = item.getPrice() * item.getQuantity();
                    // Apply 10% discount for expensive items
                    return itemTotal > 100 ? itemTotal * 0.9 : itemTotal;
                })
                .reduce(0.0, Double::sum);

        System.out.println("Discounted cart total: $" + discountedTotal);

        // Example 8: Joining strings with Collectors
        System.out.println("\nExample 8: Joining strings with Collectors");

        String joinedWords = words.stream()
                .collect(Collectors.joining(", ", "Words: [", "]"));
        System.out.println(joinedWords);

        // Example 9: Partitioning numbers by even/odd
        System.out.println("\nExample 9: Partitioning numbers by even/odd");

        Map<Boolean, List<Integer>> evenOddMap = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even numbers: " + evenOddMap.get(true));
        System.out.println("Odd numbers: " + evenOddMap.get(false));
    }

    // Product class for our examples
    static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        @Override
        public String toString() {
            return name + " ($" + price + " x " + quantity + ")";
        }
    }
}
