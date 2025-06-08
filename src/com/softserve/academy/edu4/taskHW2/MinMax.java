package softserve.academy.edu4.taskHW2;

import java.util.HashMap;

public class MinMax {
    public static void main(String[] args) {
        int count = 3;

        int[] numbers = Calculator.getNumbers(count);

        HashMap result = Calculator.getMinMax(numbers);

        System.out.printf(
                "The minimum number is %d\n" +
                "The maximum number is %d",
                (int)result.get("Minimum"),
                (int)result.get("Maximum"));
    }
}