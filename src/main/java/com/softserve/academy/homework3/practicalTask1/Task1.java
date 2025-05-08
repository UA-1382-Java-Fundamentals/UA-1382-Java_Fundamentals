package com.softserve.academy.homework3.practicalTask1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = console.nextInt();
        System.out.println("Enter second number");
        int secondNumber = console.nextInt();

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + getTotal(firstNumber,secondNumber));
        System.out.println("");
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + getAverage(firstNumber,secondNumber));
    }
    public static int getTotal(int number1, int number2){
        return number1 + number2;
    }
    public static double getAverage(int number1, int number2){
        return (number1 + number2) / 2.0;
    }
}
