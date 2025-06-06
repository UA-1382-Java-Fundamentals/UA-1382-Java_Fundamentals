package com.softserve.academy.edu5;

import java.util.Scanner;

public class Calculate1 {
    public static void analyze(Scanner sc) {
        int[] arr = new int[5];
        System.out.println("Enter 5 integer number");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int Count = 0;
        int SecondPositiveNum = -1;
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                Count++;
                if (Count == 2) {
                    SecondPositiveNum = i;
                    break;
                }
            }
        }
        if (SecondPositiveNum != -1) {
            System.out.println("Second positive number is at position " + SecondPositiveNum);
        } else {
            System.out.println("There is no second positive number");
        }
        int minimal = arr[0];
        int minimalIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (arr[i] < minimal) {
                minimal = arr[i];
                minimalIndex = i;
            }
        }
            System.out.println("Minimum value is " + minimal + ",at position " + minimalIndex);

            int product = 1;
            boolean evenNum = false;
            for (int i = 0; i < 5; i++) {
                if (arr[i] != 0 && arr[i] % 2 == 0) {
                    product *= arr[i];
                    evenNum = true;
                }
            }
            if (evenNum) {
                System.out.println("Product of the even numbers is " + product);
            } else {
                System.out.println("No even numbers detected");
            }
        }
    }