package com.softserve.academy.edu13;

public class Task3 {
    public static boolean leapYear(int year) {
        return (year % 4 == 0) && ((year & 100) !=0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        int year = 2024;
        System.out.println(year + " is leap year: " + leapYear(year));
    }
}
