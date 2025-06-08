package softserve.academy.edu14.taskPractical1;

//1. Suppose you have next list
//List<String> list = Arrays.asList("bla", "", "simp",
//"", "second", "third", "third", "sec", "blablabla");
//• Print how many empty strings are in this list
//• Remove all empty Strings from list and print the result
//• Convert String to uppercase and Join them with coma. Print the result

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "  ", "second", "third", "third", "sec", "blablabla");
        System.out.println("Initial list:\n" + list);
        System.out.println("===".repeat(20));

        long emptyCount = list.stream()
                .filter(String::isBlank)
                .count();
        System.out.printf("Empty elements: %d\n", emptyCount);
        System.out.println("===".repeat(20));

        List<String> nonEmptyList = list.stream()
                .filter(string -> !string.isBlank())
                .toList();
        System.out.println("Get rid of empty elements: \n" + nonEmptyList);
        System.out.println("===".repeat(20));

        String allUpperString = list.stream()
                .filter(string -> !string.isBlank())
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));

        System.out.println("Convert string to upper case, separate by coma:\n" + allUpperString);
    }
}
