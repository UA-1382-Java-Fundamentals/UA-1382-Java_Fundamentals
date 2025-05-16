package com.softserve.academy.edu1.Hw5.Hw1;

public class MonthDays {
    private final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    MonthDays(){}
    public int getDays(int month) {
        if (month >= 1 && month <= 12) {
            return daysInMonth[month - 1];
        } else {
            throw new IllegalArgumentException("Invalid month number.");
        }
    }
}

