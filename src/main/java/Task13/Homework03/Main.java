package Task13.Homework03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int year = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Hello.Write a year please : ");
            year = sc.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Its not year");
        }

        if(!isLeapYear(year)){
            System.out.println("The " + year + " was a leap year");
        }else{
            System.out.println("The " + year + " IS NOT a leap year");
        }
    }

    static boolean isLeapYear(int year) {

        String checkString = "02.29." + year;

        final DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM.dd.yyyy");

        LocalDate date;
        try {
            date = LocalDate.parse(checkString, formatDate);
        } catch (DateTimeParseException e) {
            return false;
        }
        System.out.println(date);
        return checkString.equals(date.format(formatDate));
    }
}

