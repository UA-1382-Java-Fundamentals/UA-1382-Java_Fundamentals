/*
Write a program that prompts the user to input three integer numbers.

The program should determine the maximum and minimum values among the three numbers and output them to the console.

 */

package com.softserve.academy.hw4_t2;

public class Main {
    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.setNumber1(obj.getNumber("Input Number 1:"));
        obj.setNumber2(obj.getNumber("Input Number 2:"));
        obj.setNumber3(obj.getNumber("Input Number 3:"));

        obj.printResults("The smallest number is ", obj.findTheSmallestNumber());
        obj.printResults("The biggest number is ", obj.findTheBiggestNumber());

    }
}
