package softserve.academy.edu13.HW2;

//2. Create method to validate date according to format "mm.dd.yy"

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class DTFValidation {
    public static void main(String[] args) {
        List<String> dates = new ArrayList<>(List.of(
                "02.29.24",
                "02.29.25",
                "12.1.24",
                "1.10.12"
        ));
        for (String date : dates) {
            System.out.printf("%-8s : %s\n", date, isDateValid(date));
        }
    }

    private static boolean isDateValid(String dateString) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        LocalDate date;
        try {
            date = LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            return false;
        }
        return dateString.equals(date.format(formatter));
    }
}
