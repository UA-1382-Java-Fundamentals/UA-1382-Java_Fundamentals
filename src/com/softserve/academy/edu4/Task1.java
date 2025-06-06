package com.softserve.academy.edu4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double number1 = sc.nextDouble();

        System.out.println("Enter the second number");
double number2 = sc.nextDouble();

        System.out.println("Enter the third number");
        double number3 = sc.nextDouble();

        boolean number1Range = (number1 >= -5 && number1 <= 5);
        boolean number2Range = (number1 >= -5 && number2 <= 5);
        boolean number3Range = (number1 >= -5 && number3 <= 5);

        if (number1Range && number2Range && number3Range) {
            System.out.println("These number belong to the range of [-5,5]");
        } else {
            System.out.println("Not all of these numbers belong to the range of [-5,5]");
        }
        sc.close();
    }
}
