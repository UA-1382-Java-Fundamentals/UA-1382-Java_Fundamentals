package com.softserve.academy.hw7_t1;

public class ContractEmployee extends Employee {
    private final int oneHourPayment;
    private final int numberOfHoursWorkedInAMonth;
    String federalTaxId;

    public ContractEmployee(String empolyeeId, String employeeName, int oneHourPayment, int numberOfHoursWorkedInAMonth, String federalTaxId) {
        super(empolyeeId, employeeName);
        this.oneHourPayment = oneHourPayment;
        this.numberOfHoursWorkedInAMonth = numberOfHoursWorkedInAMonth;
        this.federalTaxId = federalTaxId;
    }

    @Override
    public int calculatePay() {
        return oneHourPayment * numberOfHoursWorkedInAMonth;
    }

    @Override
    public String toString() {
        return super.toString() + "; Federal Tax ID: " + federalTaxId;
    }
}
