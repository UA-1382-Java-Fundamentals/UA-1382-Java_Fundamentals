package com.softserve.academy.edu1.homework3.Triangle;

public class TriangleCalc {
    public static void main(String[] args) {

        double a = TriangleArea.sideValue("Enter the value of a side: ");
        double b = TriangleArea.sideValue("Enter the value of b side: ");
        double c = TriangleArea.sideValue("Enter the value of c side: ");

        double s = TriangleArea.areaCalc(a,b,c);

        System.out.println("The area of the triangle is: " + s);
    }
}
