package com.softserve.academy.edu1.homework1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost per minute of call: ");
        double c1 = sc.nextDouble();
        System.out.println("Enter the cost per minute of call: ");
        double c2 = sc.nextDouble();
        System.out.println("Enter the cost per minute of call: ");
        double c3 = sc.nextDouble();
        System.out.println("Enter the duration of call: ");
        double t1 = sc.nextDouble();
        System.out.println("Enter the duration of call: ");
        double t2 = sc.nextDouble();
        System.out.println("Enter the duration of call: ");
        double t3 = sc.nextDouble();
        sc.close();

        var cost1 = c1*t1;
        var cost2 = c2*t2;
        var cost3 = c3*t3;
        var total = cost1 + cost2 + cost3;

        System.out.println("Cost of the first call: " + cost1);
        System.out.println("Cost of the second call: " + cost2);
        System.out.println("Cost of the third call: " + cost3);
        System.out.println("Total cost: " + total);
    }
}
