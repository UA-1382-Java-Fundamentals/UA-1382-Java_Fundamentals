package com.softserve.academy.edu14;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = Map.of(
                "Alice", 85,
                "Bob", 92,
                "Charlie", 78,
                "Diana", 90
        );
        scores.keySet().stream()
                .filter(name -> scores.get(name) >= 90)
                .forEach(System.out::println);

        int sum = scores.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Total score: " + sum);

        scores.entrySet().stream()
                .filter(entry -> entry.getValue() >= 90)
                .map(Map.Entry::getKey)
                .forEach(name -> System.out.println("High scorer: " + name));

        List<String> names = List.of("Alice", "Bob", "Charlie", "Diana");
        Map<String, Integer> nameLengths = names.stream()
                .collect(Collectors.toMap(
                        name -> name,
                        String::length
                ));

        nameLengths.forEach((name, length) ->
            System.out.println("Name: " + name + ", Length: " + length)
        );
    }
}
