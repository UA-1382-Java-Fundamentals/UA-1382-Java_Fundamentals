package com.softserve.academy.edu1.practice.lesson3;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        int firstNumber = getNumber("Enter the first number: ");
        int secondNumber = getNumber("Enter the second number: ");

        int sum = getTotal(firstNumber, secondNumber);
        double average = getAverage(firstNumber, secondNumber);

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }

    public static int getTotal(int a, int b) {
        return a + b;
    }

    public static double getAverage(int a, int b) {
        return (a + b) / 2.0;
    }

    public static int getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
