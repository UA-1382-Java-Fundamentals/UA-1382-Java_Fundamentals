package com.softserve.academy.homework1;

import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {
        int radius;
        double perimeter;
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input the radius of the flower bed");
        radius = scanner.nextInt();
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
        System.out.println("Flowerbed perimeter = " + perimeter);
        System.out.println("Flowerbed area = " + area);
    }
}
