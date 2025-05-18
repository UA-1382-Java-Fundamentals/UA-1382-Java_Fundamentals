package softserve.academy.edu12.HW3;

//3. The task requires implementation of a pattern to match US currency format, which includes a
//dollar sign ($) followed by any number of digits, a dot, and two digits after the dot. The next step
//is to input a text containing several instances of US currency format via the console. Finally,
//display all the occurrences of US currency format on the console screen.

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> priceTags = new ArrayList<>(List.of(
                "$50.45",
                "234.24$",
                "$4,33",
                "USD 36.21",
                "99,88$",
                "$499,99$",
                "$150.25",
                "$37291.2356",
                "$31.6",
                "$1.63"
        ));

        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}$");
        for (String tag : priceTags) {
            Matcher matcher = pattern.matcher(tag);
            boolean matchFound = matcher.find();
            if (matchFound) {
                System.out.printf("%30s is approved\n", tag);
            } else {
                System.out.printf("%30s is rejected\n", tag);
            }
        }
    }
}
