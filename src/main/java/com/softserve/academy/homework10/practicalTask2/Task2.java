package com.softserve.academy.homework10.practicalTask2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        String input = "1, 2, 3, 4, 4, 5, 6, 6, 7, 8";
        String[] fragments = input.split(",");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(fragments));
        System.out.println(set);
    }
}
