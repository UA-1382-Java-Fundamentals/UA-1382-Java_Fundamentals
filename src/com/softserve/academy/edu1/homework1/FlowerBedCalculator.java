package com.softserve.academy.edu1.homework1;

import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the radius of the flower bed: ");
        var radius = sc.nextDouble();
        sc.close();

        var perimeter = 2 * Math.PI * radius;
        var area = Math.PI * radius * radius;

        System.out.println("The perimeter of the flower bed is " + perimeter);
        System.out.println("The area of the flower bed is " + area);
    }
}
