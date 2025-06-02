package com.softserve.academy.edu14;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class RandomValueExample {
    public static void main(String[] args) {
        Stream<Integer> randomNumbers = Stream.generate(() -> (int) (Math.random() * 100))
                .limit(10); // Generate 10 random integers

        randomNumbers.forEach(System.out::println); // Print each random integer
//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
//        randomNumbers.forEach(num -> {
//            if (num % 2 == 0) {
//                System.out.println(num + " is even.");
//            } else {
//                System.out.println(num + " is odd.");
//            }
//        });
        LongStream randomLongs = LongStream.generate(() -> (long) (Math.random() * 100))
                .limit(10); // Generate 10 random long integers
        randomLongs.forEach(num -> {
            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        });
    }
}
