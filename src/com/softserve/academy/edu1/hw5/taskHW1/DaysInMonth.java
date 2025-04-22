package softserve.academy.edu1.hw5.taskHW1;

//1. Create a program (in different java documents) that prompts the user to enter:
//        • a month number and calculates the number of days in that month based on an array that contains
//the number of days in each month.
//• 10 integers numbers and calculates the sum of the first five elements if they are positive, or the
//product of the last five elements if they are not and output the result.
//• 5 integer numbers and find:
//o position of second positive number;
//o minimum value and its position in the array.
//o calculate the product of all entered even numbers (exclude 0 from even if entered by user).

import java.time.Month;
import java.util.*;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] monthsArray = new String[12];
        for (int i = 0; i < monthsArray.length; i++) {
            Month month = Month.of(i+1);
            monthsArray[i] = month.name();
        }
        System.out.print("Enter the month number: ");
        int monthIndex = sc.nextInt();
        while (monthIndex < 1 || monthIndex > 12) {
            System.out.print("Invalid month number, try again: ");
            monthIndex = sc.nextInt();
        }
        boolean isLeapYear = false;
        sc.nextLine();
        if (monthIndex == 2) {
            System.out.print("Is it a leap year? ");
            String answer = sc.nextLine();
            answer = answer.toLowerCase();
            isLeapYear = switch (answer) {
                case "yes" -> true;
                case "no" -> false;
                default -> false;
            };
        }
        System.out.println("You have chosen " + monthsArray[monthIndex-1]);
        System.out.println("It has maximum of " + Month.of(monthIndex).length(isLeapYear) + " days.");
    }
}
