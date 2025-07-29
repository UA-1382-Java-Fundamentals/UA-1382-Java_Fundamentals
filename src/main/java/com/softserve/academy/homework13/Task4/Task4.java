package com.softserve.academy.homework13.Task4;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        LocalDate birthday = getBirthday();
        printInfo(birthday);
    }

    static void printInfo(LocalDate date){
        Locale ukr = new Locale("uk", "ua");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy").localizedBy(ukr);
        DateTimeFormatter formatterOfDayOfTheWeek = DateTimeFormatter.ofPattern("EE").localizedBy(ukr);
        System.out.println("Your birthday is " + date.format(formatter) + ".");
        System.out.println("Day of the week: " + date.format(formatterOfDayOfTheWeek) + ".");
        LocalDate dayInSixMonths = date.plusMonths(6);
        System.out.println("Your birthday will be in six months: " + dayInSixMonths.format(formatterOfDayOfTheWeek) + ".");
        LocalDate dayInTwelveMonths = date.plusMonths(12);
        System.out.println("Your birthday will be in twelve months: " + dayInTwelveMonths.format(formatterOfDayOfTheWeek) + ".");
    }
    static LocalDate getBirthday(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthday");
        System.out.println("Year: ");
        int year = scanner.nextInt();
        System.out.println("Month: ");
        int month = scanner.nextInt();
        System.out.println("Day: ");
        int day = scanner.nextInt();
        return LocalDate.of(year,month,day);
    }
}
