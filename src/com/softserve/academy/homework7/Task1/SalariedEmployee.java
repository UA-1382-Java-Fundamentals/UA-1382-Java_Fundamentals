package softserve.academy.homework7.Task1;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String name, String employeeId, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(name, employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}
