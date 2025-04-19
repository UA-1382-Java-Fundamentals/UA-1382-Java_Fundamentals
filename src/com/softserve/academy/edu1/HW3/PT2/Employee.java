package com.softserve.academy.edu1.HW3.PT2;

public class Employee {
    private final String name;
    private final double hours;
    private final double rate = 90;
    private final double bonus=0.1;

    private double salary;
    private double bonuses;

    private double totalSum;


    public Employee(String name, double hours) {
        this.name = name;
        this.hours = hours;
        System.out.println(toString());

    }


    public double getSalary(){
        this.salary= hours * rate;
        return salary;
    }

    public double getBonuses() {
        this.bonuses = getSalary()*bonus;
        return this.bonuses;
    }

    public  double getTotalSum() {
        this.totalSum = getSalary() + getBonuses();
        return totalSum;
    }

    public String getName() {
        return name;
    }
    public double getHours() {
        return hours;
    }

    public String toString() {
        return "Info about: "+getName() + "\nSalary without bonuses: " + getSalary() + "\nBonuses " + getBonuses() + "\nTotal salary: " + getTotalSum()+"\n";
    }

}
