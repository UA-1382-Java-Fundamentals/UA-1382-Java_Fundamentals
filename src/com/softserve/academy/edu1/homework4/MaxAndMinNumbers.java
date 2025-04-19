package homework4;

//Write a program that prompts the user to input three integer numbers.
//The program should determine the maximum and minimum values among the three numbers and output them to the console.


import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = scanner.nextInt();
        int max = Math.max(number1, Math.max (number2, number3));
        int min = Math.min(number1, Math.min (number2, number3));
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}
