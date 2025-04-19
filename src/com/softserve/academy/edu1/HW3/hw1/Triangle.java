package com.softserve.academy.edu1.HW3.hw1;

import java.util.Scanner;


public class Triangle {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Side 1: ");
        double a= input.nextDouble();
        System.out.print("Input Side 2: ");
        double b= input.nextDouble();
        System.out.print("Input Side 3: ");
        double c= input.nextDouble();
        System.out.println("Area is: "+area(a,b,c));
    }
    public static double area(double a, double b, double c) {
        double p = perimeter(a,b,c)/2;
         Math.sqrt(p*(p-a)*(p-c));
        return Math.sqrt(p*(p-a)*(p-c)*(p-b));
    }
    public static double perimeter(double a, double b, double c) {
        return a+b+c;
    }
}
