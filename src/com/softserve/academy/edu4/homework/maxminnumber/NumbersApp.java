package com.softserve.academy.edu4.homework.maxminnumber;

import java.util.Scanner;

public class NumbersApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        MaxMinNumber nums = new MaxMinNumber();

        nums.userInput(scan);

        nums.maxNumber(nums.getA(), nums.getB(), nums.getC());
        nums.minNumber(nums.getA(), nums.getB(), nums.getC());

        nums.printMaxMin();

    }
}
