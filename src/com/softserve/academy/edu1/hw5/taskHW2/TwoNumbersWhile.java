package softserve.academy.edu1.hw5.taskHW2;

import java.util.Scanner;

public class TwoNumbersWhile {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 2;
        boolean isNextTurn;
        do {
            int[] numbers;
            while (true) {
                try {
                    numbers = inputNumbers(count);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
            int sum = getSum(numbers);
            System.out.println("The sum of two numbers is " + sum);

            while (true) {
                try {
                    System.out.println("================================");
                    System.out.print("Do you want to repeat? (yes/no) ");
                    isNextTurn = isAnswerTrue(inputAnswer());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

        } while (isNextTurn);
        SCANNER.close();
    }

    public static int[] inputNumbers(int count) {
        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                try {
                    System.out.print("Enter an integer #" + (i + 1) + ": ");
                    numbers[i] = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Enter a valid integer!");
                }
            }
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
        String out = SCANNER.nextLine();
        if (out.isEmpty()) {
            throw new IllegalArgumentException("Answer cannot be empty!");
        }
        return out;
    }

    public static boolean isAnswerTrue(String answer) {
        return switch (answer.toLowerCase()) {
            case "yes" -> true;
            case "no" -> false;
            default -> throw new IllegalArgumentException("Answer must be 'yes' or 'no' ignoring the case!");
        };
    }

}