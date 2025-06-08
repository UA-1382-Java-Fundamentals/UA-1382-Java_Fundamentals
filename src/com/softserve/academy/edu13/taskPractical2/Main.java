package softserve.academy.edu13.taskPractical2;

//• Show a date of first Monday for current month

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import static java.time.DayOfWeek.MONDAY;

public class Main {
    static final LocalDate LD = LocalDate.now();

    public static void main(String[] args) {
        System.out.println(
                LD.with(TemporalAdjusters.firstInMonth(MONDAY))
        );
    }
}
