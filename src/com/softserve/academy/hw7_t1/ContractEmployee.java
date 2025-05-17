package com.softserve.academy.hw7_t1;

public class ContractEmployee extends Employee implements Payment {
    int oneHourPayment;
    int numberOfHoursWorkedInAMonth;
    String federalTaxId;

    public ContractEmployee(String empolyeeId, String employeeName, int oneHourPayment, int numberOfHoursWorkedInAMonth, String federalTaxId) {
        super(empolyeeId, employeeName);
        this.oneHourPayment = oneHourPayment;
        this.numberOfHoursWorkedInAMonth = numberOfHoursWorkedInAMonth;
        this.federalTaxId = federalTaxId;
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    @Override
    public int calculatePay() {
        return oneHourPayment * numberOfHoursWorkedInAMonth;
    }
}
