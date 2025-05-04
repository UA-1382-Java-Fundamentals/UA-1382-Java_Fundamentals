package com.softserve.academy.edu4.homework.maxminnumber;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

//Write a program that prompts the user to input three integer numbers. The program should determine the
//maximum and minimum values among the three numbers and output them to the console.

public class MaxMinNumber {
    private int a;
    private int b;
    private int c;

    public MaxMinNumber(){
    }

    public void userInput(@NotNull Scanner scan) {
        System.out.println("Input first number: ");
        this.a = scan.nextInt();

        System.out.println("Input second number: ");
        this.b = scan.nextInt();

        System.out.println("Input third number: ");
        this.c = scan.nextInt();
    }

    public int getC() {
        return c;
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }


    public int maxNumber(int a, int b, int c) {

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public int minNumber(int a, int b, int c) {

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public void printMaxMin(){
        System.out.println("Maximum value is: " + maxNumber(a, b, c));
        System.out.println("Minimum value is: " + minNumber(a, b, c));
    }


}


