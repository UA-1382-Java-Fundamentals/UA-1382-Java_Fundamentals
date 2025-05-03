package com.softserve.academy.edu1.OOP_Part_2;

public class SalariedEmployee extends Employee {
    private double monthlySalary;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, double monthlySalary, String socialSecurityNumber) {
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}