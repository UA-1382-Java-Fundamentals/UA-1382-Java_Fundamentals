package com.softserve.academy.edu1.Hw8.hw1;

public class CalculateNumbers {
    private double num1;
    private double num2;

    CalculateNumbers(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    protected double div() throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Divise by zero");
        }
        return getNum1() / getNum2();
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
}
