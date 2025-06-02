package Task13.Homework04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        String date = "";
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Hello.Write your birthday in format 'year-month-day' : ");
            date = sc.nextLine();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Its not year");
        }
        sc.close();

        TimeManipulation obj = new TimeManipulation();

        obj.timeManipulation(date);
    }
}
