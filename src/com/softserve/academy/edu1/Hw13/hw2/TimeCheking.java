package com.softserve.academy.edu1.Hw13.hw2;

public class TimeCheking {
    public static boolean isValidDate(String date) {

        if (!date.matches("^\\d{2}\\.\\d{2}\\.\\d{2}$")) {
            return false;
        }

        String[] parts = date.split("\\.");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);//нема сенсу перевіряти,бо по факту вже перевірений рядком вище[6-8]

        if (month < 1 || month > 12) {
            return false;
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (day < 1 || day > daysInMonth[month - 1]){
            return false;
        }else {
        return true;
        }


    }
}
