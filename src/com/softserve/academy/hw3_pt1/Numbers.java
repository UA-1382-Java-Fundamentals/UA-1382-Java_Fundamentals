package com.softserve.academy.hw3_pt1;

import java.util.Scanner;

public class Numbers {
    private double numberOne;
    private double numberTwo;

    public double getNumberOne() {
        return numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    double getNumber(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    double getTotal() {
        return numberOne + numberTwo;
    }

    double getAverage() {
        return (numberOne + numberTwo) / 2;
    }

    void printResults(String text, double numOne, double numTwo, double result) {
        System.out.println(text + numOne + " and " + numTwo + ": " + result);
    }
}
