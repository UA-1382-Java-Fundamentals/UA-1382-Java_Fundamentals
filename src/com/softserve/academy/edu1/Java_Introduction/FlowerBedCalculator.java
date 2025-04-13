package com.softserve.academy.edu1.Java_Introduction;

import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {
        int radius;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the radius of the flower bed using the console");
        radius = sc.nextInt();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Area = " + area + "\nPerimeter = " + perimeter);
        sc.close();
    }
}
