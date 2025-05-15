package Task07.HomeworkTask01;

public class SalariedEmployee extends Employee implements Payment {

    private String socialSecurityNumber;
    private int hours;
    private int payForHour;

    public SalariedEmployee(String employee,String socialSecurityNumber, int hours, int payForHour) {
        super(employee);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hours = hours;
        this.payForHour = payForHour;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getPayForHour() {
        return payForHour;
    }

    public void setPayForHour(int payForHour) {
        this.payForHour = payForHour;
    }

    @Override
    public int calculatePay() {
        return payForHour * hours;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "Employee " + getEmployee() +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", hours=" + hours +
                ", payForHour=" + payForHour + " have PAY " + calculatePay() +
                '}';
    }
}
