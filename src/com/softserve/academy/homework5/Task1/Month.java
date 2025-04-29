package softserve.academy.homework5.Task1;

import java.util.Scanner;

public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int days;
    Month(int days){
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public static Month getMonthByNumber(int number){
        return values()[number - 1];
    }

    public static void monthStart(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int monthNumber = scanner.nextInt();
        Month month = Month.getMonthByNumber(monthNumber);
        System.out.println("Days in " + month.name() + ": " + month.getDays());
    }
}
