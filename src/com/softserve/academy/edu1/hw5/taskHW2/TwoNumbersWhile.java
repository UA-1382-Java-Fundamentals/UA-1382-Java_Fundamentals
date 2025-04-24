package softserve.academy.edu1.hw5.taskHW2;

import java.util.Scanner;

public class TwoNumbersWhile {

    static final Scanner SCANNER = new Scanner(System.in);

    public static int[] inputNumbers(int count) {
        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter an integer #" + (i+1) + ": ");
            numbers[i] = SCANNER.nextInt();
        }
        return numbers;
    }

    public static int getSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static String inputAnswer() {
        SCANNER.nextLine();
        return SCANNER.nextLine();
    }

    public static void main(String[] args) {
        int count = 2;
        String answer = "";
        do {
            int[] numbers = inputNumbers(count);
            int sum = getSum(numbers);
            System.out.println("The sum of two numbers is " + sum);
            System.out.println("================================");
            System.out.print("Do you want to repeat? (yes/no) ");
            answer = inputAnswer();
        } while (answer.equalsIgnoreCase("yes"));
        SCANNER.close();
    }
}