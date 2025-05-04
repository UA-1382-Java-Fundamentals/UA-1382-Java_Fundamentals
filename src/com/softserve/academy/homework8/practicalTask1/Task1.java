package softserve.academy.homework8.practicalTask1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        while (true) {
            try {
                int sideA = readInt("Enter square side");
                int sideB = readInt("Enter another side");

                int area = squareRectangle(sideA, sideB);
                System.out.println("The area is " + area);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static int readInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("It should be a number");
            }
        }
    }

    public static int squareRectangle(int sideA, int sideB) {
        if (sideA < 0 | sideB < 0) {
            throw new IllegalArgumentException(
                    "The sides should be non negative"
            );
        }
        return sideA * sideB;
    }
}
