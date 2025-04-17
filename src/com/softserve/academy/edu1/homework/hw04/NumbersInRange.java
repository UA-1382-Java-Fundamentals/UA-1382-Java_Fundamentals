package com.softserve.academy.edu1.homework.hw04;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersInRange {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter first number");
            var first = scanner.nextDouble();

            System.out.println("Please enter second number");
            var second = scanner.nextDouble();

            System.out.println("Please enter third number");
            var third = scanner.nextDouble();

            System.out.println(isInRange(first, second, third) ? "Number(-s) not in range" : "All numbers in range");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static boolean isInRange(double ...numbers) {
        return Arrays.stream(numbers).anyMatch(n -> n < - 5 || n > 5);
    }
}
