/*
Write a program that prompts the user to input three double numbers.

The program should check if all three
numbers fall within the range of -5 and 5 (inclusive).

If all three numbers are within this range, the program should
output a message indicating that they belong to the range [-5, 5].

If any of the numbers are outside the specified range,
the program should output a message indicating that not all numbers belong to the range [-5, 5].

Please note that the
range includes the values -5 and 5 as well.


 */

package com.softserve.academy.hw4_t1;

public class Main {
    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.setNumber1(obj.getNumber("Input Number 1:"));
        obj.setNumber2(obj.getNumber("Input Number 2:"));
        obj.setNumber3(obj.getNumber("Input Number 3:"));

        obj.printResults();

    }
}
