package Task13.Homework04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimeManipulation {


    public TimeManipulation() {
    }

    public void timeManipulation(String d) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthdayDay = LocalDate.parse(d, dtf);

        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(birthdayDay));

        LocalDate dayAfterYear = birthdayDay.plusYears(1);
        System.out.println("Day after 12 month : ");
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(dayAfterYear));

        LocalDate dayAfterSixMonth = birthdayDay.plusMonths(6);
        System.out.println("Day after 6 month : ");
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(dayAfterSixMonth));
    }
}
