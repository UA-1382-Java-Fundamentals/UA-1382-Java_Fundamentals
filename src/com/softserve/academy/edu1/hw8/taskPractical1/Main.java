package softserve.academy.edu1.hw8.taskPractical1;

import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] sides = new int[2];
        char[] sideNames = {'A','B'};

        while (true) {
            for (int i = 0; i < sides.length; i++) {
                sides[i] = inputSide("Enter side " + sideNames[i] + ": ");
            }

            try {
                int area = squareRectangle(sides);
                System.out.println("The area of the rectangle is: " + area);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        SCANNER.close();
    }

    private static void checkPositiveArgument(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Argument must be greater than 0!");
        }
    }

    public static int squareRectangle(int[] sides) {
        int area = 1;
        for (int side : sides) {
            checkPositiveArgument(side);
            area *= side;
        }
        return area;
    }

    public static int inputSide(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number!");
            }
        }
    }
}

