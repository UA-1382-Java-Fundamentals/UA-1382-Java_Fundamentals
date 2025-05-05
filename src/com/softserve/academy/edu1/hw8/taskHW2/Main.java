package softserve.academy.edu1.hw8.taskHW2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 10;
        int[] array = new int[count];
        int start = 1;
        int end = 100;
        String message = String.format("Enter an integer between %d and %d: ", start, end);
        for (int i = 0; i < array.length; i++) {
            while (true) {
                try {
                    array[i] = readNumber(inputNumber(message), start, end);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            start = array[i];
        }
        System.out.println(Arrays.toString(array));
    }

    static int readNumber(int input, int start, int end) throws NumberTooBigException, NumberTooSmallException {
        if (input < start) {
            throw new NumberTooSmallException("Number is too small!");
        } else if (input > end) {
            throw new NumberTooBigException("Number is too big!");
        } else {
            return input;
        }
    }

    static int inputNumber(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Enter an integer!");
            }
        }
    }
}
