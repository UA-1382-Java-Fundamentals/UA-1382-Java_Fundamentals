package com.softserve.academy.edu1.Exceptions.Homework_2;

import java.util.Scanner;

public class NumberReader {
    public static int readNumber(int start, int end) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try{
            int number = Integer.parseInt(input);
            if (number < start || number > end) {
                throw new Exception("Number out of range");
            }
            return number;
        } catch (NumberFormatException e) {
            throw new Exception("Invalid input. Please enter a valid number.");
        }
    }
}
