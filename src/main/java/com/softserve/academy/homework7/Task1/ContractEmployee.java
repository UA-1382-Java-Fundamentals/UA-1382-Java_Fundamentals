package com.softserve.academy.homework7.Task1;

public class ContractEmployee extends Employee implements Payment{
    private String federalTaxIdMember;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, String employeeId, String federalTaxIdMember, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
