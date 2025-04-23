package com.softserve.academy.edu1.homework3.quiz2;

public class DigitSumCalculator {
    public static int calculateDigitSum(Integer number) {
        if (number >= 100 && number <= 999) {
            int lastNumber = number % 10;
            int middleNumber = (number % 100) / 10;
            int firstNumber = (number - (lastNumber + middleNumber * 10)) / 100;
            return lastNumber + middleNumber + firstNumber;
        } else {
            // Handle the error if the number is not three digits
            throw new IllegalArgumentException("The input number is not a three-digit number.");
        }
    }
}