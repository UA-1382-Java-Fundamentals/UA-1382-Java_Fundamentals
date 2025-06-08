package com.softserve.academy.edu1.homework5.task2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the number(" + (i+1) + "/10):");
            int n = sc.nextInt();
            arr[i] = n;
        }
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }

        int product = 1;
        for (int i = 5; i < 10; i++) {
            product *= arr[i];
        }

        if (sum > 0) {
            System.out.println("The sum of the array is: " + sum);
        }else{
            System.out.println("The product of the array is: " + product);
        }
    }
}
