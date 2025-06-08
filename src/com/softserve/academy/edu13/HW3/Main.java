package softserve.academy.edu13.HW3;

//3. Create method which take year as a parameter and return true if year is a leap

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int minYear = 1500;
        int maxYear = 2025;
        int count = 10;
        Supplier<Integer> integerSupplier = () -> rand.nextInt(minYear, maxYear);

        Integer[] years = new Integer[count];
        for (int i = 0; i < years.length; i++) {
            years[i] = integerSupplier.get();
        }

        for (Integer year : years) {
            System.out.printf("%-4d : %s\n", year, isLeapYearSpecified(year) ? "leap" : "not");
        }
    }

    private static boolean isLeapYearSpecified(int year) {
        LocalDate LD = LocalDate.of(year, 1, 1);
        return LD.isLeapYear();
    }
}
