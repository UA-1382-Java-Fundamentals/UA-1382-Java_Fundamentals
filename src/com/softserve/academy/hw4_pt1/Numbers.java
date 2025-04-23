package com.softserve.academy.hw4_pt1;

import java.util.Scanner;

public class Numbers {
    private int number1;
    private int number2;
    private int number3;
    private int count = 0;

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getNumber3() {
        return number3;
    }

    public int getCount() {
        return count;
    }

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

    public void defineCountOfOddNumbers(int number) {
        if (number % 2 == 0)  {
            count++;
        }
    }

    void printResults(String text, int value) {
        System.out.println(text + value);
    }
}
