package com.softserve.academy.hw1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        int c1;
        int c2;
        int c3;
        int t1;
        int t2;
        int t3;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the cost per minute of the call 1");
        c1 = input.nextInt();

        System.out.println("Enter the cost per minute of the call 2");
        c2 = input.nextInt();

        System.out.println("Enter the cost per minute of the call 3");
        c3 = input.nextInt();

        System.out.println("Enter the duration of the call 1");
        t1 = input.nextInt();

        System.out.println("Enter the duration of the call 2");
        t2 = input.nextInt();

        System.out.println("Enter the duration of the call 3");
        t3 = input.nextInt();

        int cost1 = c1 * t1;
        int cost2 = c2 * t2;
        int cost3 = c3 * t3;

        int totalCost = cost1 + cost2 + cost3;

        System.out.println("Cost 1: " + cost1);
        System.out.println("Cost 2: " + cost2);
        System.out.println("Cost 3: " + cost3);
        System.out.println("Total cost: " + totalCost);
    }
}
