package com.softserve.academy.edu03.homework.smallestNumber;

import java.util.Scanner;

public class Number {
    private int a;
    private int b;
    private int c;

    public Number(){

    }

    public void setA(int a) {
        this.a = a;
    }

    public void inputA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int a = sc.nextInt();
        setA(a);
    }

    public void setB(int b) {
        this.b = b;
    }
    public void inputB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the second number: ");
        int b = sc.nextInt();
        setB(b);
    }

    public void setC(int c) {
        this.c = c;
    }

    public void inputC() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the third number: ");
        int c = sc.nextInt();
        setC(c);
    }

    public int smallestNumber(){
        int min = a;

        if (b < min){
            min = b;
        }

        if (c < min){
            min = c;
        }

        return min;
    }
}
