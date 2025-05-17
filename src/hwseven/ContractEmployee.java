package hwseven;

class ContractEmployee extends Employee implements Payment {
    private double hourlyRate;
    private int hoursWorked;
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, double hourlyRate, int hoursWorked, String federalTaxIdMember) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

