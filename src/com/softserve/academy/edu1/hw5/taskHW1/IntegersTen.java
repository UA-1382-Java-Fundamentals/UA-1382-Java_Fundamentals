package softserve.academy.edu1.hw5.taskHW1;

import java.util.Scanner;

public class IntegersTen {
    public static void main(String[] args) {
        int count = 10;
        int[] numbers = new int[count];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter an integer #" + (i+1) + ": ");
            numbers[i] = sc.nextInt();
            sc.nextLine();
        }
        boolean isFirstPositive = true;
        int sumFirstPositive = 0;
        int halfCount = numbers.length / 2;
        for (int i = 0; i < halfCount; i++) {
            if ((numbers[i] < 0)) {
                isFirstPositive = false;
                break;
            } else {
                sumFirstPositive += numbers[i];
            }
        }
        System.out.println("=============================================");
        if (isFirstPositive) {
            System.out.println("First 5 integers are positive number. Their sum is: " + sumFirstPositive);
        } else {
            int productOfLast = 1;
            for (int i = (numbers.length-1); i >= halfCount; i--) {
                productOfLast *= numbers[i];
            }
            System.out.println("There is a negative integer in the first 5 numbers.");
            System.out.println("The product of the last 5 indices of array is: " + productOfLast);
        }
    }
}
