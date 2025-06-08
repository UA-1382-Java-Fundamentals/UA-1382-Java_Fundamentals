package softserve.academy.edu1.taskPractical3;

import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int a = inputInteger("Input a number A: ");
        int b = 0;
        while (true) {
            try {
                b = inputInteger("Input a number B: ");
                if (b == 0) {
                    throw new ArithmeticException("Second operand cannot be zero!");
                }
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.printf("A + B = %d\n", (a + b));
        System.out.printf("A - B = %d\n", (a - b));
        System.out.printf("A * B = %d\n", (a * b));
        System.out.printf("A / B = %.2f\n", ((a * 1.0) / b));
    }

    static int inputInteger(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(SCANNER.nextLine());
    }
}
