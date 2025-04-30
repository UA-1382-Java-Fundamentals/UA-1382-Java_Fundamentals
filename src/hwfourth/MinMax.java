package hwfourth;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = scan.nextInt();

        System.out.println("Enter second number:");
        int number2 = scan.nextInt();

        System.out.println("Enter third number:");
        int number3 = scan.nextInt();

        int maxNumber = number1;
        if (number2 > maxNumber) maxNumber = number2;
        if (number3> maxNumber) maxNumber = number3;

        int minNumber = number1;
        if (number2 < minNumber) minNumber = number2;
        if (number3 < minNumber) minNumber = number3;


        System.out.println("Max number is: " + maxNumber);
        System.out.println("Min number is: " + minNumber);

    }

}

