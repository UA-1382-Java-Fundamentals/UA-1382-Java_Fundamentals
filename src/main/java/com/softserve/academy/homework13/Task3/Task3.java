package com.softserve.academy.homework13.Task3;

import java.time.LocalDate;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        var scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        LocalDate date = LocalDate.of(year, 1 ,1);
        System.out.println(year + " is a leap year? " + isLeapYear(date));
    }

    static boolean isLeapYear(LocalDate date){
        int year = date.getYear();
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
