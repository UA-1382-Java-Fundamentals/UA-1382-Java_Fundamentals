package com.softserve.academy.hw8_t2;

import java.util.Scanner;

public class Numbers {
    private final int[] numbers = new int[10];

    public void readNumber(int start, int end) throws IndexOutOfBoundsException, ArithmeticException {
        Scanner sc = new Scanner(System.in);

        int number;
        int tempNumber = 0;

        System.out.println("You will be asked to input 10 integer numbers from " + start + " to " + end + ", every next number should be bigger than previous");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input an integer number");
            number = sc.nextInt();
            if (number < 1 | number > 100) {
                throw new IndexOutOfBoundsException();
            } else if (number < tempNumber) {
                throw new ArithmeticException();
            } else {
                numbers[i] = number;
                // save a current number which will become a previous number in the next iteration
                tempNumber = numbers[i];
            }
        }
        sc.close();
    }
}
