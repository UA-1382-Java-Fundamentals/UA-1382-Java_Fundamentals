package com.softserve.academy.edu01.homework;

import java.util.Scanner;

public class PhoneCallCostCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cost per minute of 1st call");
        double c1 = scan.nextDouble();
        System.out.println("Enter duration of 1st call (minutes,seconds e.g. 2,07)");
        double time1 = scan.nextDouble();
        int min1 = (int) time1;
        double sec1 = ((time1 - min1) * 60);
        double t1 = (min1 + sec1);
        System.out.println("Cost of 1st call: " + (c1 * t1) + "$\n");

        System.out.println("Enter cost per minute of 2nd call");
        double c2 = scan.nextDouble();
        System.out.println("Enter duration of 2nd call (minutes,seconds e.g. 2,07)");
        double time2 = scan.nextDouble();
        int min2 = (int) time2;
        double sec2 = ((time2 - min2) * 60);
        double t2 = (min2 + sec2);
        System.out.println("Cost of 2nd call: " + (c2 * t2) + "$\n");

        System.out.println("Enter cost per minute of 3rd call");
        double c3 = scan.nextDouble();
        System.out.println("Enter duration of 3rd call (minutes,seconds e.g. 2,07)");
        double time3 = scan.nextDouble();
        int min3 = (int) time3;
        double sec3 = ((time3 - min3) * 60);
        double t3 = (min3 + sec3);
        System.out.println("Cost of 3rd call: " + (c3 * t3) + "$\n");

        System.out.println("Total cost: " + (c1 * t1 + c2 * t2 + c3 * t3) + "$");
        scan.close();
    }
}
