package com.softserve.academy.edu8;

import java.util.Scanner;

public class Task2 {
    //Method to read a number from user within the range
    public static int readNum(int start, int end, Scanner sc ) {
        System.out.printf("Enter a number in range of (%d, %d) ", start, end);
        String input = sc.nextLine();
        try {
            int num = Integer.parseInt(input);//Converting input into an integer
            //Checking if input is in range
            if (num <= start || num >= end) {
                throw new IllegalArgumentException("The number is not in valid range");
            }
            return num;
        } catch (NumberFormatException e) {
            //In case the number is not valid
            throw new IllegalArgumentException("Invalid number format");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Store numbers
        int[] numbers = new int[10];
        int start = 1;
        int end = 100;

        System.out.println("Enter 10 numbers which increase, a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100");

        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    //Read valid number
                    numbers [i] = readNum(start, end, sc);
                    start = numbers[i];
                    break;//Exit loop when the valid number is entered
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
        //Displaying successfully entered numbers
        System.out.println("Successfully entered numbers: ");
        for (int num : numbers) {
            System.out.println(num);
        }
        sc.close();
    }
}