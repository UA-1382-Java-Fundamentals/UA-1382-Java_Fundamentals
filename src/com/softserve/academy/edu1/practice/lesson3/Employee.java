package com.softserve.academy.edu1.practice.lesson3;

public class Employee {

    private String name;
    private double rate;
    private int hours;
    private static double totalSum;

    public Employee() {
        this.name = "";
        this.rate = 0;
        this.hours = 0;
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
        this.hours = 0;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return this.rate * this.hours;
    }

    public double getBonuses() {
        return getSalary() * 0.10;
    }

    public String toString() {
        return name + " rate=" + rate + ", hours=" + hours;
    }

    public static void addToTotalSum(double salary) {
        totalSum += salary;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Employee 1", 80, 45);
        Employee emp2 = new Employee("Employee 2", 100, 40);
        Employee emp3 = new Employee("Employee 3", 120, 35);

        System.out.print(emp1);
        System.out.println(", Salary: " + emp1.getSalary() + ", Bonuses: " + emp1.getBonuses());
        System.out.println();

        System.out.print(emp2);
        System.out.println(", Salary: " + emp2.getSalary() + ", Bonuses: " + emp2.getBonuses());
        System.out.println();

        System.out.print(emp3);
        System.out.println(", Salary: " + emp3.getSalary() + ", Bonuses: " + emp3.getBonuses());
        System.out.println();

        addToTotalSum(emp1.getSalary());
        addToTotalSum(emp2.getSalary());
        addToTotalSum(emp3.getSalary());

        System.out.println("Total salary of all employees: " + getTotalSum());
    }
}
