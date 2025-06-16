package com.softserve.academy.edu1.Hw7.Hw1;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;
    private double hourlyrate ;
    private double numberOfHoursWorked;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String socialSecurityNumber, double fixedMonthlyPayment) {

        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public SalariedEmployee(String employeeld, String name) {
        super(employeeld, name);
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }



    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

}
