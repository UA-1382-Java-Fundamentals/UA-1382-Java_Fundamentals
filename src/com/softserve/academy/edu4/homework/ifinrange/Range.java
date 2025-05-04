package com.softserve.academy.edu4.homework.ifinrange;

import java.util.Scanner;


//Write a program that prompts the user to input three double numbers. The program
//should check if all threenumbers fall within the range of -5 and 5 (inclusive).
//If all three numbers are within this range, the program should output a message
//indicating that they belong to the range [-5, 5]. If any of the numbers are outside
//the specified range, the program should output a message indicating that not all numbers
//belong to the range [-5, 5]. Please note that the range includes the values -5 and 5 as well.


public class Range {

    public Range() {
    }

    public double inputNumber(Scanner scan, String prompt) {
        System.out.println(prompt);
        return scan.nextDouble();


    }

    public void checkRange(double n) {
        if (n > 5 || n < -5) {
            System.out.println("Not all numbers belong to the range [-5, 5]");
            System.exit(0);
        }
    }
}
