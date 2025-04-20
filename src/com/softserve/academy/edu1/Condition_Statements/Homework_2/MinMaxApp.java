package com.softserve.academy.edu1.Condition_Statements.Homework_2;

import java.util.Scanner;

public class MinMaxApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();

        int min = Math.min(num1, Math.min(num2, num3));
        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        scanner.close();
    }
}
