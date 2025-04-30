package softserve.academy.edu1.hw7.taskHW1;

public class SalariedEmployee extends Employee implements Payment {
    protected int salary;
    protected int hours;
    protected String socialSecurityNumber;

    public SalariedEmployee(String employeeId, int salary, int hours, String socialSecurityNumber) {
        super(employeeId);
        this.salary = salary;
        this.hours = hours;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return hours * salary;
    }

    @Override
    public String toString() {
        return employeeId +
                " | Salary: " + salary +
                " | Hours: " + hours +
                " | SSN: " + socialSecurityNumber +
                " | mothly wage: " + calculatePay();
    }

}
