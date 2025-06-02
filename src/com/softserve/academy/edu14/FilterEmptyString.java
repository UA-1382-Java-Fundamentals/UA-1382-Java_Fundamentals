package com.softserve.academy.edu14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEmptyString {
    public static void main(String[] args) {
        //Alternative source of strings
        //Stream<String> strs = Stream.of("Hello", "", "World", null, "Java", "");

        List<String> strs = Arrays.asList("Hello", "  ", "World", null, "Java", "");
        List<String> filteredList = strs.stream()
                .filter(s -> s != null && !s.isBlank())
                // .collect(Collectors.toList());
                .toList();
        long count = filteredList.stream()
                .count();

        System.out.println("Count of non-empty strings: " + count);

        System.out.println("Filtered List: " + filteredList);
        System.out.println("Original List: " + strs);

        // Sample array with some empty strings and null values
        String[] strings = {"Hello", "", "World", null, "Java", ""};

        // Using Stream API to filter out empty strings
        String[] filteredStrings = Arrays.stream(strings)
                .filter(s -> s != null && !s.isEmpty())
                .toArray(String[]::new);

        // Print the filtered array
        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }
}
