package com.softserve.academy.edu1.homework3.Triangle;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class TriangleArea {

    public static int sideValue(String message){
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


    public static double areaCalc(double a, double b, double c) {
        var halfP = (a+b+c)/2;
        return sqrt(halfP*(halfP-a)*(halfP-b)*(halfP-c));
    }
}