package softserve.academy.edu1.hw5.taskPractical1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTools {
    public static void main(String[] args) {
        System.out.println("=========SubTask-1====================");
        String[] arrayString = {"lorem", "ipsum", "dolor", "sit", "amet"};
        System.out.println("The unsorted array is: " + Arrays.toString(arrayString));
        Arrays.sort(arrayString);
        System.out.println("Sorted array is: " + Arrays.toString(arrayString));
        System.out.println("======================================");

        System.out.println("=========SubTask-2====================");
        int[] numbers = new int[5];
        int i = 0;
        int sum = 0;
        Random rand = new Random();
        for (int number: numbers) {
            numbers[i] = rand.nextInt(50);
            sum += numbers[i];
            i++;
        }
        System.out.println("Here are the random numbers to calculate average: " + Arrays.toString(numbers));
        double average = (sum * 1.0) / numbers.length;
        String messageAverage = String.format("The average is: %.2f", average);
        System.out.println(messageAverage);
        System.out.println("======================================");

        System.out.println("=========SubTask-3====================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one of the numbers in the previous array: ");
        int searchNumber = sc.nextInt();
        boolean numberPresent = false;
        for (int number: numbers) {
            if (number == searchNumber) {
                numberPresent = true;
            }
        }
        if (numberPresent) {
            Arrays.sort(numbers);
            System.out.println("Here is the sorted array: " + Arrays.toString(numbers));
            int indexFound = Arrays.binarySearch(numbers, searchNumber);
            System.out.println("We found " + searchNumber + " in the array at index " + indexFound );
        }
        else {
            System.out.println("No such number");
        }
        System.out.println("======================================");
    }
}
