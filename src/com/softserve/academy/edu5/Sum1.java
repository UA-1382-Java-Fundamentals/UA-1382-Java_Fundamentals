package com.softserve.academy.edu5;

import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array(sc);
    }
    public static void Array(Scanner sc) {
        int[] arr = new int[10];
        boolean FirstFiveNumbers = true;

        System.out.println("Enter your ten integers");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (i < 5 && arr[i] <= 0) {
                FirstFiveNumbers = false;

            }
        }
        System.out.println("FirstFiveNumbers = " + FirstFiveNumbers);
        if (FirstFiveNumbers) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += arr[i];
            }
            System.out.println("Sum of the first five integers is " + sum);
        } else {
            int product = 1;
            for (int i = 5; i < 10; i++) {
                product *= arr[i];
            }
            System.out.println("Product of the last five integers is " + product);
        }
    }
}
