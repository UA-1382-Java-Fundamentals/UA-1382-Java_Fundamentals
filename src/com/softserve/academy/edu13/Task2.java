package com.softserve.academy.edu13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Task2 {
    public static boolean validDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy").withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + validDate("01.01.2025"));
        System.out.println("Result: " + validDate("00.01.2025"));
        System.out.println("Result: " + validDate("31.31.2025"));
    }
}
