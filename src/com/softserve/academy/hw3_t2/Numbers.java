package com.softserve.academy.hw3_t2;

import java.util.Scanner;

public class Numbers {
    private double number1;
    private double number2;
    private double number3;

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public double getNumber3() {
        return number3;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void setNumber3(double number3) {
        this.number3 = number3;
    }

    public double getNumber(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public double findTheSmallestNumber() {
        if (number1 <= number2 && number1 <= number3)  {
            return number1;
        } else if (number2 <= number1 && number2 <= number3) {
            return number2;
        }
        else return number3;
    }

    void printResults(String text, double value) {
        System.out.println(text + value);
    }
}
