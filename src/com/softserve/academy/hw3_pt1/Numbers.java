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

    protected double getNumber(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    protected double getTotal(double numOne, double numTwo) {
        return numOne + numTwo;
    }

    protected double getAverage(double numOne, double numTwo) {
        return (numOne + numTwo) / 2;
    }

    protected void printResults(double numOne, double numTwo, double result) {
        System.out.println("The sum of " + numOne + " and " + numTwo + ": " + result);
    }
}
