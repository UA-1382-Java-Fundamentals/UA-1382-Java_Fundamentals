package softserve.academy.edu1.hw5.taskPractical2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number greater than 1: ");
        int num = sc.nextInt();
        while (num <= 1) {
            System.out.println("Invalid number! Enter a positive number greater than 1: ");
            num = sc.nextInt();
        }
        String message = "N/A";
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                message = "Number " + num + " is not a prime number.";
                break;
            }
            else {
                message = "Number " + num + " is a prime number.";
            }
        }
        System.out.println(message);
    }
}
