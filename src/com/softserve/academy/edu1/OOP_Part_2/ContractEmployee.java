package com.softserve.academy.edu1.OOP_Part_2;

public class ContractEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, double hoursWorked, double hourlyRate, String federalTaxIdMember) {
        super(employeeId, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }
}