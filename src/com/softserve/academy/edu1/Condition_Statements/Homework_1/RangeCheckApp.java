package com.softserve.academy.edu1.Condition_Statements.Homework_1;

import java.util.Scanner;

public class RangeCheckApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        if (num1 >= -5 && num1 <= 5 && num2 >= -5 && num2 <= 5 && num3 >= -5 && num3 <= 5) {
            System.out.println("All numbers are in the range [-5; 5]");
        } else {
            System.out.println("Not all numbers are in the range [-5; 5]");
        }
        scanner.close();

    }
}
