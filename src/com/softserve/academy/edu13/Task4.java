package com.softserve.academy.edu13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task4 {
    //Method for days of the week
    public static void printWeekdayInfo(LocalDate date) {
        //Getting days of the week
        DayOfWeek originalDay = date.getDayOfWeek();
        DayOfWeek after6Month = date.plus(6, ChronoUnit.MONTHS).getDayOfWeek();
        DayOfWeek after12Month = date.plus(12, ChronoUnit.MONTHS).getDayOfWeek();

        System.out.println("Original date: " + date + " Day of week: " + originalDay);
        System.out.println("Date after 6 month: " + date.plusMonths(6) + " Day of week: " + after6Month);
        System.out.println("Date after 1 year: " + date.plusMonths(12) + " Day ow week: " + after12Month);
    }
    public static void main(String[] args) {
        //An object for my birthday
        LocalDate birthday = LocalDate.of(2009, 03, 04);
        printWeekdayInfo(birthday);//Calling method to print weekday
    }
}
