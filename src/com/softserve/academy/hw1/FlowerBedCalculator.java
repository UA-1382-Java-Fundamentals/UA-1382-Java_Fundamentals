package com.softserve.academy.hw1;

import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {
        int radius;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the flower bed");
        radius = input.nextInt();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
