package com.softserve.academy.edu03.practice;

import java.util.Scanner;

public class NumberOperations {

    public static double getTotal(double num1, double num2){
        return num1 + num2;
    }

    public static double getAverage(double num1, double num2){
        return (num1 + num2)/2.0;

    }
    public static double getNumber(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        var number1 = getNumber("Enter the first number");
        var number2 = getNumber("Enter the second number");

        var sum = getTotal(number1, number2);
        var everage = getAverage(number1, number2);

        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
        System.out.println("The average of " + number1 + " and " + number2 + " is " + everage);




    }




}
