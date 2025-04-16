package homework3;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getNumber(scanner, "Enter first number: ");
        int num2 = getNumber(scanner, "Enter second number: ");
        getTotal(num1, num2);
        getAverage(num1, num2);
        scanner.close();
    }

    private static void getTotal(int num1, int num2) {
        int total = num1 + num2;
        System.out.println("Total: " + total);
    }

    private static void getAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        System.out.println("Average: " + average);
    }

    private static int getNumber(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextInt();
    }
}
