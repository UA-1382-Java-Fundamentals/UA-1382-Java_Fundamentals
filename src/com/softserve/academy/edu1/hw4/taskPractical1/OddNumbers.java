package softserve.academy.edu1.hw4.taskPractical1;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 3;
        int[] inputNumber = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            inputNumber[i] = sc.nextInt();
            sc.nextLine();
        }

        int j = 0;
        for (int i = 0; i < number; i++) {
            if ((inputNumber[i] % 2) != 0) {
                j++;
            }
        }

        System.out.println("There are " + j + " odd numbers");

    }
}
