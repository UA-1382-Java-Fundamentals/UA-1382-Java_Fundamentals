package softserve.academy.edu14.taskPractical2;

//2. For given collection
//List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
//calculate count, min, max, sum, for numbers and print all results

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SeparateOperations {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        long count = primes.stream()
                .count();

        OptionalInt min = primes.stream()
                .mapToInt(Integer::intValue)
                .min();

        OptionalInt max = primes.stream()
                .mapToInt(Integer::intValue)
                .max();

        Integer sum = primes.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.printf("Initial array of elements: %s\n", primes);
        System.out.println("===".repeat(20));
        System.out.printf("Number of elements: %d\n", count);
        System.out.printf("Minimal number: %s\n", min.getAsInt());
        System.out.printf("Maximal number: %s\n", max.getAsInt());
        System.out.printf("Sum of all elements: %s\n", sum);
    }
}
