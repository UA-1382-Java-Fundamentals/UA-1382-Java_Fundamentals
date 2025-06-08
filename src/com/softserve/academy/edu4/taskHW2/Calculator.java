package softserve.academy.edu4.taskHW2;

import java.util.HashMap;
import java.util.Scanner;

public class Calculator {
    static final Scanner SCANNER = new Scanner(System.in);

    public static HashMap getMinMax(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        HashMap<String, Integer> result = new HashMap<>();
        result.put("Minimum", min);
        result.put("Maximum", max);
        return result;
    }

    public static int[] getNumbers(int count) {
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            while (true) {
                try {
                    numbers[i] = inputInt(String.format("Enter a number #%d: ", (i+1)));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return numbers;
    }

    public static int inputInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Input a proper integer value!");
            }
        }
    }

}
