package com.softserve.academy.edu1.Introduction_To_OOP.Homework_1;

import java.util.Scanner;

public class TriangleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Side 1: ");
        double a = scanner.nextDouble();

        System.out.print("Input Side 2: ");
        double b = scanner.nextDouble();

        System.out.print("Input Side 3: ");
        double c = scanner.nextDouble();

        Triangle triangle = new Triangle(a, b, c);

        double area = triangle.calculateArea();

        System.out.printf("The area of the triangle is %.2f\n", area);
        scanner.close();


    }
}
