package softserve.academy.edu1.taskPractical2;

import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 3;
        double[] inputs = new double[count];
        for (int i = 0; i < inputs.length; i++) {
            while (true) {
                try {
                    String message = String.format("Input a number #%d: ", i + 1);
                    inputs[i] = inputDouble(message);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.printf("The average of entered numbers is: %.2f", average(inputs));
    }

    static double average(double[] array) {
        double sum = 0;
        for (double a : array) {
            sum += a;
        }
        return sum / array.length;
    }

    static double inputDouble(String prompt) {
        System.out.print(prompt);
        try {
            return Double.parseDouble(SCANNER.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Enter a valid number!");
        }
    }
}
