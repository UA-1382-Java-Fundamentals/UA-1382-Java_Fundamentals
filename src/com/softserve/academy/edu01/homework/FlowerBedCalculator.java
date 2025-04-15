package com.softserve.academy.edu01.homework;

//Create a class named FlowerBedCalculator.
//In the main() method, declare a variable int radius and prompt
// the user to input the radius of the flower bed using the console.
//Calculate the perimeter of the circle using the
// formula perimeter = 2 * Math.PI * radius.
//
//   Calculate the area of the circle using the
//   formula area = Math.PI * radius * radius.
//Output the calculated perimeter and area to the console.

import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the flower bed:");
        int radius = sc.nextInt();

        var perimeter = 2 * Math.PI * radius;
        var area = 2 * Math.PI * radius * radius;
        sc.close();

        System.out.println("Perimeter of the flower bed = " + perimeter);
        System.out.print("Area of the flower bed = " + area);

    }
}
