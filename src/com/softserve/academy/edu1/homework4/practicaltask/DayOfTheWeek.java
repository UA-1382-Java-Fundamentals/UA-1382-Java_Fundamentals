package homework4.practicaltask;


import java.util.Scanner;

//2. Enter the number of the day of the week from the console. Output the name of the day of the week in two languages. Output the result to the console.
public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week (1-7): ");
        int day = scanner.nextInt();
        String dayEnglish;
        String dayUkrainian;
        switch (day) {
            case 1:
                dayEnglish = "Monday";
                dayUkrainian = "Понеділок";
                break;
            case 2:
                dayEnglish = "Tuesday";
                dayUkrainian = "Вівторок";
                break;
            case 3:
                dayEnglish = "Wednesday";
                dayUkrainian = "Середа";
                break;
            case 4:
                dayEnglish = "Thursday";
                dayUkrainian = "Четверг";
                break;
            case 5:
                dayEnglish = "Friday";
                dayUkrainian = "Пятниця";
                break;
            case 6:
                dayEnglish = "Saturday";
                dayUkrainian = "Субота";
                break;
            case 7:
                dayEnglish = "Sunday";
                dayUkrainian = "Неділя";
                break;
            default:
                System.out.println("Invalid day");
                System.out.println("Невідомий день");
                scanner.close();
                return;
        }
        System.out.println("Day Of The Week in english: " + dayEnglish);
        System.out.println("День тижня українською: " + dayUkrainian);
    }
}
