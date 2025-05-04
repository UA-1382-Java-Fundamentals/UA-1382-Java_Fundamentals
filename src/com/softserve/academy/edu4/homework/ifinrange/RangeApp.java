package com.softserve.academy.edu4.homework.ifinrange;

import java.util.Scanner;

public class RangeApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Range firstRange = new Range();

        double a = firstRange.inputNumber(scan, "Input first number ");
        firstRange.checkRange(a);

        double b = firstRange.inputNumber(scan, "Input second number ");
        firstRange.checkRange(b);

        double c = firstRange.inputNumber(scan, "Input third number ");
        firstRange.checkRange(c);

        System.out.println("All numbers belong to the range [-5, 5]");

    }
}
