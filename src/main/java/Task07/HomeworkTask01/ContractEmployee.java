package Task07.HomeworkTask01;

public class ContractEmployee extends Employee implements Payment {

    private String federalTaxldmember;
    private int salary;

    public ContractEmployee(String employee, String federalTaxldmember, int salary) {
        super(employee);
        this.federalTaxldmember = federalTaxldmember;
        this.salary = salary;
    }

    public String getFederalTaxldmember() {
        return federalTaxldmember;
    }

    public void setFederalTaxldmember(String federalTaxldmember) {
        this.federalTaxldmember = federalTaxldmember;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int calculatePay() {
        return salary;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
        "Employee " + getEmployee() +
                "federalTaxldmember='" + federalTaxldmember + '\'' +
                ", salary=" + calculatePay() +
                '}';
    }
}
