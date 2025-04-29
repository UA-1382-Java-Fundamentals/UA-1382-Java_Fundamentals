package softserve.academy.edu1.hw5.taskHW1;

import java.time.Month;
import java.util.Scanner;

public class DaysInMonth {
    static final Scanner SCANNER = new Scanner(System.in);

    public static boolean isLeapYear(String answer) {
        answer = answer.toLowerCase();
        return answer.equals("y");
    }

    public static String inputUserData(String message) {
        System.out.print(message);
        return SCANNER.nextLine();
    }

    public static void checkValidIndex(int monthIndex) {
        if (monthIndex < 1 || monthIndex > 12) {
            throw new IllegalArgumentException("Month index must be between 1 and 12");
        }
    }

    public static String[] fillMonthsArray() {
        String[] monthsArray = new String[12];
        for (int i = 0; i < monthsArray.length; i++) {
            Month month = Month.of(i+1);
            monthsArray[i] = month.name();
        }
        return monthsArray;
    }

    public static void main(String[] args) {

        String[] monthsArray = fillMonthsArray();
        int monthIndex = Integer.parseInt(inputUserData("Enter the month number: "));
        checkValidIndex(monthIndex);
        boolean isLeapYear = false;
        if (monthIndex == 2) {
            String answer = inputUserData("Is it a leap year? (y/n) :");
            isLeapYear = isLeapYear(answer);
        }
        System.out.println("You have chosen " + monthsArray[monthIndex-1]);
        System.out.println("It has maximum of " + Month.of(monthIndex).length(isLeapYear) + " days.");
        SCANNER.close();
    }

}
