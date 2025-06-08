package com.softserve.academy.edu1.homework5;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Please enter the month number: ");
        int month = sc.nextInt();

        if (month < 1 || month > 12)
            System.out.println("Invalid month number");
        System.out.println("The month has " + days[month - 1] + " days");
    }

}
