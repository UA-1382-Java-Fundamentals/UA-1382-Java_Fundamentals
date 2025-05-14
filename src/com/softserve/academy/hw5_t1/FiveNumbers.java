package com.softserve.academy.hw5_t1;

import java.util.Scanner;

public class FiveNumbers {
    public int[] inputNumbers() {
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a number");
            numbers[i] = sc.nextInt();
        }

        return numbers;
    }

    public void calculateForFiveNumbers(int[] numbers) {
        int positionOfSecondPositiveNumber = 0;
        int countOfPositiveNumbers = 0;
        int minValue = numbers[0];
        int positionOfMinNumber = 1;
        int product = 1;

        // calculate position of second positive number
        for (int j = 0; j < 5; j++) {
            if (numbers[j] > 0) {
                countOfPositiveNumbers++;
                if (countOfPositiveNumbers == 2) {
                    positionOfSecondPositiveNumber = j;
                    break;
                }
            }
        }

        // calculate minimum value and its position in the array
        for (int k = 0; k < 5; k++) {
            if (numbers[k] < minValue) {
                minValue = numbers[k];
                positionOfMinNumber = k;
            }
        }

        //calculate the product of all entered even numbers (exclude 0 from even if entered by user)
        for (int l = 0; l < 5; l++) {
            if (numbers[l] % 2 == 0 && numbers[l] != 0) {
                product *= numbers[l];
            }
        }

        // print results
        // print position of second positive number
        if (countOfPositiveNumbers == 2) {
            System.out.println("Position of second positive number: " + positionOfSecondPositiveNumber);
        } else {
            System.out.println("There's no second positive number entered");
        }

        // print minimum value and its position in the array
        System.out.println("Minimum value: " + minValue);
        System.out.println("Its position in the array: " + positionOfMinNumber);

        //print the product of all entered even numbers
        System.out.println("The product of all entered even numbers (except 0 if it was entered): " + product);
    }
}
