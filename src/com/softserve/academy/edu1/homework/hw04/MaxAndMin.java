package com.softserve.academy.edu1.homework.hw04;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter first number");
            var first = scanner.nextInt();

            System.out.println("Please enter second number");
            var second = scanner.nextInt();

            System.out.println("Please enter third number");
            var third = scanner.nextInt();

            var max = findMax(first, second, third);
            var min = findMin(first, second, third);

            System.out.println("max: " + max + ", min: " + min);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static int findMin(int ...numbers) {
        return Arrays.stream(numbers).min().getAsInt();
    }

    private static int findMax(int ...numbers) {
        return Arrays.stream(numbers).max().getAsInt();
    }
}
