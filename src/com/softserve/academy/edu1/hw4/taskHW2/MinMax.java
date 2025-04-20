package softserve.academy.edu1.hw4.taskHW2;

import java.util.HashMap;
import java.util.Scanner;

class Calculator {
    public static HashMap getMinMax(int... numbers) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        result.put("Minimum", min);
        result.put("Maximum", max);
        return result;
    }

    public static int[] getNumbers(int count) {
        int[] numbers = new int[count];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            String message = String.format("Enter a number #%d: ", (i+1));
            System.out.print(message);
            numbers[i] = sc.nextInt();
            sc.nextLine();
        }
        return numbers;
    }
}

public class MinMax {
    public static void main(String[] args) {
        int count = 3;
        int[] numbers = Calculator.getNumbers(count);

        HashMap result = new HashMap<>();
        result = Calculator.getMinMax(numbers);

        String resultMessage = String.format("The minimum number is %d\nThe maximum number is " +
                "%d", result.get("Minimum"), result.get("Maximum"));
        System.out.println(resultMessage);

    }
}
