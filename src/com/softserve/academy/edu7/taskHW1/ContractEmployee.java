package softserve.academy.edu7.taskHW1;

public class ContractEmployee extends Employee implements Payment {
    protected int contractFee;
    protected String federalTaxIdNumber;

    public ContractEmployee(String employeeId, int contractFee, String federalTaxIdNumber) {
        super(employeeId);
        this.contractFee = contractFee;
        this.federalTaxIdNumber = federalTaxIdNumber;
    }

    @Override
    public int calculatePay() {
        return contractFee;
    }

    @Override
    public String toString() {
        return employeeId +
                " | contract fee: " + contractFee +
                " | federal tax ID: " + federalTaxIdNumber +
                " | mothly wage: " + calculatePay();
    }

}
