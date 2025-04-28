package com.softserve.academy.hw4_t1;

import java.util.Scanner;

public class Numbers {
    private double number1;
    private double number2;
    private double number3;
    private int count = 0;

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

    public void checkRange(double number) {
        if (number >= -5 && number <= 5) {
            count++;
        }
    }

    void printResults() {
        checkRange(number1);
        checkRange(number2);
        checkRange(number3);
        if (count == 3) {
            System.out.println("All three numbers belong to the range [-5, 5]");
        }
        else if (count > 0) {
            System.out.println("Not all three numbers belong to the range [-5, 5]");
        }
        else {
            System.out.println("None of all three numbers belong to the range [-5, 5]");
        }
    }
}
