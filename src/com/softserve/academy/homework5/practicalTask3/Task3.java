package softserve.academy.homework5.practicalTask3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int numbers [] = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        System.out.println("Max value = " + isMaxValue(numbers));
        System.out.println("Sum of positive numbers = " + sumOfPositiveNumbers(numbers));
        System.out.println("Count of negative numbers = " + countNegativeNumbers(numbers));
        System.out.println(determineNegativeOrPositive(numbers));
    }
    public static int isMaxValue(int[]values){
        int maxValue = Integer.MIN_VALUE;
        for (int value : values){
            if (value > maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static int sumOfPositiveNumbers(int[]values){
        int positiveSum = 0;
        for (int value : values){
            if(value > 0){
                positiveSum += value;
            }
        }
        return positiveSum;
    }

    public static int countNegativeNumbers(int[]values){
        int count = 0;
        for (int value : values){
            if (value < 0){
                count++;
            }
        }
        return count;
    }


    public static String determineNegativeOrPositive(int[]values){
        int positiveCount = 0;
        int negativeCount = 0;
        for (int value : values){
            if(value >= 0 ){
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
        if (positiveCount > negativeCount){
            return "There are more positive values in the array.";
        } else if (positiveCount < negativeCount) {
            return "There are more negative values in the array";
        } else {
            return "There are an equal number of positive and negative values in the array.";
        }
    }
}
