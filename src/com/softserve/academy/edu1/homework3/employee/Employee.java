package homework3.employee;

public class Employee {
    public static final double BONUS_RATE = 0.1;
    private String name;
    private double rate;
    private double hours;
    private static double totalSalary = 0.0;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        setHours(rate);
        setRate(hours);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        double oldSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();
        totalSalary += newSalary - oldSalary;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSalary += newSalary - oldSalary;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonus() {
        return getSalary() * BONUS_RATE;
    }

    public static double getTotalSalary() {
        return BONUS_RATE*totalSalary+totalSalary;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "name= " + name +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonus=" + getBonus();
    }
}
