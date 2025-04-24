package com.softserve.academy.edu1.homework5.practice;

//Create an array of ten random integers using a random number generator. Output:
//the biggest number in the array;
//the sum of positive numbers;
//count the number of negative numbers.
//determine whether there are more negative or positive values in the array. If there are more negative values, output "There are more negative values in the array." Otherwise, output "There are more positive values in the array." If the counts are equal, output "There are an equal number of positive and negative values in the array.

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        Random random = new Random();
        int max = Integer.MIN_VALUE;
        int sumPositive = 0;
        int countNegative = 0;
        int countPositive = 0;


        // Generate random numbers and perform calculations
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(2001)-1000;
            if (randomNumbers[i] > max) {
                max = randomNumbers[i];
            }
            if (randomNumbers[i] > 0) {
                sumPositive += randomNumbers[i];
                countPositive++;
            } else if (randomNumbers[i] < 0) {
                countNegative++;
            }
        }
        System.out.println(Arrays.toString(randomNumbers));

        System.out.println("The biggest number in the array: " + max);
        System.out.println("The sum of positive numbers: " + sumPositive);
        System.out.println("Count of negative numbers: " + countNegative);

        if (countNegative > countPositive) {
            System.out.println("There are more negative values in the array.");
        } else if (countPositive > countNegative) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }

    }
}
