package com.softserve.academy.hw5_t1;

import java.util.Scanner;

public class Month {
    enum Months {
        JAN("January"),
        FEB("February"),
        MAR("March"),
        APR("April"),
        MAY("May"),
        JUN("June"),
        JUL("July"),
        AUG("August"),
        SEP("September"),
        OCT("October"),
        NOV("November"),
        DEC("December");

        Months(String month) {
        }

    }

    private String inputMonth;

    public String getInputMonth() {
        return inputMonth;
    }

    public void setInputMonth(String inputMonth) {
        this.inputMonth = inputMonth;
    }

    public String inputMonth() {
        System.out.println("Input month (JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC)");
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        return String.valueOf(Months.valueOf(temp));
    }

    public void outputNumberOfDays(String inputMonth) {
        int[] MonthAndDays;

        if (inputMonth.equals("FEB")) {
            MonthAndDays = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28};
        } else if (inputMonth.equals("APR") || inputMonth.equals("JUN") || inputMonth.equals("SEP") || inputMonth.equals("NOV")) {
            MonthAndDays = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        } else {
            MonthAndDays = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        }

        System.out.println("Number of days in month: " + MonthAndDays.length);
    }
}
