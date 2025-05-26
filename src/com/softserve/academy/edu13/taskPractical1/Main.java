package softserve.academy.edu13.taskPractical1;

//• Show which today is a day of a week

import java.time.LocalDate;

public class Main {
    static final LocalDate LD = LocalDate.now();

    public static void main(String[] args) {
        System.out.println("Today's day is " + LD.getDayOfWeek().toString().toLowerCase());
    }
}
