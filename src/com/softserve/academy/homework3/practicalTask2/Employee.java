package softserve.academy.homework3.practicalTask2;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int hours, int rate, String name) {
        this.hours = hours;
        this.rate = rate;
        this.name = name;
    }

    private double getSalary(){
        return rate * hours;
    }

    public int getBonuses(){
        return (int) (getSalary() * 1.1);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name ='" + name + '\'' +
                ", rate =" + rate +
                ", hours =" + hours +
                ", total salary = " + getBonuses() +
                '}';
    }
}
