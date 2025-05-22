package com.softserve.academy.edu1.Functional_interfaces;

public class LeapYearChecker {

    public static boolean isLeap(int year) {
        return java.time.Year.isLeap(year);
    }
}