package com.softserve.academy.homework14.practicalTask2;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        var statistics = primes.stream()
                .mapToInt(x -> x)
                .summaryStatistics();
        System.out.println("Count = " + statistics.getCount());
        System.out.println("Sum = " + statistics.getSum());
        System.out.println("Average = " + statistics.getAverage());
        System.out.println("Max = " + statistics.getMax());
        System.out.println("Min = " + statistics.getMin());
    }
}
