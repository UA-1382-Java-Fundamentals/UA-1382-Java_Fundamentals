package com.softserve.academy.hw5_t1;

import java.util.Scanner;

public class TenNumbers {
    public int[] inputNumbers() {
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a number");
            numbers[i] = sc.nextInt();
        }

        return numbers;
    }

    public void calculateForTenNumbers(int[] numbers) {
        int sum = 0;
        int product = 1;
        boolean negativeNumberExists = false;

        // calculate sum
        for (int j = 0; j < 5; j++) {
            if (numbers[j] > 0) {
                sum += numbers[j];
            }
        }

        // define if there's negative numbers in last five numbers
        for (int i = 5; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negativeNumberExists = true;
                break;
            }
        }

        // if there's negative numbers in last five numbers, calculate product
        if (negativeNumberExists) {
            for (int i = 5; i < numbers.length; i++) {
                if (numbers[i] < 0) {
                    product *= numbers[i];
                }
            }
        }

        if (sum > 0) {
            System.out.println("The sum of the first five elements if they are positive: " + sum);
        } else if (product > 0) {
            System.out.println("The product of the last five elements if they are negative: " + product);
        }
    }



}
