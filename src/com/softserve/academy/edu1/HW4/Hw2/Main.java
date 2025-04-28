package com.softserve.academy.edu1.HW4.Hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a[] = new double[3];
        double min= a[0] ;
        double max= a[0] ;
        System.out.println("Enter three numbers: ");
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextDouble();
        }
        for (int i = 0; i < 3; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
        }}
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
    }

}
