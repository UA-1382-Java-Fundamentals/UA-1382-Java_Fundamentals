package com.softserve.academy.edu1.Hw13.hw4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2006, 2, 14);
        System.out.println("Original date: " + birthday + " — " + birthday.getDayOfWeek());

        LocalDate addSixMonths = birthday.plusMonths(6);
        System.out.println("Add six months: " + addSixMonths+ " - " + addSixMonths.getDayOfMonth()+ " - " + addSixMonths.getDayOfWeek());

        LocalDate add12Months = birthday.plusMonths(12);
        System.out.println("Add 12 month:" +add12Months +" - " + add12Months.getDayOfMonth()+ " - " + add12Months.getDayOfWeek());
    }
}
