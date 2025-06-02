package com.softserve.academy.edu14;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * This class demonstrates various Java Stream API operations
 * and their execution flow using logging.
 */
public class Example {
    public static void main(String[] args) {
        // Example 1: Basic Stream Operations with Logging
        log("EXAMPLE 1: Basic Stream Operations with Logging - Demonstrating peek, filter, and count methods");
        IntStream stream = IntStream.range(1, 5);
        stream = stream.peek(i -> log("Method: peek - processing element", i))
                .filter(i -> {
                    log("Method: filter - evaluating condition i % 2 == 0 for element", i);
                    return i % 2 == 0;
                })
                .peek(i -> log("Method: peek - element passed filter", i));
        log("Method: count - invoking terminal operation");
        log("Method: count - result is", stream.count());
        log("");

        // Example 2: Parallel vs Sequential Stream
        log("EXAMPLE 2: Parallel vs Sequential Stream - Demonstrating parallel and sequential execution");
        log("Method: stream - Sequential Stream execution (default behavior):");
        IntStream.range(1, 5)
                .peek(i -> log("Method: peek (sequential) - processing element", i))
                .count();

        log("Method: parallel - Parallel Stream execution (multi-threaded processing):");
        IntStream.range(1, 5)
                .parallel()
                .peek(i -> log("Method: peek (parallel) - processing element", i))
                .count();
        log("");

        // Example 3: Different Ways to Create Streams
        log("EXAMPLE 3: Different Ways to Create Streams - Demonstrating Arrays.stream, Collection.stream, and Stream.of methods");
        // From array
        String[] array = {"Java", "Stream", "API"};
        Stream<String> streamFromArray = Arrays.stream(array);
        log("Method: collect (from array) - joining elements with Collectors.joining():", streamFromArray.collect(Collectors.joining(", ")));

        // From collection
        List<String> list = Arrays.asList("Java", "Stream", "API");
        Stream<String> streamFromCollection = list.stream();
        log("Method: collect (from collection) - joining elements with Collectors.joining():", streamFromCollection.collect(Collectors.joining(", ")));

        // Using Stream.of
        Stream<String> streamOf = Stream.of("Java", "Stream", "API");
        log("Method: collect (from Stream.of) - joining elements with Collectors.joining():", streamOf.collect(Collectors.joining(", ")));
        log("");

        // Example 4: More Stream Operations
        log("EXAMPLE 4: More Stream Operations - Demonstrating map, forEach, and reduce methods");
        List<String> words = Arrays.asList("Java", "Streams", "are", "powerful");

        // Map operation
        log("Method: map - Operation to convert strings to uppercase:");
        words.stream()
                .map(s -> {
                    log("Method: map - transforming element", s);
                    return s.toUpperCase();
                })
                .forEach(s -> log("Method: forEach - processing result", s));

        // Reduce operation
        log("Method: reduce - Operation to concatenate strings with hyphens:");
        Optional<String> reduced = words.stream()
                .reduce((s1, s2) -> {
                    String result = s1 + "-" + s2;
                    log("Method: reduce - combining elements", s1, "and", s2, "to", result);
                    return result;
                });
        log("Method: reduce - final result after all reductions:", reduced.orElse(""));
    }

    /**
     * Logs messages with timestamp and optional objects.
     * Adds a small delay to better visualize execution flow.
     */
    public static void log(Object... objects) {
        String s = LocalTime.now().toString();
        for (Object object : objects) {
            s += " - " + object.toString();
        }
        System.out.println(s);
        // putting a little delay so that we can see a clear difference
        // with parallel stream.
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
