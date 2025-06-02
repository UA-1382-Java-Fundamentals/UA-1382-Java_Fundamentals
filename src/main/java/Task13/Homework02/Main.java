package Task13.Homework02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {

    public static void main(String[] args){

        System.out.println(dateCheck("02.30.2020"));
        System.out.println(dateCheck("23.23.2020"));
    }

    static boolean dateCheck (String stringDate){
        final  DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM.dd.yyyy");

        LocalDate date;
        try {
            date = LocalDate.parse(stringDate, dateFormat);
        } catch (DateTimeParseException e) {
            return false;
        }
        System.out.println(date);
        return stringDate.equals(date.format(dateFormat));

    }
}
