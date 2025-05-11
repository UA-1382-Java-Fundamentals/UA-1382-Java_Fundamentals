package com.softserve.academy.edu1.practice.lesson4;

import java.util.Scanner;

public class WeekdayTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = scanner.nextInt();

        String[] englishDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] ukrainianDays = {"Понеділок", "Вівторок", "Середа", "Четвер", "П’ятниця", "Субота", "Неділя"};

        if (day >= 1 && day <= 7) {
            System.out.println(englishDays[day - 1] + " / " + ukrainianDays[day - 1]);
        } else {
            System.out.println("Invalid day number.");
        }
    }
}
