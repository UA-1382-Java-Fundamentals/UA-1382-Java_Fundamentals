package softserve.academy.edu4.taskHW1;

import java.util.Scanner;

public class Checker {
    static final Scanner SCANNER = new Scanner(System.in);

    public static double inputDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Input a proper double value!");
            }
        }
    }

    public static double[] getNumbers(int count) {
        double[] numbers = new double[count];
        for (int i = 0; i < count; i++) {
            while (true) {
                try {
                    numbers[i] = inputDouble(String.format("Enter a number #%d: ", (i+1)));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return numbers;
    }

    public static boolean isInRange(double[] numbers, int min, int max) {
        for (double number : numbers) {
            if ((number < min) || (number > max)) {
                return false;
            }
        }
        return true;
    }
}
