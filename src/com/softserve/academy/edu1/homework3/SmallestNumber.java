package homework3;

import java.util.Scanner;

public class SmallestNumber {
    public static int smallestNumber(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter third number: ");
        int c = scanner.nextInt();
        scanner.close();

        System.out.println("The smallest number is: " + smallestNumber(a, b, c));
    }
    /* int temp;
     if (a > b) {
         temp = a;
         a = b;
         b = temp;
     }
     if (a > c) {
         temp = a;
         a = c;
         c = temp;
    }
     if (b > c) {
         temp = b;
         b = c;
         c = temp;
     */

}
