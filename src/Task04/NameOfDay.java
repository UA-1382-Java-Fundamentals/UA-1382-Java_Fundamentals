package Task04;

import java.util.Scanner;

public class NameOfDay {

      static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Write the day of the week, from 1 to 7:");
        int number = sc.nextInt();

    switch (number) {
        case 1 -> {
            System.out.println("This day is 'Monday' or 'Понеділок'");
            break;
        }
        case 2 -> {
            System.out.println("This day is 'Tuesday' or 'Вівторок'");
            break;
        }
        case 3 -> {
            System.out.println("This day is 'Wednesday' or 'Середа'");
            break;
        }
        case 4 -> {
            System.out.println("This day is 'Thursday' or 'Четверг'");
            break;
        }
        case 5 -> {
            System.out.println("This day is 'Friday' or 'Пятниця'");
            break;
        }
        case 6 -> {
            System.out.println("This day is 'Saturday' or 'Субота'");
            break;
        }
        case 7 -> {
            System.out.println("This day is 'Sunday' or 'Неділя'");
            break;
        }
    };
    }


}
