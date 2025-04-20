package com.softserve.academy.edu1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double c1, c2, c3;
        double t1, t2, t3;

        System.out.print("Введіть вартість за 1 хвилину першого дзвінка: ");
        c1 = sc.nextDouble();

        System.out.print("Введіть тривалість першого дзвінка у хвилинах: ");
        t1 = sc.nextDouble();

        System.out.print("Введіть вартість за 1 хвилину другого дзвінка: ");
        c2 = sc.nextDouble();

        System.out.print("Введіть тривалість другого дзвінка у хвилинах: ");
        t2 = sc.nextDouble();

        System.out.print("Введіть вартість за 1 хвилину для третього дзвінка: ");
        c3 = sc.nextDouble();

        System.out.print("Введіть тривалість третього дзвінка у хвилинах: ");
        t3 = sc.nextDouble();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        double totalCost = cost1 + cost2 + cost3;

        System.out.printf("Вартість першого дзвінка: %.2f\n", cost1);
        System.out.printf("Вартість другого дзвінка: %.2f\n", cost2);
        System.out.printf("Вартість третього дзвінка: %.2f\n", cost3);
        System.out.printf("Загальна вартість всіх дзвінків: %.2f\n", totalCost);

        sc.close();
    }
}