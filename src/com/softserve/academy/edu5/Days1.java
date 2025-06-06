package com.softserve.academy.edu5;

import java.util.Scanner;

public class Days1 {
    public static void calculateNumofDays(Scanner sc) {
int[] MonthDays = {31,28,31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Enter the number of a month");
        int month = sc.nextInt();
        if (month >=1 && month <=12){
            System.out.println("Days in month number " + month + " is " + MonthDays[month -1]);
        } else {
            System.out.println("There is no month with such a number");
        }
    }
}
