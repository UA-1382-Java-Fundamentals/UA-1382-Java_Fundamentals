package softserve.academy.edu1.hw5.taskHW2;

import java.util.Scanner;

public class TwoNumbersWhile {
    public static void main(String[] args) {
        int count = 2;
        int[] numbers = new int[count];
        String answer;
        Scanner sc = new Scanner(System.in);
        do {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter an integer #" + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
                sc.nextLine();
            }
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("The sum of two numbers is " + sum);
            System.out.println("================================");
            System.out.print("Do you want to repeat? ");
            answer = sc.nextLine();
            answer = answer.toLowerCase();
        } while (answer.equals("yes"));
    }
}
