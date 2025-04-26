package com.softserve.academy.edu1.Arrays_and_Loops.Homework_1;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер місяця від 1-12 місяців: ");
        int month = scanner.nextInt();

        int days = Month.getDaysInMonth(month);
        if (days != -1) {
            System.out.println("Кількість днів: " + days);
        } else {
            System.out.println("Невірний номер місяця!");
        }
    }
}