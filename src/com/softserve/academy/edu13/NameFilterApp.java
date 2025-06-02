package com.softserve.academy.edu13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NameFilterApp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");
        Predicate<String> startsWithA = name -> name.startsWith("A");
        List<String> filteredNames = filterNames(names, startsWithA);
        printNames(filteredNames);
    }
    // Method to filter names based on predicate
    public static List<String> filterNames(List<String> names, Predicate<String> condition) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (condition.test(name)) {
                result.add(name);
            }
        }
        return result;
    }
    // Method to print names
    public static void printNames(List<String> names) {
        System.out.println("Filtered names: " + names);
    }
}
