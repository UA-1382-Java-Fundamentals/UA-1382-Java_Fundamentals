package homework4;

//  Write a program that prompts the user to input three double numbers.
//  The program should check if all three numbers fall within the range of -5 and 5 (inclusive).
//  If all three numbers are within this range, the program should output a message indicating that they belong to the range [-5, 5].
//  If any of the numbers are outside the specified range, the program should output a message indicating that not all numbers belong to the range [-5, 5].
//  Please note that the range includes the values -5 and 5 as well.


import java.util.Scanner;

public class NumbersRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double thirdNumber = scanner.nextDouble();
        if (firstNumber >= -5 && firstNumber <= 5
                && secondNumber >= -5 && secondNumber <= 5
                && thirdNumber >= -5 && thirdNumber <= 5) {
            System.out.println("This is a range of numbers between -5 and 5.");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }
}
