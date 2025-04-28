package com.softserve.academy.edu1.homework.lesson3;
public class TriangleArea {

    public static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        double side1 = 10;
        double side2 = 12;
        double side3 = 15;

        System.out.println("Input Side 1: " + side1);
        System.out.println("Input Side 2: " + side2);
        System.out.println("Input Side 3: " + side3);

        double area = calculateArea(side1, side2, side3);

        System.out.printf("The area of the triangle is %.2f\n", area);
    }
}
