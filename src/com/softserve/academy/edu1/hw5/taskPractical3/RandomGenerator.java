package softserve.academy.edu1.hw5.taskPractical3;

import java.util.Arrays;
import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 10;
        int[] array = new int[count];
        int negativeCt = 0;
        int positiveSum = 0;
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            array[i] = rand.nextInt(100);
            if (rand.nextBoolean()) {
                array[i] = -array[i];
                negativeCt++;
            } else {
                positiveSum += array[i];
            }
            maxNumber = Math.max(maxNumber, array[i]);
        }
        int differenceCt = count - negativeCt;
        String finalMessage = "N/A";
        if (differenceCt < (count / 2)) {
            finalMessage = "There are more negative values in the array.";
        }
        else if (differenceCt > (count / 2)) {
            finalMessage = "There are more positive values in the array.";
        }
        else {
            finalMessage = "There is an equal number of positive and negative values in the array.";
        }
        System.out.println("The generated array is:");
        System.out.println(Arrays.toString(array));
        System.out.println("The biggest number is " + maxNumber);
        System.out.println("The sum of the positive numbers is " + positiveSum);
        System.out.println("There are " + negativeCt + " negative values in the array.");
        System.out.println(finalMessage);
    }
}
