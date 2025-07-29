package com.softserve.academy.homework13.Task2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Task2 {
    public static void main(String[] args) {


        System.out.println(isValidDate("02.29.2024"));
        System.out.println(isValidDate("29.02.2024"));
        System.out.println(isValidDate("02.31.2024"));
        System.out.println(isValidDate("Feb.31.2024"));
    }
    static boolean isValidDate(String dateString) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "MM.dd.yyyy"
        );
        LocalDate date;
        try {
            date = LocalDate.parse(dateString,formatter);
        } catch (DateTimeParseException e) {
            return false;
        }
        return dateString.equals(date.format( formatter));
    }


}
