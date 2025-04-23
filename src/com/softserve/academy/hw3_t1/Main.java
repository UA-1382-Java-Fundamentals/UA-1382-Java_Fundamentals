/*
Write a Java console application with methods that accept two numbers as arguments and
have the following names:

• getTotal - returns their sum;
• getAverage Write Java console application with method to calculate the area of a triangle. Example of output:

Input Side 1: 10.0
Input Side 2: 12.0
Input Side 3: 15.0
The area of the triangle is 59.81
 */

package com.softserve.academy.hw3_t1;

public class Main {
    public static void main(String[] args) {
        Triangle obj = new Triangle();

        obj.setSide1(obj.getSide("Input Side 1:"));
        obj.setSide2(obj.getSide("Input Side 2:"));
        obj.setSide3(obj.getSide("Input Side 3:"));

        obj.printResults("Input Side 1: ", obj.getSide1());
        obj.printResults("Input Side 2: ", obj.getSide2());
        obj.printResults("Input Side 3: ", obj.getSide3());
        obj.printResults("The area of the triangle is ", obj.calculateArea());

    }
}
