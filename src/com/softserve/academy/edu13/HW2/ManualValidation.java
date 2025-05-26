package softserve.academy.edu13.HW2;

//2. Create method to validate date according to format "mm.dd.yy"

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class ManualValidation {
    public static void main(String[] args) {

        // Assume that YY is referring to current century

        String date = "2.29.24";

        System.out.printf("%s is %s date!\n", date, isDateValid(date)? "a valid" : "an invalid");

    }

    private static boolean isDateValid(String date) {
        HashMap<String, Integer> dateMap = parseDateString(date);

        if (dateMap.get("month") < 1 || dateMap.get("month") > 12) {
            return false;
        }

        return dateMap.get("day") >= 1 && dateMap.get("day") <= Month.of(dateMap.get("month")).length(isLeapYearSpecified(dateMap.get("year")));
    }

    private static HashMap<String, Integer> parseDateString(String date) {
        String[] parts = date.split("\\.");
        int[] dateParts = new int[parts.length];
        LocalDate today = LocalDate.now();
        String currentCentury = today.toString().substring(0, 2);
        for (int i = 0; i < dateParts.length; i++) {
            if (i == 2) {
                parts[i] = currentCentury + parts[i];
            }
            dateParts[i] = Integer.parseInt(parts[i]);
        }
        return new HashMap<>(Map.of(
                "year", dateParts[2],
                "month", dateParts[0],
                "day", dateParts[1]
        ));
    }

    private static boolean isLeapYearSpecified(int year) {
        LocalDate LD = LocalDate.of(year, 1, 1);
        return LD.isLeapYear();
    }
}
