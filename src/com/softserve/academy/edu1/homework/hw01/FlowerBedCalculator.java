package com.softserve.academy.edu1.homework.hw01;

import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter radius of the circle");

            int radius = scanner.nextInt();

            double perimeter = calculatePerimeter(radius);
            double area = calculateArea(radius);

            System.out.println(String.format("Perimeter: %.3f, area: %.3f", perimeter, area));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static double calculatePerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    private static double calculateArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
