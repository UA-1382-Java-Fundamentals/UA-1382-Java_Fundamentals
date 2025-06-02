package com.softserve.academy.edu14;

import java.util.OptionalInt;
import java.util.Random;

public class SortedValue {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Unsorted random numbers:");
        random.ints(1, 100)
                .limit(5)
                .forEach(num -> System.out.println(num + " "));
        System.out.println("\nSorted random numbers:");

       OptionalInt max = random.ints(1, 100)
                .limit(5)
                .sorted()
                //.forEach(num -> System.out.println(num + " "));
                .max();
        System.out.println("Max value: " + max.orElse(-1));
    }
}

