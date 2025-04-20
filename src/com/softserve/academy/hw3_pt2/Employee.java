package com.softserve.academy.hw3_pt2;

public class Employee {
    private final String name;
    private final int rate;
    private final int hours;
    private static double totalSum;

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    Employee() {
        name = "Default name";
        rate = 5;
        hours = 1;
    }

    Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    double getSalary() {
        return rate * hours;
    }

    static void toString(double value) {
        System.out.println("Total salary: " + value);
    }

    double getBonuses() {
        return getSalary() * 0.1;
    }

}
