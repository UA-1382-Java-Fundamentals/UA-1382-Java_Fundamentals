package softserve.academy.edu1.hw5.taskHW1;

import java.util.Scanner;

public class IntegersTen {

    static int getSumFirstPositive (int[] numbers) {
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

    private static int getProductOfLast(int[] numbers) {
        int productOfLast = 1;
        int halfCount = numbers.length / 2;
        for (int i = (numbers.length-1); i >= halfCount; i--) {
            productOfLast *= numbers[i];
        }
        return productOfLast;
    }

    private static int[] getNumbers(int count) {
        int[] numbers = new int[count];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter an integer #" + (i+1) + ": ");
            numbers[i] = sc.nextInt();
            sc.nextLine();
        }
        return numbers;
    }

    public static void main(String[] args) {
        int count = 10;
        int[] numbers = getNumbers(count);

        int sumFirstPositive = getSumFirstPositive(numbers);

        System.out.println("=============================================");
        if (sumFirstPositive != -1) {
            System.out.println("First 5 integers are positive numbers. Their sum is: " + sumFirstPositive);
        } else {
            int productOfLast = getProductOfLast(numbers);
            System.out.println("There is a negative integer in the first 5 numbers.");
            System.out.println("The product of the last 5 indices of array is: " + productOfLast);
        }
    }
}
