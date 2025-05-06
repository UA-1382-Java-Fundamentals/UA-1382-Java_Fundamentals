package softserve.academy.edu5.taskHW1;

import java.util.Scanner;

public class IntegersTen {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 10;
        int[] numbers;
        while (true) {
            try {
                numbers = inputNumbers(count);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        int sumFirstPositive = getSumFirstPositive(numbers);

        System.out.println("=============================================");
        if (sumFirstPositive != -1) {
            System.out.println("First 5 integers are positive numbers. Their sum is: " + sumFirstPositive);
        } else {
            int productOfLast = getProductOfLast(numbers);
            System.out.println("There is a negative integer in the first 5 numbers.");
            System.out.println("The product of the last 5 indices of array is: " + productOfLast);
        }
        SCANNER.close();
    }

    public static int getSumFirstPositive (int[] numbers) {
        int sumFirstPositive = 0;
        int halfCount = numbers.length / 2;
        for (int i = 0; i < halfCount; i++) {
            if ((numbers[i] < 0)) {
                sumFirstPositive = -1;
                break;
            } else {
                sumFirstPositive += numbers[i];
            }
        }
        return sumFirstPositive;
    }

    public static int getProductOfLast(int[] numbers) {
        int productOfLast = 1;
        int halfCount = numbers.length / 2;
        for (int i = (numbers.length-1); i >= halfCount; i--) {
            productOfLast *= numbers[i];
        }
        return productOfLast;
    }

    public static int[] inputNumbers(int count) {
        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.print("Enter an integer #" + (i+1) + ": ");
                numbers[i] = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Enter a valid integer!");
            }
        }
        return numbers;
    }
}
