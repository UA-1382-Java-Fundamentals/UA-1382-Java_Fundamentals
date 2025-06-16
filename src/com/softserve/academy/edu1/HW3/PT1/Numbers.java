package com.softserve.academy.edu1.HW3.PT1;

import java.util.Scanner;

public class Numbers {
    private static double first;
    private static double second;

    private double total;
    private double average;
    private String prompt;



    public Numbers() {
        getNumbers();
        System.out.println("The sum is: "+sum());
        System.out.println("The average of "+getFirst()+" and "+getSecond()+" is "+average());
    }





    public double sum(){
        setTotal(first + second);
        return getTotal();
    }
    public double average(){
        setAverage(getTotal()/2);
        return getAverage();
    }

    static void getNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        first= sc.nextDouble();
        System.out.print("Enter second number: ");
        second= sc.nextDouble();
    }


    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public void setFirst(double first) {
        this.first = first;
    }
    public void setSecond(double second) {
        this.second = second;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getAverage() {
        return average;
    }
    public void setAverage(double average) {
        this.average = average;
    }
}
