package com.softserve.academy.edu1.homework.hw04;

import java.util.Arrays;
import java.util.Scanner;

public class OddCounter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter first number");
            var first = scanner.nextInt();

            System.out.println("Please enter second number");
            var second = scanner.nextInt();

            System.out.println("Please enter third number");
            var third = scanner.nextInt();

            var oddsNumber = oddCounter(first, second, third);

            System.out.println("Odd number: " + oddsNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private static long oddCounter (int ... numbers) {
        return Arrays.stream(numbers).filter(i -> i % 2 == 0).count();
    }
}
