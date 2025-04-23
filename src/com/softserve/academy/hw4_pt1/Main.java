/*
Write Java console application with method to find the smallest number among three integer numbers. Example of
output:

Input of the first number: 18.0
Input of the second number: 32.0
Input the third number: 54.0
The smallest number is 18.0
 */

package com.softserve.academy.hw4_pt1;

public class Main {
    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.setNumber1(obj.getNumber("Input Number 1:"));
        obj.setNumber2(obj.getNumber("Input Number 2:"));
        obj.setNumber3(obj.getNumber("Input Number 3:"));

        obj.defineCountOfOddNumbers(obj.getNumber1());
        obj.defineCountOfOddNumbers(obj.getNumber2());
        obj.defineCountOfOddNumbers(obj.getNumber3());

        obj.printResults("Input Number 1: ", obj.getNumber1());
        obj.printResults("Input Number 2: ", obj.getNumber2());
        obj.printResults("Input Number 3: ", obj.getNumber3());
        obj.printResults("The count of odd numbers is ", obj.getCount());

    }
}
