package softserve.academy.edu1.hw5.taskHW1;

import java.time.Month;
import java.util.Scanner;

public class DaysInMonth {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String[] monthsArray = fillMonthsArray();
        int monthIndex;

        while (true) {
            try {
                monthIndex = Integer.parseInt(inputUserData("Enter the month number: "));
                checkValidIndex(monthIndex);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid month number!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        boolean isLeapYear = false;
        if (monthIndex == 2) {
            while (true) {
                try {
                    String answer = inputUserData("Is it a leap year? (y/n) :");
                    isLeapYear = isLeapYear(answer);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("You have chosen " + monthsArray[monthIndex-1]);
        System.out.printf("It has maximum of %d days.", Month.of(monthIndex).length(isLeapYear));
        SCANNER.close();
    }

    public static boolean isLeapYear(String answer) {
        if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
            throw new IllegalArgumentException("Enter 'Y' or 'N' ignoring the case.");
        }
        return answer.equalsIgnoreCase("y");
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
}
