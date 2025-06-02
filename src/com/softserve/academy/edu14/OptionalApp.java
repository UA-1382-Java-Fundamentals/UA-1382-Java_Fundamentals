package com.softserve.academy.edu14;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        Integer value1 = null;
        Integer value2 = 10;
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value2);
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());
        System.out.println("Sum of values: " + sum(a, b));
    }

    public static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        Integer valueA = a.orElse(0);// If a is empty, use 0
       // Integer valueB = b.get();
        Integer valueB = b.orElse(0); // If b is empty, use 0
        return valueA + valueB;
    }
}

