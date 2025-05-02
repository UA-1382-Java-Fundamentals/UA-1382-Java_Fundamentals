package softserve.academy.edu1.hw8.taskHW1;

import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 2;
        double[] numbers = new double[count];
        for (int i = 0; i < numbers.length; i++) {
            switch (i) {
                case 0: {
                    numbers[i] = inputDouble("Enter operand " + (i + 1) + ": ");
                    break;
                }
                case 1: {
                    while (true) {
                        numbers[i] = inputDouble("Enter operand " + (i + 1) + ": ");
                        try {
                            checkSecondOperand(numbers[i]);
                            break;
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
            }
        }
        double result = div(numbers[0], numbers[1]);
        String message = String.format("Division result is: %.2f", result);
        System.out.println(message);
        SCANNER.close();
    }

    static double inputDouble(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Double.parseDouble(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number! Use '.' to separate decimal part!");
            }
        }
    }

    static void checkSecondOperand(double value) {
        if (value == 0) {
            throw new ArithmeticException("Second operand cannot be zero!");
        }
    }

    static double div(double d1, double d2) {
        return d1 / d2;
    }
}
