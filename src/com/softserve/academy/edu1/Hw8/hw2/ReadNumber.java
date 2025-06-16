package com.softserve.academy.edu1.Hw8.hw2;

import java.util.Scanner;

public class ReadNumber {

    public static int readNumber(int start, int end) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter an integer between %d and %d: ", start, end);
        String input = sc.nextLine();

        try {
            int num = Integer.parseInt(input);
            if (num <= start || num >= end) {
                throw new Exception("Number not in range (" + start + ", " + end + ")");
            }
            return num;
        } catch (NumberFormatException e) {
            throw new Exception("Invalid format: not an integer");
        }
    }
}
