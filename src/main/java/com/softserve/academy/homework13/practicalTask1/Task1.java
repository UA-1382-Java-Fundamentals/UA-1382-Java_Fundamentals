package com.softserve.academy.homework13.practicalTask1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

import static java.time.DayOfWeek.MONDAY;

public class Task1 {
    public static void main(String[] args) {
        Locale ukr = new Locale("uk", "ua");
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE").localizedBy(ukr);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.format(formatter));

        System.out.println(date.with(TemporalAdjusters.firstInMonth(MONDAY)));
    }
}
