package com.softserve.academy.hw7_t1;

public class SalariedEmployee extends Employee implements Payment {
    int salaryForOneMonth;
    String socialSecurityNumber;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public SalariedEmployee(String employeeld, String employeeName, int salaryForOneMonth, String socialSecurityNumber) {
        super(employeeld, employeeName);
        this.salaryForOneMonth = salaryForOneMonth;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return salaryForOneMonth;
    }
}
