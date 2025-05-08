package com.softserve.academy.homework4.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Input three double numbers");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a >= -5 && a <= 5 && b >= -5 && b <= 5 && c >= -5 && c <= 5) {
            System.out.println("numberA = " + a + ", numberB = " + b + ", numberC = " + c + " belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5].");
        }
    }
}
