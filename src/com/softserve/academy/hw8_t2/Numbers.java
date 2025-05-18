package com.softserve.academy.hw8_t2;

import java.util.Scanner;

public class Numbers {
    // // Inputs 10 integers from the user between "start" and "end" integers with validation
    public int[] readNumbers(int start, int end) {
        int[] tenNumbers = new int[10];
        int number;
        int tempNumber = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("You will be asked to input 10 integer numbers from " + start + " to " + end + ", every next number should be bigger than previous");

        for (int i = 0; i < tenNumbers.length; i++) {
            System.out.println("Input an integer number #" + (i+1));
            number = sc.nextInt();
            System.out.println(tempNumber);
            if (number < 1 | number > 100) {
                throw new IndexOutOfBoundsException();
            } else if (number <= tempNumber) {
                throw new ArithmeticException();
            } else {
                // save a current number which will become a previous number in the next iteration
                tempNumber = number;
                tenNumbers[i] = number;

            }
        }

        sc.close();
        return tenNumbers;
    }
}