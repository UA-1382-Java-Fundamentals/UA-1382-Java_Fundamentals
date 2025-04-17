package com.softserve.academy.edu1;

import java.util.Scanner;

public class PhoneCallsCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost per minute C1");
        Double c1 = scanner.nextDouble();
        System.out.println("Enter the cost per minute C2");
        Double c2 = scanner.nextDouble();
        System.out.println("Enter the cost per minute C3");
        Double c3 = scanner.nextDouble();
        System.out.println("Enter the duration of the call T1");
        Double t1 = scanner.nextDouble();
        System.out.println("Enter the duration of the call T2");
        Double t2 = scanner.nextDouble();
        System.out.println("Enter the duration of the call T3");
        Double t3 = scanner.nextDouble();

        Double Cost1 = c1 * t1;
        Double Cost2 = c2 * t2;
        Double Cost3 = c3 * t3;

        System.out.println("The cost of each call:\nCost 1 = " + Cost1 +
                "\nCost 2 = " + Cost2 +
                "\nCost 3 = " + Cost3);
        Double totalCost = Cost1 + Cost2 + Cost3;
        System.out.println("Total cost = " + totalCost);
        scanner.close();
    }
}
