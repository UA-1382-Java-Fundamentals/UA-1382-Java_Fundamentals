package task3;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = getNumber(scanner);
        System.out.println("Enter second number: ");
        int num2 = getNumber(scanner);
        getTotal(num1, num2);
        getAverage(num1, num2);
        scanner.close();
    }
    public static void getTotal(int num1, int num2) {
        int total = num1 + num2;
        System.out.println("Total: " + total);
    }
    public static void getAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        System.out.println("Average: " + average);
    }
    public static int getNumber(Scanner scanner) {
        return scanner.nextInt();
    }
}
