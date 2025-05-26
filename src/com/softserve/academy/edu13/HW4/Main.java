package softserve.academy.edu13.HW4;

//4. Create variable LocalDate birthday and set to that variable date your birthday.
//Create method that take as a parameter object LocalDate and pring the day of the week
//and what was the day of the week after 6 months and what was the day of the week after
//12 months.

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> birthDate = new HashMap<>(Map.of(
                "year", 1988,
                "month", 4,
                "day", 13
        ));

        LocalDate birthday = LocalDate.of(
                birthDate.get("year"),
                birthDate.get("month"),
                birthDate.get("day"));

        printWeekdayNowAndThen(birthday);
    }

    private static void printWeekdayNowAndThen(LocalDate localDate) {
        System.out.printf("On %s it was %s\n", localDate, localDate.getDayOfWeek().toString().toLowerCase());
        LocalDate localDateLater = localDate.plusMonths(6);
        System.out.printf("In 6 months it will be %s (%s)\n", localDateLater, localDateLater.getDayOfWeek().toString().toLowerCase());
        localDateLater = localDate.plusMonths(12);
        System.out.printf("In 12 months it will be %s (%s)\n", localDateLater, localDateLater.getDayOfWeek().toString().toLowerCase());
    }
}
