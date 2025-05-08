package com.softserve.academy.homework3.Task2;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();
        int smallestNumber = Math.min(firstNumber,Math.min(secondNumber,thirdNumber));
        System.out.println("The smallest number is " + smallestNumber);
    }
}
