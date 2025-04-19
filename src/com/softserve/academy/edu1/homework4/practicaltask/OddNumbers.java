package homework4.practicaltask;

import java.util.Scanner;

//        1. Enter three numbers from the console. Determine and output the result of how many of them are odd. Output the result to the console.
public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int count = 0;
        if (number1 % 2 == 0) {
            count++;
        }        if (number2 % 2 == 0) {
            count++;
        }        if (number3 % 2 == 0) {
            count++;
        }
        System.out.println("Number of odd numbers: " + count);
        scanner.close();
    }
}
