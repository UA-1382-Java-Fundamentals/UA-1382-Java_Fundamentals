package com.softserve.academy.edu1.Functional_interfaces;

import java.time.LocalDate;

public class BirthdayDays {

    public static void printWeekdays(LocalDate birthday) {
        System.out.println("Original day: " + birthday.getDayOfWeek());

        LocalDate plus6Months = birthday.plusMonths(6);
        System.out.println("After 6 months: " + plus6Months.getDayOfWeek());

        LocalDate plus12Months = birthday.plusMonths(12);
        System.out.println("After 12 months: " + plus12Months.getDayOfWeek());
    }
}