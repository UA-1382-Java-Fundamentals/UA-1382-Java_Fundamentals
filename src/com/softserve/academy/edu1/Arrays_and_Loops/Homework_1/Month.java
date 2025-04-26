package com.softserve.academy.edu1.Arrays_and_Loops.Homework_1;

public class Month {
    static int getDaysInMonth(int month) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month >= 1 && month <= 12) {
            return daysInMonth[month - 1];
        } else {
            return -1;
        }
    }
}
