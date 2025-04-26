package hwthird;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the first number:");
        int firstNumber = scan.nextInt();

        System.out.println("Input the second number:");
        int secondNumber = scan.nextInt();

        System.out.println("Input the third number:");
        int thirdNumber = scan.nextInt();

        scan.close();

        int smallest = findMin(firstNumber, secondNumber, thirdNumber);
        System.out.println("Smallest number is: " + smallest);
    }

    // Метод порівнянн
    public static int findMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;

    }
}

