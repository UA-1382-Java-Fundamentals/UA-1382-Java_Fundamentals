package com.softserve.academy.edu1.Exceptions.Homework_2;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int previous = 1;

        for (int i = 0; i < 10; ) {
            System.out.print("Number " + (i + 1) + " (>" + previous + " і < 100): ");
            try {
                int number = NumberReader.readNumber(previous + 1, 99);

                numbers[i] = number;
                previous = number;
                i++;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Input number:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}