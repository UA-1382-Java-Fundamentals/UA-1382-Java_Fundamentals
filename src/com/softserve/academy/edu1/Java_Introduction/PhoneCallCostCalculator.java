package com.softserve.academy.edu1.Java_Introduction;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        double c1;
        double c2;
        double c3;
        double t1;
        double t2;
        double t3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the values for the cost per minute for three calls:");
        c1 = sc.nextDouble();
        c2 = sc.nextDouble();
        c3 = sc.nextDouble();
        System.out.println("Input your call durations in minutes for three calls:");
        t1 = sc.nextDouble();
        t2 = sc.nextDouble();
        t3 = sc.nextDouble();
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        double totalCost = cost1 + cost2 + cost3;
        System.out.printf("Cost for the first call: %.2f%n", cost1);
        System.out.printf("Cost for the second call: %.2f%n", cost2);
        System.out.printf("Cost for the third call: %.2f%n", cost3);
        System.out.printf("Your total cost is: %.2f%n", totalCost);
        sc.close();

    }
}
