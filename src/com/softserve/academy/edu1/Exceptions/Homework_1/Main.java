package com.softserve.academy.edu1.Exceptions.Homework_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.println("Enter second number: ");
            double b = scanner.nextDouble();
            double result = DivisionApp.div(a, b);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}

