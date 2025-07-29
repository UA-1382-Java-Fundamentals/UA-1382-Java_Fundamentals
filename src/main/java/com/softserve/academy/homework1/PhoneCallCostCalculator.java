package com.softserve.academy.homework1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost per minute of the call 1");
        int c1 = scanner.nextInt();
        System.out.println("Enter the cost per minute of the call 2");
        int c2 = scanner.nextInt();
        System.out.println("Enter the cost per minute of the call 3");
        int c3 = scanner.nextInt();
        System.out.println("Enter the duration of the call 1");
        int t1 = scanner.nextInt();
        System.out.println("Enter the duration of the call 2");
        int t2 = scanner.nextInt();
        System.out.println("Enter the duration of the call 3");
        int t3 = scanner.nextInt();

        int cost1 = c1 * t1;
        int cost2 = c2 * t2;
        int cost3 = c3 * t3;
        int totalCost = cost1 + cost2 + cost3;
        System.out.println("Cost 1 = " + cost1);
        System.out.println("Cost 2 = " + cost2);
        System.out.println("Cost 3 = " + cost3);
        System.out.println("Total cost = " + totalCost);
    }
}
