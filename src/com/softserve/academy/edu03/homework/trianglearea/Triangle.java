package com.softserve.academy.edu03.homework.trianglearea;


import java.util.Scanner;

public class Triangle {
    private float a;
    private float b;
    private float c;

    public Triangle(){
    }

    public void setA() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input side a: ");
        float a = sc.nextFloat();
        if (a > 0) {
           this.a = a;
        } else {
            throw new IllegalArgumentException("The side of the triangle must be positive");
        }
    }
    public void setB() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input side b: ");
        float b = sc.nextFloat();
        if (b > 0) {
            this.b = b;
        } else {
            throw new IllegalArgumentException("The side of the triangle must be positive");
        }
    }
    public void setC() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input side c: ");
        float c = sc.nextFloat();
        if (c > 0) {
            this.c = c;
        } else {
            throw new IllegalArgumentException("The side of the triangle must be positive");
        }
    }

    public float calculateArea() {
        if (a + b > c && a + c > b && b + c > a) {
            float p = (a + b + c) / 2;
            return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            throw new IllegalArgumentException("Triangle does not exist");
        }
    }

}

