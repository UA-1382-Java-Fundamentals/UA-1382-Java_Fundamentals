package softserve.academy.edu4.taskPractical2;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day of week: ");
        int dayNumber = sc.nextInt();
        String dayString = switch (dayNumber) {
            case 1 -> "Monday - Понеділок";
            case 2 -> "Tuesday - Вівторок";
            case 3 -> "Wednesday - Середа";
            case 4 -> "Thursday - Четвер";
            case 5 -> "Friday - П'ятниця";
            case 6 -> "Saturday - Субота";
            case 7 -> "Sunday - Неділя";
            default -> "Wrong day number";
        };
        System.out.println(dayString);
    }
}
