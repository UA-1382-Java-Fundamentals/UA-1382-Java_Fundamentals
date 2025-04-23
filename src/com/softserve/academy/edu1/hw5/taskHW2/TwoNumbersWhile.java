package softserve.academy.edu1.hw5.taskHW2;

import java.util.Scanner;

public class TwoNumbersWhile {

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

    private static int getSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static String getAnswer() {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        answer = sc.nextLine();
        answer.toLowerCase();
        return answer;
    }

    public static void main(String[] args) {
        int count = 2;
        String answer = "";
        do {
            int[] numbers = getNumbers(count);
            int sum = getSum(numbers);
            System.out.println("The sum of two numbers is " + sum);
            System.out.println("================================");
            System.out.print("Do you want to repeat? ");
            answer = getAnswer();
        } while (answer.equals("yes"));
    }
}