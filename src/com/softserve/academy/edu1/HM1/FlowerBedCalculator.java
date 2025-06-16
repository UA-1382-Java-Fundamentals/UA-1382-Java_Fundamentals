package com.softserve.academy.edu1.HM1;


import java.util.Scanner;

public class FlowerBedCalculator {
    public static  void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radious of Flower Bed: ");
        int radius = Integer.parseInt(scan.nextLine());

        Perimeter(radius);
        System.out.println("Perimeter:"+Perimeter(radius));

        Area(radius);
        System.out.println("Area:"+Area(radius));


    }

    public static double Perimeter(int radius) {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    public static double Area(int radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

}
