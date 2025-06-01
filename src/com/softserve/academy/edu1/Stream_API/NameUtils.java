package com.softserve.academy.edu1.Stream_API;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameUtils {
    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .map(Employee::getName)
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}