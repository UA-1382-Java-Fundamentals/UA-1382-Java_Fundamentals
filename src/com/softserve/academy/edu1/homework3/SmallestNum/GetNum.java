package com.softserve.academy.edu1.homework3.SmallestNum;

import java.util.Scanner;

public class GetNum {
    public int getNum(String message){
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
         return sc.nextInt();
    }

    public int sortNum(int a, int b, int c){
        if (a < b && a < c) {
            return a;
        }else if (b < a && b < c) {
            return b;
        }else if (c < a && c < b) {
            return c;
        }else throw new IllegalArgumentException("The numbers are equal.");
    }
}
