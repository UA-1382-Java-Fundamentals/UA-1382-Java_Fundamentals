package com.softserve.academy.edu1.Hw5.Hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();
        MonthDays md = new MonthDays();
        try {
            System.out.println("Days in month: " + md.getDays(month));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Enter 10 integers:");
        int[] tenNums = new int[10];
        for (int i = 0; i < 10; i++) {
            tenNums[i] = scanner.nextInt();
        }
        ArrayProc ap = new ArrayProc();
        int result = ap.processArray(tenNums);
        System.out.println( result+"\n");//Result (sum/product)

        System.out.println("Enter 5 integers:");
        int[] fiveNums = new int[5];
        for (int i = 0; i < 5; i++) {
            fiveNums[i] = scanner.nextInt();
        }
        ArrayCheck aa = new ArrayCheck();

        int secondPosIndex = aa.findSecondPositivePosition(fiveNums);
        System.out.println("Second positive number index: " + (secondPosIndex != -1 ? secondPosIndex : "Not found"));

        int[] minData = aa.findMinAndPosition(fiveNums);
        System.out.println("Minimum value: " + minData[0] + ", at index: " + minData[1]);

        int evenProduct = aa.productOfEvenNonZero(fiveNums);
        System.out.println("Product of even non-zero numbers: " + evenProduct);

        scanner.close();
    }
}

