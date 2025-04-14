package com.softserve.academy.edu1.homework.hw01;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter cost per minute for call 1: ");
            double c1 = scanner.nextDouble();
            System.out.print("Enter cost per minute for call 2: ");
            double c2 = scanner.nextDouble();
            System.out.print("Enter cost per minute for call 3: ");
            double c3 = scanner.nextDouble();

            System.out.print("Enter duration (in minutes) for call 1: ");
            int t1 = scanner.nextInt();
            System.out.print("Enter duration (in minutes) for call 2: ");
            int t2 = scanner.nextInt();
            System.out.print("Enter duration (in minutes) for call 3: ");
            int t3 = scanner.nextInt();

            double cost1 = calculateCallCost(c1, t1);
            double cost2 = calculateCallCost(c2, t2);
            double cost3 = calculateCallCost(c3, t3);

            double totalCost = cost1 + cost2 + cost3;

            System.out.println("Cost of call 1: " + cost1);
            System.out.println("Cost of call 2: " + cost2);
            System.out.println("Cost of call 3: " + cost3);
            System.out.println("Total cost: " + totalCost);
        } catch (Exception ex) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }

    private static double calculateCallCost(double costPerMinute, int duration) {
        return costPerMinute * duration;
    }
}
