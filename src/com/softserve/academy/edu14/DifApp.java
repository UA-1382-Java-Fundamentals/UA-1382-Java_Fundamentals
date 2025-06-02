package com.softserve.academy.edu14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DifApp {
    public static void main(String[] args) {
//        List<List<String>> listOfLists = List.of(
//            List.of("apple", "banana", "cherry"),
//            List.of("date", "elderberry", "fig"),
//            List.of("grape", "honeydew")
//        );
//
//        Stream<List<String>> streamOfLists = listOfLists.stream().map(list ->list);
//        streamOfLists.forEach(System.out::println);
//
//        Stream<String> flatStream = listOfLists.stream()
//            .flatMap(List::stream); // Flatten the stream of lists into a stream of strings
//        flatStream.forEach(System.out::println);

        List<String> str = List.of("It is fruits an apple", "banana", "cherry");
        List<String> words = str.stream()
                .flatMap(word -> Arrays.stream(word.split(" ")))
                .toList();// Split each string into characters

        System.out.println("Flattened list of characters: " + words);
    }
}
