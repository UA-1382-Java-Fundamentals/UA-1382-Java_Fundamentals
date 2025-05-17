package com.softserve.academy.hw7_t1;

public class SalariedEmployee extends Employee implements Payment {
    int salaryForOneMonth;
    String socialSecurityNumber;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public SalariedEmployee(String employeeld, int salaryForOneMonth, String socialSecurityNumber) {
        super(employeeld);
        this.salaryForOneMonth = salaryForOneMonth;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return salaryForOneMonth;
    }
}
