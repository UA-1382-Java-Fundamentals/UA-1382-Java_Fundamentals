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
The sum of 2.0 and 5.0: 3.5
 */

package com.softserve.academy.hw3_pt1;

public class Main {
    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.setNumberOne(obj.getNumber("Enter the first number:"));
        obj.setNumberTwo(obj.getNumber("Enter the second number:"));

        obj.printResults(obj.getNumberOne(), obj.getNumberTwo(), obj.getTotal(obj.getNumberOne(), obj.getNumberTwo()));
        obj.printResults(obj.getNumberOne(), obj.getNumberTwo(), obj.getAverage(obj.getNumberOne(), obj.getNumberTwo()));

    }
}
