package com.softserve.academy.homework13.practicalTask2;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import static java.time.DayOfWeek.MONDAY;

public class Task2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date.with(TemporalAdjusters.firstInMonth(MONDAY)));
    }
}
