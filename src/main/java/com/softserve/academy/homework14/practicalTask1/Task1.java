package com.softserve.academy.homework14.practicalTask1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        System.out.println("List of elements: " + list);
        long countEmpty = list.stream()
                .filter(s -> s.isEmpty())
                .count();
        System.out.println("There are empty elements: " + countEmpty);
        List<String> withoutEmpty = list.stream()
                .filter(s -> !s.isEmpty())
                .toList();
        System.out.println("List without empty elements: " + withoutEmpty);
        String joinedUppersCase = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println("List of elements in upper case: " + joinedUppersCase);

    }
}
