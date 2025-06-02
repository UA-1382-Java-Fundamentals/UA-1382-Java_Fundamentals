package com.softserve.academy.edu14;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * This class demonstrates practical examples of parallel streams in Java.
 * It shows when parallel streams can improve performance and when they might
 * cause issues, along with best practices for using them effectively.
 */
public class ParallelStreamExample {
    public static void main(String[] args) {
        // Create a large list for our performance tests
        int size = 10_000_000;
        List<Integer> numbers = IntStream.rangeClosed(1, size)
                .boxed()
                .collect(Collectors.toList());
        
        System.out.println("Working with a list of " + size + " integers");
        
        // Example 1: Comparing sequential vs parallel sum
        System.out.println("\nExample 1: Sequential vs Parallel Sum");
        
        // Sequential sum
        Instant start = Instant.now();
        long sequentialSum = numbers.stream()
                .mapToLong(Integer::longValue)
                .sum();
        Instant end = Instant.now();
        long sequentialTime = Duration.between(start, end).toMillis();
        
        System.out.println("Sequential sum: " + sequentialSum);
        System.out.println("Sequential time: " + sequentialTime + " ms");
        
        // Parallel sum
        start = Instant.now();
        long parallelSum = numbers.parallelStream()
                .mapToLong(Integer::longValue)
                .sum();
        end = Instant.now();
        long parallelTime = Duration.between(start, end).toMillis();
        
        System.out.println("Parallel sum: " + parallelSum);
        System.out.println("Parallel time: " + parallelTime + " ms");
        System.out.println("Speedup: " + (sequentialTime > 0 ? (double) sequentialTime / parallelTime : "N/A"));
        
        // Example 2: CPU-intensive operation - calculating prime numbers
        System.out.println("\nExample 2: Finding prime numbers");
        
        // Sequential prime counting
        start = Instant.now();
        long sequentialPrimeCount = numbers.stream()
                .limit(100_000) // Limit to first 100,000 numbers for this test
                .filter(ParallelStreamExample::isPrime)
                .count();
        end = Instant.now();
        sequentialTime = Duration.between(start, end).toMillis();
        
        System.out.println("Sequential prime count: " + sequentialPrimeCount);
        System.out.println("Sequential time: " + sequentialTime + " ms");
        
        // Parallel prime counting
        start = Instant.now();
        long parallelPrimeCount = numbers.parallelStream()
                .limit(100_000) // Limit to first 100,000 numbers for this test
                .filter(ParallelStreamExample::isPrime)
                .count();
        end = Instant.now();
        parallelTime = Duration.between(start, end).toMillis();
        
        System.out.println("Parallel prime count: " + parallelPrimeCount);
        System.out.println("Parallel time: " + parallelTime + " ms");
        System.out.println("Speedup: " + (sequentialTime > 0 ? (double) sequentialTime / parallelTime : "N/A"));
        
        // Example 3: Caution - Stateful operations in parallel streams
        System.out.println("\nExample 3: Stateful operations (potential issues)");
        
        // Sequential accumulation (correct)
        List<Integer> sequentialResult = new ArrayList<>();
        numbers.stream()
                .limit(1000)
                .filter(n -> n % 100 == 0)
                .forEach(sequentialResult::add);
        
        System.out.println("Sequential result size: " + sequentialResult.size());
        
        // Parallel accumulation with shared mutable state (problematic)
        List<Integer> parallelResult = new ArrayList<>();
        numbers.parallelStream()
                .limit(1000)
                .filter(n -> n % 100 == 0)
                .forEach(parallelResult::add); // Not thread-safe!
        
        System.out.println("Parallel result size (using forEach): " + parallelResult.size());
        System.out.println("This might be incorrect due to thread safety issues!");
        
        // Correct way to collect results in parallel
        List<Integer> correctParallelResult = numbers.parallelStream()
                .limit(1000)
                .filter(n -> n % 100 == 0)
                .collect(Collectors.toList()); // Thread-safe collection
        
        System.out.println("Parallel result size (using collect): " + correctParallelResult.size());
        
        // Example 4: Thread-safe counters in parallel streams
        System.out.println("\nExample 4: Thread-safe counters");
        
        // Incorrect counter (not thread-safe)
        int[] counter = {0};
        numbers.parallelStream()
                .limit(1000)
                .filter(n -> n % 100 == 0)
                .forEach(n -> counter[0]++);
        
        System.out.println("Parallel counter (not thread-safe): " + counter[0]);
        
        // Correct counter using AtomicInteger (thread-safe)
        AtomicInteger atomicCounter = new AtomicInteger(0);
        numbers.parallelStream()
                .limit(1000)
                .filter(n -> n % 100 == 0)
                .forEach(n -> atomicCounter.incrementAndGet());
        
        System.out.println("Parallel counter (thread-safe): " + atomicCounter.get());
        
        // Example 5: When parallel streams might not help - small data sets
        System.out.println("\nExample 5: Small data sets");
        
        List<Integer> smallList = IntStream.rangeClosed(1, 100)
                .boxed()
                .collect(Collectors.toList());
        
        // Sequential processing
        start = Instant.now();
        long smallSequentialSum = smallList.stream()
                .mapToLong(Integer::longValue)
                .sum();
        end = Instant.now();
        sequentialTime = Duration.between(start, end).toMillis();
        
        System.out.println("Sequential sum (small list): " + smallSequentialSum);
        System.out.println("Sequential time: " + sequentialTime + " ms");
        
        // Parallel processing
        start = Instant.now();
        long smallParallelSum = smallList.parallelStream()
                .mapToLong(Integer::longValue)
                .sum();
        end = Instant.now();
        parallelTime = Duration.between(start, end).toMillis();
        
        System.out.println("Parallel sum (small list): " + smallParallelSum);
        System.out.println("Parallel time: " + parallelTime + " ms");
        System.out.println("For small data sets, parallel streams may be slower due to overhead!");
    }
    
    /**
     * Checks if a number is prime.
     * This is an intentionally inefficient implementation to demonstrate CPU-intensive tasks.
     */
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}