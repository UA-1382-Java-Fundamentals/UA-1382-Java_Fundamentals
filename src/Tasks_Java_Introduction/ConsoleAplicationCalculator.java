package Tasks_Java_Introduction;

import java.util.Scanner;

public class ConsoleAplicationCalculator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number 'a' is?:");
        int firstNum = sc.nextInt();

        System.out.println("Second number 'b' is?:");
        int secondNum = sc.nextInt();

        sc.close();

        int summa = firstNum + secondNum;
        int subtraction = firstNum - secondNum;
        int multiplication = firstNum * secondNum;
        int division = firstNum / secondNum;

        System.out.println("a + b = " + summa);
        System.out.println("a - b = " + subtraction);
        System.out.println("a * b = " + multiplication);
        System.out.println("a / b = " + division);
    }
}
