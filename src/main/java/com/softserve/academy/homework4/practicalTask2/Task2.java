package com.softserve.academy.homework4.practicalTask2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week.");
        int dayNumber = scanner.nextInt();

        String day = switch (dayNumber){
            case 1 -> "Понеділок, Monday";
            case 2 -> "Вівторок, Tuesday";
            case 3 -> "Середа, Wednesday";
            case 4 -> "Четвер, Thursday";
            case 5 -> "Пʼятниця, Friday";
            case 6 -> "Субота, Saturday";
            case 7 -> "Неділя, Sunday";
            default -> "Wrong  number of the day of the week.";
        };
        System.out.println(day);
    }
}
