package softserve.academy.edu5.taskHW1;

import java.util.Scanner;

public class IntegersFive {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 5;
        int[] numbers;
        while (true) {
            try {
                numbers = inputNumbers(count);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        int secondPositiveIndex = getSecondPositiveIndex(numbers);
        int[] minNumberInstance = getMinNumberInstance(numbers);
        int evenProduct = getEvenProduct(numbers);

        System.out.println("Second positive integer is at index " + secondPositiveIndex);
        System.out.println("The least number in array is " + minNumberInstance[0] + " and it's index is " + minNumberInstance[1]);
        if (evenProduct > 0) {
            System.out.println("The product of all even numbers is: " + evenProduct);
        } else {
            System.out.println("There are no even numbers in the array");
        }
        SCANNER.close();
    }

    public static int getSecondPositiveIndex(int[] numbers) {
        int secondPositiveIndex = 0;
        int j = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                if (j == 2) {
                    secondPositiveIndex = i;
                    return secondPositiveIndex;
                } else {
                    j++;
                }
            }
        }
        return secondPositiveIndex;
    }

    public static int[] getMinNumberInstance(int[] numbers) {
        int minNumber = Integer.MAX_VALUE;
        int minNumberIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
                minNumberIndex = i;
            }
        }
        return new int[]{minNumber, minNumberIndex};
    }

    public static int getEvenProduct(int[] numbers) {
        int product = 1;
        int evenCounter = 0;
        for (int number : numbers) {
            if ((number % 2 == 0) && (number != 0)) {
                product *= number;
                evenCounter++;
            }
        }
        if (evenCounter > 0) {
            return product;
        }
        return 0;
    }

    public static int[] inputNumbers(int count) {
        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.print("Enter an integer #" + (i + 1) + ": ");
                numbers[i] = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Enter a valid integer!");
            }
        }
        return numbers;
    }
}
