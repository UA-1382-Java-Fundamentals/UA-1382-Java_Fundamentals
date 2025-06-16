package com.softserve.academy.edu1.HW4.Hw1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter three double numbers: ");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (arr[i] <= 5 && arr[i] >= -5) {
                System.out.println("The number in range is: " + arr[i]);
            }else{
                System.out.println("The number is out of range: " + arr[i]);
            }
        }
    }



}
