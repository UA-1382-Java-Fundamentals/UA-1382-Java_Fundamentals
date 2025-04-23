package softserve.academy.edu1.hw5.taskHW1;

import java.time.Month;
import java.util.*;

public class DaysInMonth {
    private static boolean isLeapYear() {
        Scanner sc = new Scanner(System.in);
        boolean isLeapYear;
        System.out.print("Is it a leap year? ");
        String answer = sc.nextLine();
        answer = answer.toLowerCase();
        isLeapYear = switch (answer) {
            case "yes" -> true;
            case "no" -> false;
            default -> false;
        };
        sc.close();
        return isLeapYear;
    }

    private static int getMonthIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int monthIndex = sc.nextInt();
        while (monthIndex < 1 || monthIndex > 12) {
            System.out.print("Invalid month number, try again: ");
            monthIndex = sc.nextInt();
        }
        sc.close();
        return monthIndex;
    }

    private static String[] fillMonthsArray() {
        String[] monthsArray = new String[12];
        for (int i = 0; i < monthsArray.length; i++) {
            Month month = Month.of(i+1);
            monthsArray[i] = month.name();
        }
        return monthsArray;
    }

    public static void main(String[] args) {

        String[] monthsArray = fillMonthsArray();
        int monthIndex = getMonthIndex();
        boolean isLeapYear = false;
        if (monthIndex == 2) {
            isLeapYear = isLeapYear();
        }
        System.out.println("You have chosen " + monthsArray[monthIndex-1]);
        System.out.println("It has maximum of " + Month.of(monthIndex).length(isLeapYear) + " days.");
    }

}
