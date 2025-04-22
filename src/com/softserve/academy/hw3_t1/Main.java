/*
Write a Java console application with methods that accept two numbers as arguments and
have the following names:

• getTotal - returns their sum;
• getAverage - returns their average;
• (*) static getNumber(String prompt) - allows input of numbers using Scanner with
messages and return number

Call these methods from the main() method and print the results. For example:

Enter the first number: 2
Enter the second number: 5
The sum of 2.0 and 5.0: 7.0
The average of 2.0 and 5.0: 3.5
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
