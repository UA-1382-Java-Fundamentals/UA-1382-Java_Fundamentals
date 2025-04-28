package com.softserve.academy.hw4_t2;

import java.util.Scanner;

public class Numbers {
    private int number1;
    private int number2;
    private int number3;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    public int getNumber(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public int findTheSmallestNumber() {
        return Math.min(Math.min(number1, number2), number3);
    }

    public int findTheBiggestNumber() {
        return Math.max(Math.max(number1, number2), number3);
    }

    void printResults(String text, double value) {
        System.out.println(text + value);
    }
}
